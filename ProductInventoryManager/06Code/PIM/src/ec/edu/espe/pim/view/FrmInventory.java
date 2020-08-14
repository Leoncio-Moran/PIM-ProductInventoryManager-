/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.pim.controller.Inventory;
import ec.edu.espe.pim.model.Color;
import ec.edu.espe.pim.model.Shoe;
import ec.edu.espe.pim.model.Tipo;
//import static ec.edu.espe.pim.view.FrmInventory.container;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.search;

/**
 *
 * @author S-Developers
 */

public class FrmInventory extends javax.swing.JFrame {

    private int search;

    /**
     * Creates new form FrmInventory
     */
    private final String ruta = System.getProperties().getProperty("user.dir");
    public FrmInventory() {
        initComponents();
        this.setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        File archivo = null;
        FileReader FileR = null;
        BufferedReader BufferedR = null;
        String tiposJson = "";
        String forsJson = "";
        
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Color> fors = new ArrayList<>();
        
        Gson gson = new Gson();
        try {
            archivo = new File(ruta + "//type.json");
            //archivo = new File(ruta + "//for.json");
            
            FileR = new FileReader(archivo);
            BufferedR = new BufferedReader(FileR);
            String line;
            
            DefaultComboBoxModel tiposComboBox = new DefaultComboBoxModel();
            //DefaultComboBoxModel forsComboBox = new DefaultComboBoxModel();
            while ((line = BufferedR.readLine()) != null) {
            
                tiposJson = tiposJson + line;
                //forsJson = forsJson + line;
                
            }
            java.lang.reflect.Type tiposType = new TypeToken<ArrayList<Tipo>>() {}.getType();
            //java.lang.reflect.Type forsType = new TypeToken<ArrayList<For>>() {
           // }.getType();
            tipos = gson.fromJson(tiposJson, tiposType);
           // fors = gson.fromJson(forsJson,forsType);

            for (Tipo tipo : tipos) {
                tiposComboBox.addElement(tipo.getDescription());
            }
            //for (Color for1 : fors) {
             //   forsComboBox.addElement(for1.getDescription());
            //}
            cmbType.setModel(tiposComboBox);
            //cmbFor.setModel(forsComboBox);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btnDelete, e);
        } finally {
            try {
                if (null != FileR) {
                    FileR.close();
                }
            } catch (IOException e2) {
            }
            
        }
         try {
            //archivo = new File(ruta + "//type.json");
            archivo = new File(ruta + "//color.json");
            
            FileR = new FileReader(archivo);
            BufferedR = new BufferedReader(FileR);
            String line;
            
            //DefaultComboBoxModel tiposComboBox = new DefaultComboBoxModel();
            DefaultComboBoxModel forsComboBox = new DefaultComboBoxModel();
            while ((line = BufferedR.readLine()) != null) {
            
                //tiposJson = tiposJson + line;
                forsJson = forsJson + line;
                
            }
            //java.lang.reflect.Type tiposType = new TypeToken<ArrayList<Tipo>>() {}.getType();
            java.lang.reflect.Type forsType = new TypeToken<ArrayList<Color>>() {}.getType();
            //tipos = gson.fromJson(tiposJson, tiposType);
            fors = gson.fromJson(forsJson,forsType);

            //for (Tipo tipo : tipos) {
                //tiposComboBox.addElement(tipo.getDescription());
            //}
            for (Color for1 : fors) {
                forsComboBox.addElement(for1.getDescription());
            }
            //cmbType.setModel(tiposComboBox);
            cmbColor.setModel(forsComboBox);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(btnDelete, e);
        } finally {
            try {
                if (null != FileR) {
                    FileR.close();
                }
            } catch (IOException e2) {
            }
    }
        
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
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnShowInventory = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox<>();
        cmbType = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnStock = new javax.swing.JSpinner();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Californian FB", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Inventory  Management  of   Shoe  Store");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 400, -1));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, -1));

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        txtBrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBrandKeyTyped(evt);
            }
        });
        jPanel1.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, -1));

        jLabel2.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("BRAND:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("PRICE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, -1));

        txtSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSizeKeyTyped(evt);
            }
        });
        jPanel1.add(txtSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 30, -1));

        jLabel7.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("SIZE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pim/images/modify.png"))); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 120, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pim/images/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 100, 40));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pim/images/remove.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 100, 40));

        btnShowInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/pim/images/show.png"))); // NOI18N
        btnShowInventory.setText("Show Inventory");
        btnShowInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowInventoryActionPerformed(evt);
            }
        });
        jPanel1.add(btnShowInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, 40));

        jLabel9.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("COLOR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 50, 20));

        cmbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbColorActionPerformed(evt);
            }
        });
        jPanel1.add(cmbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 110, -1));

        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 110, -1));

        jLabel8.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("TYPE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("STOCK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        spnStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jPanel1.add(spnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        btnReturn.setText("Return");
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 110, 40));

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();

        int press=evt.getKeyChar();
        if(press==10){
            String idfind=txtId.getText().trim();
            Shoe a;
            /*for(int i=0; i<container.size();i++){
                a=(Shoe)container.get(i);
                if(idfind.equalsIgnoreCase(a.getId())){
                    txtBrand.setText(a.getBrand());
                    txtPrice.setText(a.getColor());
                    txtSize.setText(a.getSize());
                    cmbType.setSelectedItem(a.getType());
                    cmbColor.setSelectedItem(a.getShoefor());
                    search=i;
                    break;

                }
            }*/
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtBrandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A') | c>'Z' && (c<'Ñ') && c !=KeyEvent.VK_SPACE)  evt.consume();
    }//GEN-LAST:event_txtBrandKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtSizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSizeKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtSizeKeyTyped

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        String id=txtId.getText();
        String brand=txtBrand.getText();
        String color=txtPrice.getText();
        String size=txtSize.getText();
        String type=cmbType.getSelectedItem().toString();
        String shoefor=cmbColor.getSelectedItem().toString();

        Shoe a=new Shoe(id,brand,color,size,type,shoefor);
       // container.set(search, a);

        txtId.setText("");
        txtBrand.setText("");
        txtPrice.setText("");
        txtSize.setText("");
        cmbType.setSelectedItem("");
        cmbColor.setSelectedItem("");
        int i= JOptionPane.showConfirmDialog(this,"Are you sure you want to modify?");
        if ( i==0){
            JOptionPane.showMessageDialog(this,"The information has been modified");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Inventory inventory = new Inventory();
        inventory.addProduct(Integer.valueOf(txtId.getText()),
                (Integer.valueOf(txtSize.getText())),
                (txtBrand.getText()),
                (cmbColor.getSelectedItem().toString()),
                (Float.valueOf(txtPrice.getText())),
                (cmbType.getSelectedItem().toString()),
                (Integer)spnStock.getValue());
        
        System.out.println((Integer.valueOf(txtId.getText())+
                (Integer.valueOf(txtSize.getText()))+
                (txtBrand.getText())+
                (cmbColor.getSelectedItem().toString())+
                (Float.valueOf(txtPrice.getText()))+
                (cmbType.getSelectedItem().toString())+
                (Integer)spnStock.getValue()));
        JOptionPane.showMessageDialog(this,"The product are saved...");
        txtId.setText("");
        txtBrand.setText("");
        txtPrice.setText("");
        txtSize.setText("");
        cmbType.setSelectedItem("");
        cmbColor.setSelectedItem("");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //container.remove(search);
        txtId.setText("");
        txtBrand.setText("");
        txtPrice.setText("");
        txtSize.setText("");
        cmbType.setSelectedItem("");
        cmbColor.setSelectedItem("");
        JOptionPane.showMessageDialog(this,"Are you sure you want to delete this product?");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnShowInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowInventoryActionPerformed
        FrmData show=new FrmData();
        show.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnShowInventoryActionPerformed

    private void cmbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbColorActionPerformed

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTypeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        FrmMenuAdmin ad = new FrmMenuAdmin();
        ad.show();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        FrmMenuAdmin ad = new FrmMenuAdmin();
        ad.show();
    }//GEN-LAST:event_formWindowClosing

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        FrmMenuAdmin admin = new FrmMenuAdmin();
        admin.show();
        this.hide();
        this.setVisible(false);
        
    }//GEN-LAST:event_btnReturnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * Color details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowInventory;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spnStock;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
