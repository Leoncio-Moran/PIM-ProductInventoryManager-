/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pim.view;

import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.espe.edu.pim.model.InventoryStore;
import ec.espe.edu.pim.model.InventoryWarehouse;
import ec.espe.edu.pim.model.Order;
import ec.espe.edu.pim.model.PairOfShoes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
    InventoryStore inventoryStore = InventoryStore.getInstance();
    InventoryWarehouse inventoryWarehouse = new InventoryWarehouse();
    
     public void menu() {
        Scanner i = new Scanner(System.in);
        int idOfShoes;
        try {
            int option;
            do {
                System.out.println("*******PIM(Product Inventory Manager)*******");
                System.out.println("1. Purchase");
                System.out.println("2. Review Inventory");
                System.out.println("3. Exit");
<<<<<<< HEAD
                System.out.println("Select your option: ");
=======
                System.out.println("Select your option:");
>>>>>>> 4d2748f388299c95ed9bfbf352bdb1cd2d3c1b13
                option = i.nextInt();
                switch (option) {
                    case 1:
                        try {
                            int selectOption;
                            do {
                                System.out.println("1. Add Order Pair of shoe's ");
                                System.out.println("2. Delete Order Pair of Shoe's");
                                System.out.println("3. Cancel");
                                System.out.println("Select your option: ");
                                selectOption = i.nextInt();
                                switch (selectOption) {
                                    case 1:
<<<<<<< HEAD
                                        System.out.println("Entry Pair of Shoe's Id999");
=======
                                        System.out.println("Entry Pair of Shoe's Id: ");
>>>>>>> 4d2748f388299c95ed9bfbf352bdb1cd2d3c1b13
                                        idOfShoes = i.nextInt();
                                        createOrder(idOfShoes);
                                    case 2:
                                        System.out.println("Entry Pair of Shoe's Id: ");
                                        idOfShoes = i.nextInt();
                                        
                                        System.out.println("Deleting...");
                                    //TODO code to deleting...
                                    case 3:
                                        System.out.println("");
                                        menu();
                                }
                            } while ((selectOption <= 3) && (selectOption > 0));
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    case 2:
                        System.out.println();
                    case 3:
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
            } while (option != 3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     
    public void createOrder(int id){
    
        List<PairOfShoes> listShoes = new ArrayList<>();
        for  (PairOfShoes p : listShoes){
            listShoes.add(inventoryStore.getPairOfShoesById(id));
        }
        Order order = new Order(listShoes);
    }
    
    public void initSystem() throws IOException{
        inventoryStore.
        getRecordFile();
    }
    
    private Inventory getRecordFile() throws IOException{
        List<String>listTemporal = new ArrayList<>();
        FileManager fileManager = FileManager.getInstance();
        listTemporal = (fileManager.read("Inventory Store File.csv"));
    }
}

