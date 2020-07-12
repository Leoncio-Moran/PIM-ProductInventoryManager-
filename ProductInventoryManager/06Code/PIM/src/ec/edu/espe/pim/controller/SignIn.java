/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;


import ec.edu.espe.pim.utils.Encryption;
import ec.espe.edu.pim.model.FileAdministrator;
import ec.espe.edu.pim.model.UserActivity;
import ec.espe.edu.pim.view.Menu;
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
    
    Menu menu = new Menu();
    Scanner in = new Scanner(System.in);
    UserActivity userActivity = new UserActivity();
    ArrayList<String[]> data = new ArrayList<String[]>();
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

        if ("Admin".equals(userName) && "root".equals(userPass)) {
            
            menu.AdminMenu();

        } else {

            if (verifyUser(userName)) {

                if (verifyPassword(encrypt.encryptPassword(userPass))) {
                    System.out.println("Acess");
                } else {
                    System.err.println("Wrong Password");
                }

            } else {
                System.err.println("Wrong User !!");
            }

        }
    }
}

