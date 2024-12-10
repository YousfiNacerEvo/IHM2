
package my_pakage;

import java.awt.Color;


public class Client2 extends javax.swing.JFrame {

    
    public Client2() {
        initComponents();
        jPanel1.setLayout(null);
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
        jButton15 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("CHOSE  YOUR  CAR\n");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(260, 20, 210, 20);

        jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sport Cars", "4*4 Cars", "Berline Cars", "2Port Cars", " " }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COMBO_ENTERD(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COMBO_EXIT(evt);
            }
        });
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(30, 30, 110, 22);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 460));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Client2.this.mouseEntered(evt);
                mouseEntred1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Client2.this.mouseExited(evt);
                mouseExited1(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Historiqe");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                logout_Exited(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOUT(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setText("RESERVATION");
        jButton15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
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
            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(26, 26, 26)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(730, 0, 100, 460);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\IHM2\\\\src\\\\icon\\\\car__5___1_-removebg-preview.png")); // NOI18N
        jButton8.setBorder(null);
        jPanel3.add(jButton8);
        jButton8.setBounds(20, 120, 106, 50);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\eclipse-workspace\\IHM2\\src\\icon\\car__4___1_-removebg-preview.png")); // NOI18N
        jButton5.setBorder(null);
        jPanel3.add(jButton5);
        jButton5.setBounds(180, 90, 100, 100);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\IHM2\\\\src\\\\icon\\\\car__6___1_-removebg-preview.png")); // NOI18N
        jButton6.setBorder(null);
        jPanel3.add(jButton6);
        jButton6.setBounds(340, 90, 179, 107);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\IHM2\\\\src\\\\icon\\\\car__8___1_-removebg-preview.png")); // NOI18N
        jButton7.setBorder(null);
        jPanel3.add(jButton7);
        jButton7.setBounds(560, 90, 100, 100);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\IHM2\\\\src\\\\icon\\\\car-mockup__1_-removebg-preview (1).png")); // NOI18N
        jButton9.setBorder(null);
        jPanel3.add(jButton9);
        jButton9.setBounds(550, 220, 130, 90);

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setIcon(new javax.swing.ImageIcon("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\IHM2\\\\src\\\\icon\\\\car-mockup__2___1_-removebg-preview.png")); // NOI18N
        jButton10.setBorder(null);
        jPanel3.add(jButton10);
        jButton10.setBounds(350, 210, 170, 100);

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\IHM2\\\\src\\\\icon\\\\freepik__background__24550 (1) (1).png")); // NOI18N
        jButton11.setBorder(null);
        jPanel3.add(jButton11);
        jButton11.setBounds(190, 220, 100, 100);

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\IHM2\\\\src\\\\icon\\\\istockphoto-1307086567-1024x1024__1_-removebg-preview.png")); // NOI18N
        jButton12.setBorder(null);
        jPanel3.add(jButton12);
        jButton12.setBounds(20, 240, 110, 60);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setLabelFor(jButton8);
        jLabel2.setText("Nissan GTR");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 190, 72, 19);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("AUDI A8");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(200, 190, 60, 19);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mersides AMG");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(380, 190, 90, 19);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Mustang");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(590, 190, 60, 19);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("RANGE ROVER");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 320, 110, 19);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Mersides ClS");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(200, 320, 90, 19);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Skoda VRS");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(400, 320, 80, 19);

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ferari ");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(600, 320, 41, 19);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(220, 50, 270, 10);

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(550, 20, 160, 22);

        jButton13.setText("Searche");
        jPanel3.add(jButton13);
        jButton13.setBounds(590, 50, 81, 23);

        jButton14.setBackground(new java.awt.Color(0, 102, 102));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Searche With Table");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14Client2PIctuers(evt);
                Client21Tabel(evt);
            }
        });
        jPanel3.add(jButton14);
        jButton14.setBounds(250, 370, 180, 30);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
         jPanel1.setBackground(new java.awt.Color(0, 115, 135));
         
    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
         jPanel1.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_mouseExited

    private void mouseEntred1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntred1
          // Increase the width of jPanel1 when the mouse enters
        int newWidth = jPanel1.getWidth() + 30; // Increase width by 20px
        jPanel1.setBounds(jPanel1.getX(), jPanel1.getY(), newWidth, jPanel1.getHeight()); // Set new width
        jPanel1.revalidate();  // Revalidate the layout
        jPanel1.repaint(); 
    }//GEN-LAST:event_mouseEntred1

    private void mouseExited1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited1
           // Restore the original width when the mouse exits
             int newWidth = jPanel1.getWidth() - 20; // Decrease width by 20px
             jPanel1.setBounds(jPanel1.getX(), jPanel1.getY(), newWidth, jPanel1.getHeight()); // Restore width
             jPanel1.revalidate();  // Revalidate the layout
             jPanel1.repaint();     // Repaint the panel to reflect the
    }//GEN-LAST:event_mouseExited1

    
    private void logout_Exited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_Exited
        
        jButton4.setBackground(Color.red);
        jButton4.setForeground(Color.white);
    }//GEN-LAST:event_logout_Exited

    private void logOUT(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOUT
        jButton4.setBackground(Color.black);
        jButton4.setForeground(Color.white);
    }//GEN-LAST:event_logOUT

    private void COMBO_ENTERD(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMBO_ENTERD
        jComboBox1.setBackground(new java.awt.Color(0, 115, 135));
    }//GEN-LAST:event_COMBO_ENTERD

    private void COMBO_EXIT(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMBO_EXIT
         jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_COMBO_EXIT

    private void jButton14Client2PIctuers(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14Client2PIctuers
        Client2 frame=new Client2();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton14Client2PIctuers

    private void Client21Tabel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client21Tabel
        Client2ByTabloux frame= new Client2ByTabloux();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_Client21Tabel

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
