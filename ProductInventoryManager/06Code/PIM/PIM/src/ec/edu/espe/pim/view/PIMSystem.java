
package ec.edu.espe.pim.view;

import ec.edu.espe.pim.controller.SignIn;
import java.util.Scanner;

public class PIMSystem {
 
    public static void main (String[] args){
            
        char option;
        Scanner in = new Scanner(System.in);
        SignIn signIn =  new SignIn();
        
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
                    System.out.println("\n Option invalidates, enter again....");
                    break;
            }
        } while (option != '2');
        
    } 
    
}
