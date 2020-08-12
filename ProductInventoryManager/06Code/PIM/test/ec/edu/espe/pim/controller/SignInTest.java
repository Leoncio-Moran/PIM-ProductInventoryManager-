/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lesly
 */
public class SignInTest {

    public SignInTest() {
    }

    @Test
    public void testSignInAdminAcces() {
        SignIn signIn = new SignIn();
        String user = "Admin";
        String pass = "ShoePIM";
        int expResult = 2;
        int result;
        result = signIn.signInUser(user, pass);
        assertEquals(expResult, result);

    }
    @Test
    public void testSignInUserAcces() {
        SignIn signIn = new SignIn();
        String user = "johao";
        String pass = "morales";
        int expResult = 1;
        int result;
        result = signIn.signInUser(user, pass);
        assertEquals(expResult, result);

    }

    @Test
    public void testSignInUserIncorrectPasswordOrUser() {
        SignIn signIn = new SignIn();
        String user = "Alexandra";
        String pass = "bmfyboesb";
        int expResult = 2;
        int result;
        result = signIn.signInUser(user, pass);
        assertEquals(expResult, result);
    }
    @Test
    public void testSignInAdminIncorrectPasswordOrUser() {
        SignIn signIn = new SignIn();
        String user = "Admin";
        String pass = "shoePIM";
        int expResult = 1;
        int result;
        result = signIn.signInUser(user, pass);
        assertEquals(expResult, result);
    }

    @Test
    public void testSignInUserNotExixt() {
        SignIn signIn = new SignIn();
        String user = "Edison";
        String pass = "OOP";
        int expResult = 3;
        int result;
        result = signIn.signInUser(user, pass);
        assertEquals(expResult, result);

    }
}
