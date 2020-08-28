/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.model;


public class ShoppingCar {
    

    private int quantity;
    private int code;
    private String product;
    private float price;

    public ShoppingCar(int quantity, int code, String product, float price) {
        this.quantity = quantity;
        this.code = code;
        this.product = product;
        this.price = price;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "ShoppingCar{" + "quantity=" + quantity + ", code=" + code + ", product=" + product + ", price=" + price + '}';
    }

=======
        return "ShoppingCar{" + "quantity=" + quantity + ", product=" + product + ", price=" + price + '}';
    }
    
     
    
>>>>>>> c8345e324adb096f8f453d8ab8f4d83faed5950a
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

   