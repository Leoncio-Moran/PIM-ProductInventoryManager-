/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;


import ec.edu.espe.pim.model.FileAdministrator;
import ec.edu.espe.pim.model.Inventory;
import ec.edu.espe.pim.utils.Encryption;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexandra Moscoso
 */
public class SignIn {

    private String userName;
    private String userPass;
    char option;
    char opt;
    Scanner in = new Scanner(System.in);
    UserActivity userActivity = new UserActivity();
    ArrayList<String[]> data = new ArrayList<>();
    FileAdministrator file = new FileAdministrator();
    Encryption encrypt = new Encryption();
    int index;

    public boolean verifyUser(String userName) {

        data = file.readCSV();

        for (index = 0; index < data.size(); index++) {

            if (userName.equals(data.get(index)[0])) {
                return true;
            }

        }

        return false;
    }

    public boolean verifyPassword(String userPassword) {

        return (userPassword.equals(data.get(index)[1]))? true:false;

    }

    public void signInUser() {

        System.out.print(" Input the user name: ");
        userName = in.nextLine();
        System.out.print(" Input your Password: ");
        userPass = in.nextLine();

        if (!"Admin".equals(userName) || !"PIM".equals(userPass)) {
            
            if (verifyUser(userName)) {

                if (verifyPassword(encrypt.encryptPassword(userPass))) {
                    System.out.println(" Acess ... ");
                    sellermenu();
                } else {
                    System.out.println("\n Wrong Password !! ...");
                }

            } else {
                System.out.println("\n Wrong User !! ...");
            }
            
        } else {
            
            AdminMenu();
            
        }
    }
    
    public void AdminMenu(){
        
        do {
                System.out.println("\n");
                System.out.println(" -- W E L C O M E --");
                System.out.println(" 1. Add product");
                System.out.println(" 2. Modify product");
                System.out.println(" 3. Remove product");                
                System.out.println(" 4. Register new user");
                System.out.println(" 5. Return");
                System.out.println(" 6. Exit");
                System.out.print(" Select an option: ");
                opt = in.next().charAt(0);
                in.nextLine();
                switch (opt) {
                    case '1':
                        userActivity.addProductInventory();
                        break;
                    case '2':
                        //Modify product;
                        break;
                    case '3':
                        //Remove product;
                        userActivity.removeProduct();
                        break;
                    case '4':
                        userActivity.registerUser();
                        break;
                    case '5':
                        return;
                    case '6':
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n Option invalidates, enter again....");
                        break;
                }
            } while (true);
    } 
    
    public void sellermenu(){
        
        Inventory inventory = new Inventory();
        
        do {
                System.out.println("\n");
                System.out.println(" -- W E L C O M E --");
                System.out.println(" 1. View inventory");
                System.out.println(" 2. Sell product");               
                System.out.println(" 3. Return");
                System.out.println(" 4. Exit");
                System.out.print(" Select an option: ");
                opt = in.next().charAt(0);
                in.nextLine();
                switch (opt) {
                    case '1':
                        userActivity.ShowInvetory();
                        break;
                    case '2':
                        userActivity.ShowInvetory();
                        break;                    
                    case '3':
                        return;
                    case '4':
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n Option invalidates, enter again...");
                        break;
                }
        } while (true);
        
        
    }
    
    
}

