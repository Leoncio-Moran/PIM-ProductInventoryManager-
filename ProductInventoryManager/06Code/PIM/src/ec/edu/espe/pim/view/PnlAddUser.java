/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.view;

import ec.edu.espe.pim.controller.UserActivity;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author S-Developers
 */
public class PnlAddUser extends javax.swing.JPanel {

    /**
     * Creates new form AddUser
     */
    public PnlAddUser() {
        initComponents();
        txtUser.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        PswPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        setMinimumSize(new java.awt.Dimension(690, 190));
        setPreferredSize(new java.awt.Dimension(550, 450));
        setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/adduser.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(270, 20, 150, 140);

        lblUserName.setBackground(new java.awt.Color(255, 255, 255));
        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Nombre de Usuario");
        lblUserName.setOpaque(true);
        add(lblUserName);
        lblUserName.setBounds(20, 180, 220, 40);

        lblPass.setBackground(new java.awt.Color(255, 255, 255));
        lblPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPass.setText("Contraseña");
        add(lblPass);
        lblPass.setBounds(20, 270, 130, 20);

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        add(txtUser);
        txtUser.setBounds(250, 180, 380, 40);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2);
        jSeparator2.setBounds(250, 220, 380, 20);

        PswPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PswPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PswPass.setToolTipText("Password");
        PswPass.setBorder(null);
        PswPass.setDropMode(javax.swing.DropMode.INSERT);
        add(PswPass);
        PswPass.setBounds(170, 250, 460, 40);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1);
        jSeparator1.setBounds(170, 290, 460, 20);

        btnAddUser.setBackground(new java.awt.Color(51, 102, 255));
        btnAddUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(51, 51, 51));
        btnAddUser.setText("Agregar nuevo usuario");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        add(btnAddUser);
        btnAddUser.setBounds(180, 340, 220, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z' && (c < 'Ñ') && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        UserActivity userActivity = new UserActivity();
        userActivity.addUser(txtUser.getText(), PswPass.getText());
        txtUser.setText("");
        PswPass.setText("");
        JOptionPane.showMessageDialog(null, "Guardado");
    }//GEN-LAST:event_btnAddUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PswPass;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
