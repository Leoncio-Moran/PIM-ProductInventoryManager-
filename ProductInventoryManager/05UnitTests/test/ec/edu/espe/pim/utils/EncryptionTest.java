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
        String Password = "pairOfShoesPIM";
        String expResult = "qbjsPgTipftQJN";
        String result;
        result = encryption.encryptPassword(Password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of decrypt method, of class Encryption.
     */
    @Test
    public void testDecrypt() {
        Encryption encryption = new Encryption();
        String Password = "tipftQJN"; 
        String expResult = "shoesPIM";
        String result;
        result = encryption.decrypt(Password);
        assertEquals(expResult, result);
    }
    
}
