/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import ec.edu.espe.pim.controller.Inventory;
import ec.edu.espe.pim.utils.JsonFileAdministrator;
import ec.edu.espe.pim.model.User;
import ec.edu.espe.pim.utils.Encryption;
import ec.edu.espe.pim.utils.IDataAccessObject;
import ec.edu.espe.pim.utils.MongoDBManager;
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
    
    ArrayList<User> listOfUsers = new ArrayList<>();

    private boolean verifyUser(String userName) {
        
        listOfUsers = userActivity.readUsers();
       
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

}