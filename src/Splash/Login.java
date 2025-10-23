
package Splash;

import Classes.Run;
import Classes.serverCredentials;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Frames.Main;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Notification;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import raven.glasspanepopup.GlassPanePopup;
import raven.toast.Notifications;




public class Login extends javax.swing.JFrame {
        
        private Main mainApp; 
        public String url= "localhost";
        public String user = "root";
        public String pass= "";
        Connection con = null;
        PreparedStatement pst;

  
// USED IF INPUTTING MY OWN SERVER CONNECTION        
//        public void forConnection(Connection conn, String serverIP,String userID ,String passwordID){
//        this.con = conn;
//        this.url = serverIP;
//        this.user = userID;
//        this.pass = passwordID;
//    }
        
        
        public void connection (){
         serverCredentials sv = new serverCredentials(url,user,pass);

      
         //MYSQL CODE-----------------------------------------------

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://"+sv.getServerIP() +"/likhangsining", sv.getUserID(), sv.getPassword());

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
            }
            //MYSQL CODE-----------------------------------------------

        }
    
   
        
    public Login() {
        initComponents();
        connection();
        
        mainApp = new Main(con);       // Create Main
        mainApp.setVisible(false);
        
        cacheloading();
        ImageIcon logo = new ImageIcon(getClass().getResource("/Images/smol icon.png"));
        setIconImage(logo.getImage());
        setTitle("Likhang Sining");
        setResizable(false);
        
        
        
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    password.requestFocusInWindow();
                }
            }
        });
        
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    LoginBT.doClick();
                }
            }
        });
        
        Notifications.getInstance().setJFrame(this);
        
        
    }
 
    
    

private void openMainApplicationFrame() {
    java.awt.EventQueue.invokeLater(() -> {
             // Keep it hidden for now
        new Splash.SplashScreen(null, true).setVisible(true);  // Show splash
        mainApp.setVisible(true);
    });
}


    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curvesPanel1 = new Splash.CurvesPanel();
        password = new SystemOtherComps.PH_PasswordField();
        username = new SystemOtherComps.PH_TextField();
        LoginBT = new SystemOtherComps.PH_Button();
        Cart_txt1 = new javax.swing.JLabel();
        Cart_txt2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        curvesPanel1.setBackground(new java.awt.Color(247, 235, 221));

        password.setForeground(new java.awt.Color(72, 53, 40));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setAA_TextHint("password");
        password.setAB_HintColor(new java.awt.Color(130, 96, 73));
        password.setAB_LineColor(new java.awt.Color(72, 53, 40));

        username.setForeground(new java.awt.Color(72, 53, 40));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setAA_TextHint("username");
        username.setAB_HintColor(new java.awt.Color(130, 96, 73));
        username.setAB_LineColor(new java.awt.Color(72, 53, 40));

        LoginBT.setBackground(new java.awt.Color(72, 53, 40));
        LoginBT.setForeground(new java.awt.Color(247, 235, 221));
        LoginBT.setText("Login");
        LoginBT.setAAA_ImageBoundArcSize(10);
        LoginBT.setAAA_roundBottomLeft(10);
        LoginBT.setAAA_roundBottomRight(10);
        LoginBT.setAAA_roundTopLeft(10);
        LoginBT.setAAA_roundTopRight(10);
        LoginBT.setAA_ArcSize(10);
        LoginBT.setAA_ButtonColor(new java.awt.Color(51, 51, 51));
        LoginBT.setAA_HoverColor(new java.awt.Color(153, 153, 153));
        LoginBT.setAA_PressColor(new java.awt.Color(93, 184, 105));
        LoginBT.setAA_RippleColor(new java.awt.Color(21, 135, 46));
        LoginBT.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        LoginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTActionPerformed(evt);
            }
        });

        Cart_txt1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Cart_txt1.setForeground(new java.awt.Color(72, 53, 40));
        Cart_txt1.setText("LIKHANG");

        Cart_txt2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        Cart_txt2.setForeground(new java.awt.Color(72, 53, 40));
        Cart_txt2.setText("SINING");

        javax.swing.GroupLayout curvesPanel1Layout = new javax.swing.GroupLayout(curvesPanel1);
        curvesPanel1.setLayout(curvesPanel1Layout);
        curvesPanel1Layout.setHorizontalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(LoginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Cart_txt1)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cart_txt2)
                .addGap(124, 124, 124))
        );
        curvesPanel1Layout.setVerticalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Cart_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cart_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(LoginBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTActionPerformed
        String enteredUsername = username.getText().trim();
        char[] enteredPasswordChars = password.getPassword();
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

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cart_txt1;
    private javax.swing.JLabel Cart_txt2;
    private SystemOtherComps.PH_Button LoginBT;
    private Splash.CurvesPanel curvesPanel1;
    private SystemOtherComps.PH_PasswordField password;
    private SystemOtherComps.PH_TextField username;
    // End of variables declaration//GEN-END:variables

        public void cacheloading() {
            JDialog loadingDialog = mainApp.createLoadingDialog();

            new Thread(() -> {
     
                SwingUtilities.invokeLater(() -> loadingDialog.setVisible(true));

                try {
                    mainApp.initProds(); // Run the heavy loading here
                } finally {
                    loadingDialog.dispose(); // Close loading popup after loading
                }

            }).start();
        }
    
    }



