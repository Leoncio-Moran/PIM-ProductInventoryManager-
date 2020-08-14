/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.view;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.annotation.Resources;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.swing.ImageIconUIResource;

/**
 *
 * @author S-Developers
 */
public class FrmUserMenu extends javax.swing.JFrame {

    int x, y;
    
    /**
     * Creates new form User
     */
    public FrmUserMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPaneMenu.setSize(90, 700);
        PnlAbout pn = new PnlAbout();
        pn.setSize(JPrincipalPane.getWidth(), JPrincipalPane.getHeight());
        //pn.setLocation(5, 5);
        JPrincipalPane.removeAll();
        JPrincipalPane.add(pn);
        JPrincipalPane.revalidate();
        JPrincipalPane.repaint();
        Icon icon = lbllogo.getIcon();
        ImageIcon img = new ImageIcon("src/Resources/logo.jpg");
        this.lbllogo.setIcon(new ImageIcon(img.getImage().getScaledInstance(lbllogo.getWidth(), lbllogo.getHeight(), Image.SCALE_SMOOTH)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPaneMenu = new javax.swing.JPanel();
        btnMenu = new javax.swing.JLabel();
        btnInventory = new javax.swing.JPanel();
        lblBill = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblSell = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblInventory = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblReturn = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        UpperPane = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lbllogo = new javax.swing.JLabel();
        JPrincipalPane = new javax.swing.JPanel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(java.awt.SystemColor.controlDkShadow);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPaneMenu.setBackground(new java.awt.Color(0, 0, 0));
        jPaneMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPaneMenu.setPreferredSize(new java.awt.Dimension(260, 700));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/menu-abierto.png"))); // NOI18N
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        btnInventory.setBackground(new java.awt.Color(0, 0, 0));
        btnInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventoryMouseClicked(evt);
            }
        });
        btnInventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/inventario.png"))); // NOI18N
        lblBill.setToolTipText("Inventory");
        lblBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBillMouseEntered(evt);
            }
        });
        btnInventory.add(lblBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inventory");
        btnInventory.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 146, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/rebaja.png"))); // NOI18N
        lblSell.setToolTipText("Sell Product");
        lblSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSellMouseClicked(evt);
            }
        });
        jPanel4.add(lblSell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sell products");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 146, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/informacion.png"))); // NOI18N
        lblInfo.setToolTipText("Information");
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfoMouseClicked(evt);
            }
        });
        jPanel6.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Information");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 146, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cuenta_1.png"))); // NOI18N
        lblInventory.setToolTipText("Bill");
        lblInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInventoryMouseClicked(evt);
            }
        });
        jPanel5.add(lblInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bill");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 146, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("M E N U");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/salida.png"))); // NOI18N
        lblReturn.setToolTipText("Log out");
        lblReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReturnMouseClicked(evt);
            }
        });
        jPanel7.add(lblReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Log Out");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 146, -1));

        javax.swing.GroupLayout jPaneMenuLayout = new javax.swing.GroupLayout(jPaneMenu);
        jPaneMenu.setLayout(jPaneMenuLayout);
        jPaneMenuLayout.setHorizontalGroup(
            jPaneMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneMenuLayout.createSequentialGroup()
                .addGroup(jPaneMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPaneMenuLayout.setVerticalGroup(
            jPaneMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneMenuLayout.createSequentialGroup()
                .addGroup(jPaneMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnMenu))
                    .addGroup(jPaneMenuLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10)))
                .addGap(56, 56, 56)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPaneMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 700));

        UpperPane.setBackground(new java.awt.Color(255, 255, 255));
        UpperPane.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        UpperPane.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        UpperPane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                UpperPaneMouseDragged(evt);
            }
        });
        UpperPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpperPaneMouseClicked(evt);
            }
        });
        UpperPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setBackground(new java.awt.Color(51, 51, 51));
        lblClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        UpperPane.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, -1));

        lblMin.setBackground(new java.awt.Color(51, 51, 51));
        lblMin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin.setText("_");
        lblMin.setToolTipText("");
        lblMin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
        });
        UpperPane.add(lblMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 30, 20));

        lbllogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Logo.jpg"))); // NOI18N
        lbllogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UpperPane.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 310, 60));

        jPanel1.add(UpperPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 70));

        JPrincipalPane.setBackground(new java.awt.Color(255, 255, 255));
        JPrincipalPane.setAlignmentX(0.0F);
        JPrincipalPane.setAlignmentY(0.0F);
        JPrincipalPane.setLayout(new java.awt.CardLayout());
        jPanel1.add(JPrincipalPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 970, 630));

        getContentPane().add(jPanel1, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblMinMouseClicked

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        // TODO add your handling code here:
        
        int size = jPaneMenu.getWidth();
        if(size <= 90){
            Thread th = new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i = size ; i<=260 ; i++){
                        Thread.sleep(1);
                        jPaneMenu.setSize(i, 700);
                    }
                    }catch(InterruptedException e){
                        JOptionPane.showMessageDialog(null, e);
                    } 
                }  
            };th.start();
            
        }else{
            
            Thread th = new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i = size ; i >=90 ; i--){
                            Thread.sleep(1);
                            jPaneMenu.setSize(i, 700);
                        }                        
                    }catch(InterruptedException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    
                }
            };th.start();   
        }
        
    }//GEN-LAST:event_btnMenuMouseClicked

    private void UpperPaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpperPaneMouseDragged
        // TODO add your handling code here:
         this.setLocation(this.getLocation().x + evt.getX() - x,this.getLocation().y + evt.getY()- y);
    }//GEN-LAST:event_UpperPaneMouseDragged

    private void UpperPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpperPaneMouseClicked
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_UpperPaneMouseClicked

    private void btnInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventoryMouseClicked
        // TODO add your handling code here:
        FrmInventory pn = new FrmInventory();
        pn.setSize(JPrincipalPane.getWidth(), JPrincipalPane.getHeight());
        pn.setLocation(5, 5);
        JPrincipalPane.removeAll();
        JPrincipalPane.add(pn);
        JPrincipalPane.revalidate();
        JPrincipalPane.repaint();
    }//GEN-LAST:event_btnInventoryMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        PnlAbout pn = new PnlAbout();
        pn.setSize(JPrincipalPane.getWidth(), JPrincipalPane.getHeight());
        //pn.setLocation(5, 5);
        JPrincipalPane.removeAll();
        JPrincipalPane.add(pn);
        JPrincipalPane.revalidate();
        JPrincipalPane.repaint();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void lblSellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSellMouseClicked
        // TODO add your handling code here:
        PnlSellProduct pn = new PnlSellProduct();
<<<<<<< HEAD
        pn.setSize(JPrincipalPane.getWidth(), JPrincipalPane.getHeight());
        pn.setLocation(5, 5);
=======
       // pn.setSize(JPrincipalPane.getWidth(), JPrincipalPane.getHeight());
       // pn.setLocation(5, 5);
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
        JPrincipalPane.removeAll();
        JPrincipalPane.add(pn);
        JPrincipalPane.revalidate();
        JPrincipalPane.repaint();
    }//GEN-LAST:event_lblSellMouseClicked

    private void lblBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblBillMouseEntered

    private void lblReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReturnMouseClicked
        // TODO add your handling code here:
        FrmMainLogin frm = new FrmMainLogin();
        this.hide();
        frm.show();
    }//GEN-LAST:event_lblReturnMouseClicked

    private void lblInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInventoryMouseClicked
        // TODO add your handling code here:
        PnlBill pn = new PnlBill();
<<<<<<< HEAD
        //pn.setSize(JPrincipalPane.getWidth(), JPrincipalPane.getHeight());
        //pn.setLocation(5, 5);
=======
        pn.setSize(JPrincipalPane.getWidth(), JPrincipalPane.getHeight());
        pn.setLocation(5, 5);
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
        JPrincipalPane.removeAll();
        JPrincipalPane.add(pn);
        JPrincipalPane.revalidate();
        JPrincipalPane.repaint();
    }//GEN-LAST:event_lblInventoryMouseClicked

    private void lblBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillMouseClicked
        // TODO add your handling code here:
        PnlInventoryUser pn = new PnlInventoryUser();
        pn.setSize(JPrincipalPane.getWidth(), JPrincipalPane.getHeight());
        pn.setLocation(5, 5);
        JPrincipalPane.removeAll();
        JPrincipalPane.add(pn);
        JPrincipalPane.revalidate();
        JPrincipalPane.repaint();
    }//GEN-LAST:event_lblBillMouseClicked

    private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
        // TODO add your handling code here:
        PnlAbout pn = new PnlAbout();
        pn.setSize(JPrincipalPane.getWidth(), JPrincipalPane.getHeight());
        //pi.setLocation(5, 5);
        pn.setVisible(true);
        JPrincipalPane.removeAll();
        JPrincipalPane.add(pn);
        JPrincipalPane.revalidate();
        JPrincipalPane.repaint();
    }//GEN-LAST:event_lblInfoMouseClicked

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
            java.util.logging.Logger.getLogger(FrmUserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUserMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPrincipalPane;
    private javax.swing.JPanel UpperPane;
    private javax.swing.JPanel btnInventory;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPaneMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblBill;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInventory;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblReturn;
    private javax.swing.JLabel lblSell;
    private javax.swing.JLabel lbllogo;
    // End of variables declaration//GEN-END:variables
}
