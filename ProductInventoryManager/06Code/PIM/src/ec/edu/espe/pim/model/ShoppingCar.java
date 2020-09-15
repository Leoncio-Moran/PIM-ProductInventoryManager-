/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.model;


public class ShoppingCar {
    

    private int quantity;
    private int code;
    private String description;
    private float price;

    public ShoppingCar(int quantity, int code, String product, float price) {
        this.quantity = quantity;
        this.code = code;
        this.description = product;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoppingCar{" + "quantity=" + quantity + ", code=" + code + ", product=" + description + ", price=" + price + '}';
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}

   