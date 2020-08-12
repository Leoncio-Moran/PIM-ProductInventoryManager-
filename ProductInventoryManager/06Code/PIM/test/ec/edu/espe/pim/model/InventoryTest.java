/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.model;

import ec.edu.espe.pim.controller.Shoes;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lesly
 */
public class InventoryTest {
    
    public InventoryTest() {
    }

    /**
     * Test of addProduct method, of class Inventory.
     */
    @Test
    public void testAddProduct() {
        Inventory inventory = new Inventory();
        int ID = 647839;
        int size = 34;
        String brand = "Vans";
        String color = "Pink";
        float price = 0.0F;
        String shoeType = "Sport";
        int stock = 2;
        inventory.addProduct(ID, size, brand, color, price, shoeType, stock);
       
    }

    @Test
    public void testShowProducts() {
        Inventory inventory = new Inventory();
        inventory.showProducts();

    }

    
}
