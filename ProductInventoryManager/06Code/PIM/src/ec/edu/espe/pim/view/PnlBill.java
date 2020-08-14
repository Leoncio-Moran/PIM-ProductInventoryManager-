/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.view;

import ec.edu.espe.pim.controller.Bill;
import ec.edu.espe.pim.controller.Inventory;
import ec.edu.espe.pim.controller.UserActivity;
import ec.edu.espe.pim.model.PairOfShoes;
import ec.edu.espe.pim.model.ShoppingCar;
import ec.edu.espe.pim.utils.JsonFileAdministrator;
import ec.edu.espe.pim.utils.Validator;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author S-Developers
 */
public class PnlBill extends javax.swing.JPanel {
    
    
    
    /**
     * Creates new form Bill
     */
    public PnlBill() {
        initComponents();
        ChargeInterface();
        ChargeData();
        //this.tblBill.setEnabled(false);
    }
   
    public void ChargeInterface(){
        DefaultTableModel model = (DefaultTableModel)this.tblBill.getModel();
        String data[][]={};
        String column[]={"Quanty","Product","Price"};
        model=new DefaultTableModel(data,column);
        tblBill.setModel(model);
        
    }
    
    public void ChargeData(){
        DefaultTableModel model = (DefaultTableModel)this.tblBill.getModel();
        UserActivity userActity = new UserActivity();
        ArrayList<ShoppingCar> data = userActity.extractCart();
        
        int filas = 0;
        int totalPrice = 0;
        
        for(ShoppingCar shoe : data){
            Object [] fila = new Object [3];
            fila[0] = shoe.getQuantity();
            fila[1] = shoe.getProduct();
            fila[2] = shoe.getPrice();
            
            model.addRow(fila);
            for(int i = 0;i<this.tblBill.getColumnCount()-1;i++){
             model.setValueAt(fila[0] , filas, 0);
             model.setValueAt(fila[1], filas, 1);
             model.setValueAt(fila[2], filas, 2);
                          
        }
            filas ++;
            
        }
        
        for(ShoppingCar shoes : data){
            totalPrice += shoes.getPrice();
        }
        
        this.lblPrice.setText("$" + String.valueOf(totalPrice));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtLastName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtTelephone = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblTotal = new javax.swing.JLabel();
        lblTelephoneClient = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        btnOk = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(970, 650));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(970, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLastName.setToolTipText("Enter Client's Last Name");
        txtLastName.setBorder(null);
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 200, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 200, 30));

        txtTelephone.setToolTipText("Enter Client's Telephone");
        txtTelephone.setBorder(null);
        txtTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneActionPerformed(evt);
            }
        });
        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelephoneKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 200, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 200, 30));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("Total:");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 60, 30));

        lblTelephoneClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTelephoneClient.setText("Telephone:");
        jPanel1.add(lblTelephoneClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        lblLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLastName.setText("Last Name:");
        jPanel1.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setText("Name:");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblId.setText("Id:");
        lblId.setToolTipText("");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        txtEmail.setToolTipText("Enter Client's Email");
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 200, 30));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("Email:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 200, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 200, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 200, 30));

        txtName.setToolTipText("Enter Client's Name");
        txtName.setBorder(null);
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 200, 30));

        txtId.setToolTipText("Enter Client's ID");
        txtId.setBorder(null);
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 200, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pqpqp.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblBill.setMinimumSize(new java.awt.Dimension(970, 650));
        tblBill.setPreferredSize(new java.awt.Dimension(970, 650));
        jScrollPane1.setViewportView(tblBill);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 610, 180));

        btnOk.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnOk.setText("Ok");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel1.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 80, 30));

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(153, 0, 0));
        lblPrice.setText("$");
        jPanel1.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 424, 80, 20));

        add(jPanel1, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z' && (c < 'Ñ') && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z' && (c < 'Ñ') && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtTelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephoneKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtTelephoneKeyTyped

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        JsonFileAdministrator tempFile = new JsonFileAdministrator();
        tempFile.eraseJson(ShoppingCar.class.getSimpleName());
        if (txtId.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, "", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!Validator.validateCI(txtId.getText())) {
            JOptionPane.showMessageDialog(
                    null, "Incorrect ID, try again", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
       JOptionPane.showMessageDialog(this,"Succesful purchase");
    }//GEN-LAST:event_btnOkMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTelephoneClient;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblBill;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
