/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.view;

import ec.edu.espe.pim.model.PairOfShoes;
import ec.edu.espe.pim.controller.Inventory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lesly
 */
public class PnlInventoryUser extends javax.swing.JPanel {
    private DefaultTableModel model;
    /**
     * Creates new form FrmInventoryUser
     */
    public PnlInventoryUser() {
        initComponents();
        ChargeInterface();
        ChargeData();
    }
    
     public void ChargeInterface(){
        String data[][]={};
        String column[]={"ID","SIZE","BRAND","COLOR","PRICE","TYPE","STOCK"};
        model=new DefaultTableModel(data,column);
        tblInventory.setModel(model);
        
    }
    public void ChargeData(){
        
        Inventory inventory = new Inventory();
        ArrayList<PairOfShoes> data = inventory.showProduct();
        DefaultTableModel model = (DefaultTableModel)this.tblInventory.getModel();
        int filas = 0;
            
        
        for(PairOfShoes shoe : data){
            Object [] fila = new Object [7];
            fila[0] = shoe.getId();
            fila[1] = shoe.getSize();
            fila[2] = shoe.getBrand();
            fila[3] = shoe.getColor();
            fila[4] = shoe.getPrice();
            fila[5] = shoe.getShoeType();
            fila[6] = shoe.getStock();
            model.addRow(fila);
            for(int i = 0;i<this.tblInventory.getColumnCount()-1;i++){
             model.setValueAt(fila[0] , filas, 0);
             model.setValueAt(fila[1], filas, 1);
             model.setValueAt(fila[2], filas, 2);
             model.setValueAt(fila[3], filas, 3);
             model.setValueAt(fila[4], filas, 4);
             model.setValueAt(fila[5], filas, 5);
             model.setValueAt(fila[6], filas, 6);
             
        }
           
            filas ++;
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(970, 650));
        setPreferredSize(new java.awt.Dimension(970, 650));
        setLayout(new java.awt.CardLayout());

        tblInventory = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblInventory.setMinimumSize(new java.awt.Dimension(970, 650));
        tblInventory.setPreferredSize(new java.awt.Dimension(970, 650));
        jScrollPane1.setViewportView(tblInventory);

        add(jScrollPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventory;
    // End of variables declaration//GEN-END:variables
}
