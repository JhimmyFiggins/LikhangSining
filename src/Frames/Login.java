/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;
import java.sql.*;
import javax.swing.JOptionPane;
import raven.toast.Notifications;



/**
 *
 * @author Anthony
 */
public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    private Connection con;
    private PreparedStatement pst;
    
    public Login() {
        initComponents();
        
        
    }
    
    private void openMainApplicationFrame() {
    // Example: open your main dashboard or frame
    new Main().setVisible(true); // replace MainFrame with your actual class
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pH_TextField1 = new SystemOtherComps.PH_TextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        pH_PasswordField1 = new SystemOtherComps.PH_PasswordField();
        jPanel7 = new javax.swing.JPanel();
        LoginBT = new SystemOtherComps.PH_Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 245, 234));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel1.setRequestFocusEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 245, 234));
        jPanel4.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(450, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 23, 25));
        jLabel1.setText("Log in");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(182, 182, 182))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 245, 234));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 100));

        pH_TextField1.setEditable(false);
        pH_TextField1.setBackground(new java.awt.Color(202, 196, 190));
        pH_TextField1.setBorder(null);
        pH_TextField1.setForeground(new java.awt.Color(143, 143, 143));
        pH_TextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pH_TextField1.setAAA_roundBottomLeft(50);
        pH_TextField1.setAAA_roundBottomRight(50);
        pH_TextField1.setAAA_roundTopLeft(50);
        pH_TextField1.setAAA_roundTopRight(50);
        pH_TextField1.setAA_BorderSize(2);
        pH_TextField1.setAA_DrawLine(false);
        pH_TextField1.setAA_TextHint("Username");
        pH_TextField1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        pH_TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pH_TextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(pH_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pH_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 245, 234));
        jPanel5.setPreferredSize(new java.awt.Dimension(450, 100));

        jPanel6.setBackground(new java.awt.Color(255, 245, 234));
        jPanel6.setPreferredSize(new java.awt.Dimension(350, 25));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(70, 70, 70));
        jCheckBox1.setText("Remember me");
        jCheckBox1.setAutoscrolls(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox1, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 70, 70));
        jLabel2.setText("Forget Password?");
        jPanel6.add(jLabel2, java.awt.BorderLayout.EAST);

        pH_PasswordField1.setBackground(new java.awt.Color(202, 196, 190));
        pH_PasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pH_PasswordField1.setAAA_roundBottomLeft(50);
        pH_PasswordField1.setAAA_roundBottomRight(50);
        pH_PasswordField1.setAAA_roundTopLeft(50);
        pH_PasswordField1.setAAA_roundTopRight(50);
        pH_PasswordField1.setAA_DrawLine(false);
        pH_PasswordField1.setAA_TextHint("Password");
        pH_PasswordField1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        pH_PasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pH_PasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pH_PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(pH_PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 245, 234));

        LoginBT.setBackground(new java.awt.Color(51, 51, 51));
        LoginBT.setForeground(new java.awt.Color(255, 255, 255));
        LoginBT.setText("Login In");
        LoginBT.setAAA_ImageBoundArcSize(50);
        LoginBT.setAAA_roundBottomLeft(50);
        LoginBT.setAAA_roundBottomRight(50);
        LoginBT.setAAA_roundTopLeft(50);
        LoginBT.setAAA_roundTopRight(50);
        LoginBT.setAA_ArcSize(50);
        LoginBT.setAA_ButtonColor(new java.awt.Color(51, 51, 51));
        LoginBT.setAA_HoverColor(new java.awt.Color(153, 153, 153));
        LoginBT.setAA_PressColor(new java.awt.Color(93, 184, 105));
        LoginBT.setAA_RippleColor(new java.awt.Color(21, 135, 46));
        LoginBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        LoginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(LoginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LoginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel2.setBackground(new java.awt.Color(255, 245, 234));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGIN.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pH_TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pH_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pH_TextField1ActionPerformed

    private void pH_PasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pH_PasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pH_PasswordField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void LoginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTActionPerformed
        String enteredUsername = pH_TextField1.getText().trim();
        char[] enteredPasswordChars = pH_PasswordField1.getPassword();
        String enteredPassword = new String(enteredPasswordChars);

        // Empty field check
        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Username or password cannot be empty.");
            return;
        }

        String sqlQuery = "SELECT username, password FROM login WHERE id=1";
        try {
            pst = con.prepareStatement(sqlQuery);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String usernameDB = rs.getString("username");
                String passwordDB = rs.getString("password");

                if (!enteredUsername.equals(usernameDB)|| !enteredPassword.equals(passwordDB)) {
                    Notifications.getInstance().show(Notifications.Type.ERROR, "Incorrect username or password");
                } else {
                    // Successful login
                    //forConnection(con, url, user, pass);
                    openMainApplicationFrame();
                    setVisible(false);

                }
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, "User not found in the database.");
            }

            rs.close();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_LoginBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SystemOtherComps.PH_Button LoginBT;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private SystemOtherComps.PH_PasswordField pH_PasswordField1;
    private SystemOtherComps.PH_TextField pH_TextField1;
    // End of variables declaration//GEN-END:variables
}
