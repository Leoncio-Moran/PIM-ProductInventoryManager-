/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.model;


public class ShoppingCar {
    
<<<<<<< HEAD

=======
    private int id;
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
    private int quantity;
    private String product;
    private float price;

    public ShoppingCar(int quantity, String product, float price) {
        this.quantity = quantity;
        this.product = product;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoppingCar{" + "quantity=" + quantity + ", product=" + product + ", price=" + price + '}';
    }
    
<<<<<<< HEAD
     
=======
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
>>>>>>> ac6b33721e6a8b8b48a003e055f9f2de701c9298
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
    
}
