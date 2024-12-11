package my_pakage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class UserTable {

    public static void afficherUtilisateurs() {
        // Connexion à la base de données
        String url = "jdbc:mysql://localhost:3306/ihm";
        String utilisateur = "root";
        String motDePasseDB = "minecraft"; // Remplace par ton mot de passe MySQL

        String query = "SELECT * FROM utilisateur";

        // Déclaration des colonnes du tableau
        String[] columnNames = {"ID", "Nom", "Prénom", "Email", "Mot de passe", "Rôle", "Actions"};

        // Modèle de données pour JTable
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        try (Connection connection = DriverManager.getConnection(url, utilisateur, motDePasseDB);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            // Remplir le modèle avec les données
            while (resultSet.next()) {
                int id = resultSet.getInt("id_utilisateur");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                String email = resultSet.getString("email");
                String motPass = resultSet.getString("mot_de_passe");
                String role = resultSet.getString("role");

                // Ajouter une ligne au modèle
                Object[] row = {id, nom, prenom, email, motPass, role, "Supprimer"};
                tableModel.addRow(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                "Erreur lors de la récupération des données : " + e.getMessage(), 
                "Erreur", 
                JOptionPane.ERROR_MESSAGE);
        }

        // Créer un tableau
        JTable table = new JTable(tableModel);

        // Ajouter un bouton pour chaque ligne
        table.getColumn("Actions").setCellRenderer(new ButtonRenderer());
        table.getColumn("Actions").setCellEditor(new ButtonEditor(new JCheckBox(), tableModel, table));

        JScrollPane scrollPane = new JScrollPane(table);

        // Créer un bouton "Ajouter"
        JButton btnAjouter = new JButton("Ajouter");
        btnAjouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherFormulaireAjout(tableModel);
            }
        });

        JFrame frame = new JFrame("Liste des Utilisateurs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(btnAjouter, BorderLayout.SOUTH);
        frame.setSize(800, 400);
        frame.setVisible(true);
    }

    private static void afficherFormulaireAjout(DefaultTableModel tableModel) {
        // Créer un formulaire d'ajout avec des champs de texte pour le nom, prénom, email et mot de passe
        JPanel panel = new JPanel(new GridLayout(5, 2));
        JTextField txtNom = new JTextField();
        JTextField txtPrenom = new JTextField();
        JTextField txtEmail = new JTextField();
        JPasswordField txtMotDePasse = new JPasswordField();
        JTextField txtRole = new JTextField();

        panel.add(new JLabel("Nom:"));
        panel.add(txtNom);
        panel.add(new JLabel("Prénom:"));
        panel.add(txtPrenom);
        panel.add(new JLabel("Email:"));
        panel.add(txtEmail);
        panel.add(new JLabel("Mot de passe:"));
        panel.add(txtMotDePasse);
        panel.add(new JLabel("Rôle:"));
        panel.add(txtRole);

        int option = JOptionPane.showConfirmDialog(null, panel, "Ajouter un Utilisateur", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String nom = txtNom.getText();
            String prenom = txtPrenom.getText();
            String email = txtEmail.getText();
            String motDePasse = new String(txtMotDePasse.getPassword());
            String role = txtRole.getText();

            if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || motDePasse.isEmpty() || role.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Tous les champs doivent être remplis.", "Erreur", JOptionPane.ERROR_MESSAGE);
            } else {
                // Insertion dans la base de données
                if (ajouterUtilisateurBD(nom, prenom, email, motDePasse, role)) {
                    JOptionPane.showMessageDialog(null, "Utilisateur ajouté avec succès.");
                    // Mettre à jour le tableau après ajout
                    afficherUtilisateurs();
                } else {
                    JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout de l'utilisateur.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private static boolean ajouterUtilisateurBD(String nom, String prenom, String email, String motDePasse, String role) {
        String url = "jdbc:mysql://localhost:3306/ihm";
        String utilisateur = "root";
        String motDePasseDB = "minecraft";

        String insertQuery = "INSERT INTO utilisateur (nom, prenom, email, mot_de_passe, role) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, utilisateur, motDePasseDB);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, prenom);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, motDePasse);
            preparedStatement.setString(5, role);

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Méthode pour supprimer un utilisateur de la base de données
    private static void supprimerUtilisateurBD(int id) {
        String url = "jdbc:mysql://localhost:3306/ihm";
        String utilisateur = "root";
        String motDePasseDB = "minecraft";

        String deleteQuery = "DELETE FROM utilisateur WHERE id_utilisateur = ?";
        try (Connection connection = DriverManager.getConnection(url, utilisateur, motDePasseDB);
             PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erreur lors de la suppression : " + e.getMessage());
        }
    }

    // Renderer pour afficher les boutons
    static class ButtonRenderer extends JButton implements javax.swing.table.TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    // Editor pour gérer les clics sur les boutons
    static class ButtonEditor extends DefaultCellEditor {
        private JButton button;
        private String label;
        private boolean isPushed;
        private DefaultTableModel tableModel;
        private JTable table;

        public ButtonEditor(JCheckBox checkBox, DefaultTableModel tableModel, JTable table) {
            super(checkBox);
            this.tableModel = tableModel;
            this.table = table;
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                int selectedRow = table.getSelectedRow();
                int id = (int) tableModel.getValueAt(selectedRow, 0); // Supposant que l'ID est dans la première colonne
                supprimerUtilisateurBD(id);
                tableModel.removeRow(selectedRow);
                JOptionPane.showMessageDialog(button, "Utilisateur supprimé avec succès.");
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }

    public static void main(String[] args) {
        afficherUtilisateurs();
    }
}
