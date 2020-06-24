/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.file.model;

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

    public void showShoe(){
        System.out.println("* BRAND: " + brand);
        System.out.println("* COLOR: " + color);
        System.out.println("* SIZE: " + size);
        System.out.println("* ID: " + id);
    }
    
    @Override
    public String toString() {
        return brand + ";" + color + ";" + size + ";" + id;
    }
}

