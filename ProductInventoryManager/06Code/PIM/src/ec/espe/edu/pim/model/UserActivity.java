/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pim.model;

import ec.edu.espe.pim.utils.Encryption;
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
        file.WriteDataCSV(userName, newPassword);

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

}
