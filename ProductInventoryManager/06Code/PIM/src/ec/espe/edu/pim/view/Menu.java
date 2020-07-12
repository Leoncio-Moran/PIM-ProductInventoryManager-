/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pim.view;

import ec.edu.espe.pim.controller.SignIn;
import ec.espe.edu.pim.model.UserActivity;
import java.util.Scanner;

public class Menu {
     
    UserActivity userActivity = new UserActivity();
    
    public void MainMenu(){
        
        char option;
        Scanner in = new Scanner(System.in);
        SignIn signIn =  new SignIn();
        
        OUTER:
        do {
            System.out.println("");
            System.out.println(" ----- M E N U -----");
            System.out.println(" 1. Sign In");
            System.out.println(" 2. Exit");
            System.out.print(" Select an option: ");
            option = in.next().charAt(0);
            in.nextLine();
            switch (option) {
                case '1':
                    signIn.signInUser();
                    break;
                case '2':
                    break ;
                default:
                    System.err.println("Option invalidates, enter again");
                    break;
            }
        } while (option != '2');
        
        
    }   
    
    public void AdminMenu(){
        char opt;
        Scanner in = new Scanner(System.in);
        do {
                System.out.println(" -- W E L CO M E --");
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
                        //Add product;
                        break;
                    case '2':
                        //Modify product;
                        break;
                    case '3':
                        //Remove product;
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
                        System.err.println("Option invalidates, enter again");
                        break;
                }
            } while (true);
    } 
    
}

