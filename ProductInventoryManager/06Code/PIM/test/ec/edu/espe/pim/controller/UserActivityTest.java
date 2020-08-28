/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import ec.edu.espe.pim.model.User;
import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author lesly
 */
public class UserActivityTest {
    
    public UserActivityTest() {
    }

    @Test
    public void testAddUser_String_String() {
        UserActivity userActivity = new UserActivity();
        String person = "Edison";
        String pass = "POO";
        userActivity.addUser(person, pass);

    }

    /**
     * Test of readUsers method, of class UserActivity.
     */
    @Test
    public void testReadUsers() {
        UserActivity userActivity = new UserActivity();
        ArrayList<User> expResult = null;
        ArrayList<User> result = userActivity.readUsers();

    }
}