/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.shoes.view;

import ec.edu.espe.shoes.model.Shoe;

/**
 *
 * @author Johao Morales
 */
public class ShoeView {
    private Shoe shoe;
    
    public ShoeView(Shoe shoe) {
        this.shoe = shoe;
    }
    
    public void display() {
        System.out.println("**************************");
        System.out.println("ID: " + shoe.getId());
        System.out.println("BRAND: " + shoe.getBrand());
        System.out.println("COLOR: " + shoe.getColor());
        System.out.println("SIZE: " + shoe.getSize());
        System.out.println("**************************");
    }
}
