/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.view;

import com.google.gson.Gson;
import com.sun.awt.AWTUtilities;
import ec.edu.espe.pim.controller.SignIn;
import ec.edu.espe.pim.controller.UserActivity;
import ec.edu.espe.pim.model.FileUsers;
import ec.edu.espe.pim.model.Users;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author S-Developers
 */
public class FrmMainLogin extends javax.swing.JFrame {

    int x, y;
    /**
     * Creates new form main
     */
    private final String ruta = System.getProperties().getProperty("user.dir");

    public FrmMainLogin() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, true);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelBackground = new javax.swing.JPanel();
        jUser = new javax.swing.JLabel();
        jUser1 = new javax.swing.JLabel();
        jTxtUser = new javax.swing.JTextField();
        jbtnLoging = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        pswPass = new javax.swing.JPasswordField();
        lblClose1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 102, 255));
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        JPanelBackground.setBackground(new java.awt.Color(51, 51, 51));
        JPanelBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JPanelBackgroundMouseDragged(evt);
            }
        });
        JPanelBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPanelBackgroundMouseClicked(evt);
            }
        });
        JPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUser.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUser.setText("Password:");
        JPanelBackground.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 40));

        jUser1.setBackground(new java.awt.Color(0, 0, 0));
        jUser1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUser1.setText("User name:");
        JPanelBackground.add(jUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 40));

        jTxtUser.setBackground(new java.awt.Color(51, 51, 51));
        jTxtUser.setForeground(new java.awt.Color(255, 255, 255));
        jTxtUser.setBorder(null);
        jTxtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtUserKeyTyped(evt);
            }
        });
        JPanelBackground.add(jTxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 320, 40));

        jbtnLoging.setBackground(new java.awt.Color(153, 255, 153));
        jbtnLoging.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnLoging.setText("Login");
        jbtnLoging.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnLogingMouseClicked(evt);
            }
        });
        jbtnLoging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogingActionPerformed(evt);
            }
        });
        JPanelBackground.add(jbtnLoging, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 100, 40));

        lblClose.setBackground(new java.awt.Color(51, 51, 51));
        lblClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("_");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        JPanelBackground.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, -10, 30, 30));

        pswPass.setBackground(new java.awt.Color(51, 51, 51));
        pswPass.setForeground(new java.awt.Color(255, 255, 255));
        pswPass.setBorder(null);
        JPanelBackground.add(pswPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 320, 40));

        lblClose1.setBackground(new java.awt.Color(255, 255, 255));
        lblClose1.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        lblClose1.setForeground(new java.awt.Color(255, 255, 255));
        lblClose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose1.setText("X");
        lblClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose1MouseClicked(evt);
            }
        });
        JPanelBackground.add(lblClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 20, 30));
        JPanelBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/IconLogin.png"))); // NOI18N
        JPanelBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 590, 430));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCT INVENTORY MANAGER");
        JPanelBackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        getContentPane().add(JPanelBackground);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPanelBackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelBackgroundMouseDragged

        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);

    }//GEN-LAST:event_JPanelBackgroundMouseDragged

    private void JPanelBackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelBackgroundMouseClicked

        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_JPanelBackgroundMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void jbtnLogingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnLogingMouseClicked

        /*FrmMenuAdmin window = new FrmMenuAdmin();
        FrmUserMenu frmUser = new FrmUserMenu();
        if("Admin".equals(jTxtUser.getText()) && "root".equals(pswPass.getText())){
            this.hide();
            window.show();
        }else{
            this.hide();
            frmUser.show();
        }*/

    }//GEN-LAST:event_jbtnLogingMouseClicked

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked

        System.exit(0);
    }//GEN-LAST:event_lblClose1MouseClicked

    private void jTxtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtUserKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z' && (c < 'Ñ') && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }

    }//GEN-LAST:event_jTxtUserKeyTyped

    private void jbtnLogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogingActionPerformed
        
        FrmMenuAdmin frmMenuAdmin = new FrmMenuAdmin();
        FrmUserMenu frmMenuOption = new FrmUserMenu();
        SignIn sigIn = new SignIn();
        int flag;

        if ("Admin".equals(jTxtUser.getText()) && "shoePIM".equals(pswPass.getText())) {
            frmMenuAdmin.setVisible(true);
            dispose();
        } else {
            flag = sigIn.signInUser(jTxtUser.getText(), pswPass.getText());
            if (flag == 1) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "ACESS !!!");
                frmMenuOption.setVisible(true);
                dispose();
            } else if (flag == 2 || flag == 3) {
                JOptionPane.showMessageDialog(null, "INCORRECT USER or PASSWORD!!! ");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        }

    }

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        /*TODO add your handling code here:
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader fileReader = new FileReader("user.json");
            jsonArray = (JSONArray) jsonParser.parse(fileReader);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR!!");
        }

        jsonObject.put("USERNAME", jTxtUser.getText());
        jsonObject.put("PASSWORD", pswPass.getText());
        jsonArray.add(jsonObject);
        try {
            FileWriter fileWriter = new FileWriter("user.json");
            fileWriter.write(jsonArray.toJSONString());
            fileWriter.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR!!");

        }
        JOptionPane.showMessageDialog(null, "SAVED");*/


    }//GEN-LAST:event_jbtnLogingActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTxtUser;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel jUser1;
    private javax.swing.JButton jbtnLoging;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JPasswordField pswPass;
    // End of variables declaration//GEN-END:variables
}
