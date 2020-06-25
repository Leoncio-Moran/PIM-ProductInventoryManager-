/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pim.view;

import ec.espe.edu.pim.model.InventoryStore;
import ec.espe.edu.pim.model.Order;
import ec.espe.edu.pim.model.PairOfShoes;
import java.util.ArrayList;
import java.util.List;


public class PIMSystem {

    public static void main(String[] args) {
        //Menu menu = new Menu();
        //menu.menu();
        List<PairOfShoes> listPairOfShoeses = new ArrayList<>();
        
        PairOfShoes p2 = new PairOfShoes(20, 43, "black", "lacoste", 53.00F, "Sport");
        InventoryStore inventoryStore = InventoryStore.getInstance();
        inventoryStore.addPairOfShoes(p2);
   
        for (int i = 0; i < 10; i++) {
            inventoryStore.addPairOfShoes(new PairOfShoes(i+1, i+35, "white", "adidas", 35.00F, "Sport"));
        }
        
        inventoryStore.showPairsOfShoes();
        //System.out.println(inventoryStore.toString());
        
        Order order = new Order(listPairOfShoeses);
        //order.getListPairOfShoes().
    }
}
