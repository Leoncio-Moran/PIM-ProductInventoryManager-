/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.view;

<<<<<<< HEAD
import ec.edu.espe.pim.controller.Inventory;
import ec.edu.espe.pim.controller.UserActivity;
import javax.swing.JOptionPane;

=======
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
/**
 *
 * @author lesly
 */
public class PnlProduct extends javax.swing.JPanel {
<<<<<<< HEAD
    
    int idShoes;
    int stockShoes;
    
=======

>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
    /**
     * Creates new form Product
     */
    public PnlProduct() {
        initComponents();
    }
    
<<<<<<< HEAD
    
    public PnlProduct(int ID, String brand, String type,
            int size, String color, float price,int stocks){
        initComponents();
        this.idShoes = ID;
        this.stockShoes = stocks;
=======
    public PnlProduct(int ID, String brand, String type,
            int size, String color, float price){
        initComponents();
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
        this.id.setText(String.valueOf(ID));
        this.brand.setText(brand);
        this.ShoeType1.setText(type);
        this.size.setText(String.valueOf(size));
        this.color1.setText(color);
<<<<<<< HEAD
        this.price.setText("$" + String.valueOf(price));
        this.stock.setText(String.valueOf(stocks));
=======
        this.price.setText(String.valueOf(price));
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblID2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBrand = new javax.swing.JLabel();
        lblShoeType = new javax.swing.JLabel();
        lblID3 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        brand = new javax.swing.JLabel();
        size = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
<<<<<<< HEAD
        btnBuy = new javax.swing.JButton();
        ShoeType1 = new javax.swing.JLabel();
        color1 = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        stock = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(272, 165));
        setMinimumSize(new java.awt.Dimension(272, 165));
        setPreferredSize(new java.awt.Dimension(272, 165));
=======
        jButton1 = new javax.swing.JButton();
        ShoeType1 = new javax.swing.JLabel();
        color1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(276, 186));
        setMinimumSize(new java.awt.Dimension(276, 186));
        setPreferredSize(new java.awt.Dimension(276, 162));
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(lblID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
<<<<<<< HEAD
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(272, 165));
        jPanel1.setMinimumSize(new java.awt.Dimension(272, 165));
        jPanel1.setPreferredSize(new java.awt.Dimension(272, 165));
=======
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(276, 186));
        jPanel1.setMinimumSize(new java.awt.Dimension(276, 186));
        jPanel1.setPreferredSize(new java.awt.Dimension(276, 162));
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBrand.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(0, 51, 153));
        lblBrand.setText("BRAND:");
<<<<<<< HEAD
        jPanel1.add(lblBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
=======
        jPanel1.add(lblBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298

        lblShoeType.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblShoeType.setForeground(new java.awt.Color(0, 51, 153));
        lblShoeType.setText("Type:");
<<<<<<< HEAD
        jPanel1.add(lblShoeType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
=======
        jPanel1.add(lblShoeType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298

        lblID3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblID3.setForeground(new java.awt.Color(0, 51, 153));
        lblID3.setText("ID:");
<<<<<<< HEAD
        jPanel1.add(lblID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        id.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        id.setText("ID:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        brand.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        brand.setText("BRAND:");
        jPanel1.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        size.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        size.setText("size:");
        jPanel1.add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));
=======
        jPanel1.add(lblID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        id.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        id.setText("ID:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        brand.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        brand.setText("BRAND:");
        jPanel1.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        size.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        size.setText("size:");
        jPanel1.add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298

        lblSize.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblSize.setForeground(new java.awt.Color(0, 51, 153));
        lblSize.setText("Size: ");
<<<<<<< HEAD
        jPanel1.add(lblSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, 20));
=======
        jPanel1.add(lblSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298

        lblColor.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblColor.setForeground(new java.awt.Color(0, 51, 153));
        lblColor.setText("Color");
<<<<<<< HEAD
        jPanel1.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        price.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        price.setForeground(new java.awt.Color(153, 0, 0));
        price.setText("$price");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, 20));

        btnBuy.setBackground(new java.awt.Color(0, 0, 51));
        btnBuy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuy.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy.setText("Buy");
        btnBuy.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 30));

        ShoeType1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ShoeType1.setText("ShoeType:");
        jPanel1.add(ShoeType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        color1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        color1.setText("color:");
        jPanel1.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 20));

        lblStock.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblStock.setForeground(new java.awt.Color(0, 51, 153));
        lblStock.setText("Stock");
        jPanel1.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        stock.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        stock.setText("stock");
        jPanel1.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        UserActivity activity = new UserActivity();
        Inventory inventoy = new Inventory();
        int newStock;
        int quanty;
        try{
            quanty = Integer.valueOf(JOptionPane.showInputDialog("How many pairs of shoes are you going to sell?"));
            if(! ( this.stockShoes >= quanty) ){
                JOptionPane.showMessageDialog(null, "Insufficient quantity...","E R R O R",JOptionPane.ERROR_MESSAGE);
            }else{
                activity.addToCart(this.idShoes, quanty);
                inventoy.discount(inventoy.showProduct(), this.idShoes , quanty);
                newStock = stockShoes - quanty;
                this.stock.setText(String.valueOf( newStock ));
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Input only a number");
        }
         
        //new PnlBill().setVisible(true);
    }//GEN-LAST:event_btnBuyActionPerformed
=======
        jPanel1.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        price.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        price.setForeground(new java.awt.Color(153, 0, 0));
        price.setText("price");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buy");
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, 30));

        ShoeType1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ShoeType1.setText("ShoeType:");
        jPanel1.add(ShoeType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        color1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        color1.setText("color:");
        jPanel1.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ShoeType1;
    private javax.swing.JLabel brand;
<<<<<<< HEAD
    private javax.swing.JButton btnBuy;
    private javax.swing.JLabel color1;
    private javax.swing.JLabel id;
=======
    private javax.swing.JLabel color1;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblID3;
    private javax.swing.JLabel lblShoeType;
    private javax.swing.JLabel lblSize;
<<<<<<< HEAD
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel price;
    private javax.swing.JLabel size;
    private javax.swing.JLabel stock;
=======
    private javax.swing.JLabel price;
    private javax.swing.JLabel size;
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
    // End of variables declaration//GEN-END:variables
}
