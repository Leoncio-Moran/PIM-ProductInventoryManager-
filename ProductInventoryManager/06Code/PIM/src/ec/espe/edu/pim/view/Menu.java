/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pim.view;

import ec.espe.edu.pim.model.InventoryStore;
import java.util.Scanner;

public class Menu {
     public void menu() {
        Scanner i = new Scanner(System.in);
        int Id;
        try {
            int option;
            do {
                System.out.println("           PIM (Product Inventory Manager)");
                System.out.println("1. Purchase");
                System.out.println("2. Review Inventory");
                System.out.println("3. Exit");
                option = i.nextInt();
                switch (option) {
                    case 1:
                        try {
                            int selectOption;
                            do {
                                System.out.println("1. Add Order Pair of shoe's ");
                                System.out.println("2. Delete Order Pair of Shoe's");
                                System.out.println("3. Cancel");
                                selectOption = i.nextInt();
                                switch (selectOption) {
                                    case 1:
                                        System.out.println("Entry Pair of Shoe's Id");
                                        Id = i.nextInt();
                                    case 2:
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
}

