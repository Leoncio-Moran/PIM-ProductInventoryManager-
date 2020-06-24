package ec.edu.espe.shoes.model;

import java.io.Serializable;

/**
 *
 * @author Johao Morales
 */
public class Shoe implements Serializable{
    private String brand;
    private String color;
    private int size;
    private int id;

    public Shoe(String brand, String color, int size, int id) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return '"' + brand + "\",\"" + color + "\",\"" + size + "\",\"" + id + '"';
    }
}
