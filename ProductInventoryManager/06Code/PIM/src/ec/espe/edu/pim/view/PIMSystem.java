/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pim.view;

import ec.espe.edu.pim.model.InventoryStore;
import ec.espe.edu.pim.model.InventoryWarehouse;
import ec.espe.edu.pim.model.Order;
import ec.espe.edu.pim.model.PairOfShoes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PIMSystem {

    public static void main(String[] args) throws IOException {
       
        Menu menu = Menu.getInstance();
        
        InventoryStore inventoryStore = new InventoryStore(menu.initSystem("InventoryStore.csv"));
        InventoryWarehouse inventoryWarehouse = new InventoryWarehouse(menu.initSystem("InventoryWarehouse.csv"));
       
    }
}
