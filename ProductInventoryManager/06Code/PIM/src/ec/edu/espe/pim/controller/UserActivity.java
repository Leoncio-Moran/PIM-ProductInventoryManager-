/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import ec.edu.espe.pim.utils.Encryption;
import ec.espe.edu.pim.model.FileAdministrator;
import ec.espe.edu.pim.model.Inventory;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexandra Moscoso
 */
public class UserActivity {

    Scanner in = new Scanner(System.in);
    Encryption encryptPassword = new Encryption();
    FileAdministrator file = new FileAdministrator();
    ArrayList<String[]> data = new ArrayList<>();
    Inventory inventory =  new Inventory();
    private String newPassword;
    private String userName;
    private String userPass;

    public void registerUser() {
        System.out.println("\n");
        System.out.print(" Input the user name: ");
        userName = in.nextLine();
        System.out.print(" Input your Password: ");
        userPass = in.nextLine();
        newPassword = encryptPassword.encryptPassword(userPass);
        file.WriteUsersInCSV(userName, newPassword);

    }

    public void viewUser() {

        data = file.readCSV();
        System.out.println("\n\n");
        System.out.printf("         %-10s   | %-10s\n","Users","Paswords");
        System.out.println("--------------------------------------------");
        for(int i  = 0 ; i< data.size();i++){
           System.out.printf(" %-20s | %-20s\n",data.get(i)[0], encryptPassword.decrypt( data.get(i)[1])); 
        }
        System.out.println("");
    }

    public void addProductInventory(){
        int id;
        int size;
        String color;
        String brand;
        float price;
        String shoeType;
        Scanner in = new Scanner(System.in);
        
        
        in.nextLine();
        System.out.print(" Input the ID: ");
        id = in.nextInt(); //in.nextLine();
        System.out.print(" Input the Size: ");
        size = in.nextInt();//in.nextLine();
        System.out.print(" Input the Color: ");
        color = in.nextLine();//in.nextLine();
        System.out.print(" Input the Brand: ");
        brand = in.nextLine();//in.nextLine();
        System.out.print(" Input the Price: ");
        price = in.nextFloat();//in.nextLine();
        System.out.print(" Input the Shoes type: ");
        shoeType = in.nextLine();//in.nextLine();
        
        inventory.addProduct(id, size, color, brand, price, shoeType);
        
    }
    
    public void ShowInvetory(){
     
        inventory.showInventory();;
        
    }
    
}
