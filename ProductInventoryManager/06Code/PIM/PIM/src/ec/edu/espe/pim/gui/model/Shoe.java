/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.gui.model;

/**
 *
 * @author S-Developers
 */
public class Shoe {
    private String id;
    private String brand;
    private String color;
    private String size;
    private String type;
    private String shoefor;

    public Shoe(String id, String brand,String color, String size, String type, String shoefor) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.type = type;
        this.shoefor = shoefor;
    }

    

    public String getShoefor() {
        return shoefor;
    }

    public void setShoefor(String shoefor) {
        this.shoefor = shoefor;
    }

    

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
