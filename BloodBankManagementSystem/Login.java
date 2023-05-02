package BloodBankManagementSystem;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import java.util.prefs.Preferences;

public class Login extends javax.swing.JFrame {

    
    public Preferences pref = Preferences.userRoot().node("Remember");
    
    public Login() {
        initComponents();
        
        String usr = null;
        usr = pref.get("Username", usr);
        username.setText(usr);
        
        String pss = null;
        pss = pref.get("Password", pss);
        password.setText(pss);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        heading = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        user.setText("Username");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 314, 80, 30));

        username.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 314, 250, -1));

        pass.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        pass.setText("Password");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 384, -1, 30));

        password.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 384, 250, -1));

        heading.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        heading.setText("Login to Continue...");
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 224, -1, -1));

        loginBtn.setBackground(new java.awt.Color(51, 153, 0));
        loginBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 511, 110, 50));

        closeBtn.setBackground(new java.awt.Color(255, 51, 51));
        closeBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 511, 110, 50));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("BLOOD BANK");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        check.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        check.setText("Remember me");
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -200, 2070, 1110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to close application ? ", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        if(username.getText().equals("bbms") && password.getText().equals("admin")) {
            setVisible(false);
            new Home().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            new Login().setVisible(true);
        }
        
        
        if(check.isSelected()) {
            checked(true);
        }
        else { 
            checked(false);
        }

        this.dispose();
        
        
    }//GEN-LAST:event_loginBtnActionPerformed

    public void saveuser (String Username, String Password) {
        if (Username == null || Password == null) {
            JOptionPane.showMessageDialog(null, "Please enter Username or Password");
        }
        else {
            String user = Username;
            pref.put("Username", Username);
            String pass = Password;
            pref.put("Password", pass);
            
            
        }
    }
    
    public final void checked(boolean remember) {
        if (remember == true) {
            saveuser(username.getText(), password.getText());
        }
        else {
            System.out.println("null ");
        }
    }
    
    public static void main(String args[]) {
        
        System.out.println("App is running");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel user;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
