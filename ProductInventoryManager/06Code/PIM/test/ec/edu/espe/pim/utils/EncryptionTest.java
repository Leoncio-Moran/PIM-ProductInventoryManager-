/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lesly
 */
public class EncryptionTest {
    
    public EncryptionTest() {
    }

    /**
     * Test of encryptPassword method, of class Encryption.
     */
    @Test
    public void testEncryptPassword() {
        Encryption encryption = new Encryption();
        String Password = "root";
        String expResult = "siou";
        String result;
        result = encryption.encryptPassword(Password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of decrypt method, of class Encryption.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String Password = "";
        Encryption instance = new Encryption();
        String expResult = "";
        String result = instance.decrypt(Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
