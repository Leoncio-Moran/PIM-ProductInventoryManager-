/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.view;

import ec.edu.espe.pim.service.PaymentService;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author S-Developers
 */
public class FrmBill extends javax.swing.JFrame {
    
    
    public FrmBill() {
        initComponents();
               
    }

    /**
     * Creates new form FrmBill
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btmOk = new javax.swing.JButton();
        btmClear = new javax.swing.JButton();
        btmCancel = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblTelephoneClient = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblArticles = new javax.swing.JLabel();
        txtTypeOfPayment = new javax.swing.JLabel();
        cbxTypeOfPayment = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/shoesss.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BILL");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(970, 650));
        setPreferredSize(new java.awt.Dimension(970, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btmOk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmOk.setText("OK");
        btmOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmOkActionPerformed(evt);
            }
        });
        getContentPane().add(btmOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

        btmClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmClear.setText("Clear");
        btmClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmClearActionPerformed(evt);
            }
        });
        getContentPane().add(btmClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, -1, -1));

        btmCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmCancel.setText("Cancel");
        getContentPane().add(btmCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, -1, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setText("Name:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        lblLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLastName.setText("Last Name:");
        getContentPane().add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        lblID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID.setText("CI:");
        lblID.setToolTipText("");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        lblTelephoneClient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTelephoneClient.setText("Telephone:");
        getContentPane().add(lblTelephoneClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("Email:");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        txtEmail.setToolTipText("Enter Client's Email");
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 200, 30));

        txtTelephone.setToolTipText("Enter Client's Telephone");
        txtTelephone.setBorder(null);
        txtTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 200, 30));

        txtID.setToolTipText("Enter Client's ID");
        txtID.setBorder(null);
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 200, 30));

        txtLastName.setToolTipText("Enter Client's Last Name");
        txtLastName.setBorder(null);
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 200, 30));

        txtName.setToolTipText("Enter Client's Name");
        txtName.setBorder(null);
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 200, 30));

        lblArticles.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblArticles.setText("Articles:");
        getContentPane().add(lblArticles, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        txtTypeOfPayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTypeOfPayment.setText("Type Of Payment:");
        getContentPane().add(txtTypeOfPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        cbxTypeOfPayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxTypeOfPayment.setToolTipText("Enter Type Of Payment Method");
        cbxTypeOfPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTypeOfPaymentActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTypeOfPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 150, -1));

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal.setText("$");
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 150, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("Total:");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 60, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BRAND", "COLOR", "SIZE", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setMinimumSize(new java.awt.Dimension(970, 650));
        jTable1.setPreferredSize(new java.awt.Dimension(970, 650));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 480, 180));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 200, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 200, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 200, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 200, 30));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 200, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pqpqp.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTypeOfPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTypeOfPaymentActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbxTypeOfPaymentActionPerformed

    private void txtTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btmClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmClearActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtLastName.setText("");
        txtID.setText("");
        txtTelephone.setText("");
        txtEmail.setText("");
        
        txtTotal.setText("$ ");
    }//GEN-LAST:event_btmClearActionPerformed

    private void btmOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmOkActionPerformed
        // TODO add your handling code here:
        File frmBill;
        try{
            frmBill = new File("C:\\Users\\JOSUE\\Documents\\Bills\\Bill1.txt");
            if (frmBill.createNewFile()){
                System.out.println("Bill created!");
            }
                    
        }catch(IOException e){
            System.err.println("Error!!"+e);
        }
    }//GEN-LAST:event_btmOkActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCancel;
    private javax.swing.JButton btmClear;
    private javax.swing.JButton btmOk;
    private javax.swing.JComboBox<String> cbxTypeOfPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblArticles;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTelephoneClient;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel txtTypeOfPayment;
    // End of variables declaration//GEN-END:variables
}
