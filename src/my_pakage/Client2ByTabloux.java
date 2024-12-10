
package my_pakage;

import java.awt.Color;


public class Client2ByTabloux extends javax.swing.JFrame {


    public Client2ByTabloux() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("CHOSE  YOUR  CAR\n");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(240, 20, 210, 20);

        jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sport Cars", "4*4 Cars", "Berline Cars", "2Port Cars", " " }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox1COMBO_ENTERD(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBox1COMBO_EXIT(evt);
            }
        });
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(30, 70, 110, 22);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 460));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1mouseEntered(evt);
                jPanel1mouseEntred1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1mouseExited(evt);
                jPanel1mouseExited1(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Historiqe");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Historiqe(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Contact");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contact(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Acount");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acount(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setText("LOG_OUT");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4logout_Exited(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4logOUT(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("RESERVATION");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservition(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(700, 0, 100, 460);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(210, 50, 270, 3);

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(530, 40, 160, 22);

        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Searche");
        jPanel3.add(jButton13);
        jButton13.setBounds(570, 70, 81, 27);

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mark", "Name", "Category", "anne", "kilometrage", "boite_vitese"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(40, 160, 630, 110);

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Searche With Pictuers");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client2PIctuers(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(250, 330, 180, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1COMBO_ENTERD(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1COMBO_ENTERD
        jComboBox1.setBackground(new java.awt.Color(0, 115, 135));
    }//GEN-LAST:event_jComboBox1COMBO_ENTERD

    private void jComboBox1COMBO_EXIT(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1COMBO_EXIT
        jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jComboBox1COMBO_EXIT

    private void jButton4logout_Exited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4logout_Exited

        jButton4.setBackground(Color.red);
        jButton4.setForeground(Color.white);
    }//GEN-LAST:event_jButton4logout_Exited

    private void jButton4logOUT(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4logOUT
        jButton4.setBackground(Color.black);
        jButton4.setForeground(Color.white);
    }//GEN-LAST:event_jButton4logOUT

    private void jPanel1mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1mouseEntered
        jPanel1.setBackground(new java.awt.Color(0, 115, 135));

    }//GEN-LAST:event_jPanel1mouseEntered

    private void jPanel1mouseEntred1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1mouseEntred1
        // Increase the width of jPanel1 when the mouse enters
        int newWidth = jPanel1.getWidth() + 30; // Increase width by 20px
        jPanel1.setBounds(jPanel1.getX(), jPanel1.getY(), newWidth, jPanel1.getHeight()); // Set new width
        jPanel1.revalidate();  // Revalidate the layout
        jPanel1.repaint();
    }//GEN-LAST:event_jPanel1mouseEntred1

    private void jPanel1mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1mouseExited
        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jPanel1mouseExited

    private void jPanel1mouseExited1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1mouseExited1
        // Restore the original width when the mouse exits
        int newWidth = jPanel1.getWidth() - 20; // Decrease width by 20px
        jPanel1.setBounds(jPanel1.getX(), jPanel1.getY(), newWidth, jPanel1.getHeight()); // Restore width
        jPanel1.revalidate();  // Revalidate the layout
        jPanel1.repaint();     // Repaint the panel to reflect the
    }//GEN-LAST:event_jPanel1mouseExited1

    private void Client2PIctuers(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client2PIctuers
        Client2 frame=new Client2();
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }//GEN-LAST:event_Client2PIctuers

    private void Historiqe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Historiqe
         Client3 frame=new Client3();
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
    }//GEN-LAST:event_Historiqe

    private void Acount(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acount
         Client frame=new Client();
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
    }//GEN-LAST:event_Acount

    private void Reservition(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservition
        // TODO add your handling code here:
         ClientReservition frame=new ClientReservition();
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
    }//GEN-LAST:event_Reservition

    private void Contact(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contact
        // TODO add your handling code here:
        // TODO add your handling code here:
         Contact frame=new Contact();
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
    }//GEN-LAST:event_Contact


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client2ByTabloux().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
