/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.User;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Controller.ControllerUser;
/**
 *
 * @author ASUS
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    ControllerUser controller = new ControllerUser(this);
    public LogIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of Sthis method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        usernameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        buatAkun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginBG.setBackground(new java.awt.Color(255, 239, 216));

        jLabel1.setBackground(new java.awt.Color(127, 70, 60));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 70, 60));
        jLabel1.setText("Selamat Datang");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/cat1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        LoginBtn.setBackground(new java.awt.Color(150, 113, 113));
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.setBorder(null);
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(127, 70, 60));
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(127, 70, 60));
        jLabel4.setText("Password");

        buatAkun.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        buatAkun.setForeground(new java.awt.Color(113, 70, 60));
        buatAkun.setText("Belum punya akun? Buat disini");
        buatAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buatAkunMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginBGLayout = new javax.swing.GroupLayout(loginBG);
        loginBG.setLayout(loginBGLayout);
        loginBGLayout.setHorizontalGroup(
            loginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBGLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 251, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBGLayout.createSequentialGroup()
                        .addGroup(loginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameInput)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBGLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(332, 332, 332))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBGLayout.createSequentialGroup()
                        .addGroup(loginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buatAkun)
                            .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(297, 297, 297))))
        );
        loginBGLayout.setVerticalGroup(
            loginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBGLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buatAkun)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        String usn = usernameInput.getText().toString();
        String pass = passwordInput.getText().toString();
        controller.loginUser(usn, pass);
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void buatAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buatAkunMouseClicked
        // TODO add your handling code here:
        dispose();
        new SignUp().setVisible(true);
    }//GEN-LAST:event_buatAkunMouseClicked

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel buatAkun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel loginBG;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables

    public String getPasswordInput() {
        return passwordInput.getText();
    }

    public void setPasswordInput(JPasswordField passwordInput) {
        this.passwordInput = passwordInput;
    }

    public String getUsernameInput() {
        return usernameInput.getText();
    }

    public void setUsernameInput(JTextField usernameInput) {
        this.usernameInput = usernameInput;
    }
}
