/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import ec.edu.espe.pim.controller.Inventory;
import ec.edu.espe.pim.utils.JsonFileAdministrator;
import ec.edu.espe.pim.model.Users;
import ec.edu.espe.pim.utils.Encryption;
import ec.edu.espe.pim.view.FrmUserMenu;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S-Developers
 */
public class SignIn {

    private String userName;
    private String userPass;
    char option;
    char opt;
    int index;
    Scanner in = new Scanner(System.in);
    UserActivity userActivity = new UserActivity();    
    Encryption encrypt = new Encryption();
    JsonFileAdministrator datafile = new JsonFileAdministrator();
    
    ArrayList<Users> listOfUsers = new ArrayList<>();

    private boolean verifyUser(String userName) {
        
        listOfUsers = userActivity.readUsers();
        
        //System.out.println( listOfUsers.get(0).getUser());
                
        for (index = 0; index < listOfUsers.size(); index++) {

            if (userName.equals( listOfUsers.get(index).getUser() )) {
                return true;
            }
        }

        return false;
    }

    private boolean verifyPassword(String userPassword) {

        listOfUsers = userActivity.readUsers();
                
        return (userPassword.equals( listOfUsers.get(index).getPassword() )) ? true : false;
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
    
    public int signInUser(String user ,String pass) {

        userName = user;
        userPass = pass;        

            if (verifyUser(userName)) {
                if (verifyPassword(encrypt.encryptPassword(userPass))) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                return 3;
            }
    }

    public void AdminMenu() {
        
        Inventory inventory = new Inventory();
        
        do {
            System.out.println("\n");
            System.out.println(" -- W E L C O M E --");
            System.out.println(" 1. Add product");
            System.out.println(" 2. Delete product");
            System.out.println(" 3. Show Users");
            System.out.println(" 4. Register new user");
            System.out.println(" 5. Return");
            System.out.println(" 6. Exit");
            System.out.print(" Select an option: ");
            opt = in.next().charAt(0);
            in.nextLine();
            switch (opt) {
                case '1':
                    //Add Product
                   // inventory.addProduct();
                    break;
                case '2':
                    //Delete;
                    userActivity.deleteProduct();
                    break;
                case '3':                    
                    userActivity.showUsers();
                    break;
                case '4':
                    userActivity.addUser();
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

    public void sellermenu() {
        
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
                    //view Products
                    userActivity.showProduct();
                    break;
                case '2':
                    //sell
                    
                    userActivity.showProduct();
                    userActivity.sellProduct();
                    break;
                case '3':
                    // return 
                    return;
                case '4':
                    //exit aplication 
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n Option invalidates, enter again...");
                    break;
            }
        } while (true);

    }

}
