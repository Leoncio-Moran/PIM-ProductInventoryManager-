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
        return "ShoppingCar{" + "quantity=" + quantity + ", code=" + code + ", product=" + product + ", price=" + price + '}';
    }

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

   