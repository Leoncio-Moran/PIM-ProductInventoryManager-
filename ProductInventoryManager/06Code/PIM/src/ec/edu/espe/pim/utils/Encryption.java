/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.utils;

import ec.edu.espe.pim.model.Password;

/**
 *
 * @author S-Developers
 */
public class Encryption implements Password {
    
    private char character;
    
    
    @Override
     public String encryptPassword(String Password){
        
        String NewPassword = "";
        for(int i=0 ; i < Password.length() ; i++){
            character = Password.charAt(i);
            character++;
            NewPassword += character; 
        }
        return NewPassword;
    }
     
    @Override
     public String decryptPassword(String Password){
         
        String NewPassword = "";
        for(int i=0 ; i < Password.length() ; i++){
            character = Password.charAt(i);
            character--;
            NewPassword += character; 
        }
        return NewPassword;
     
     }
     
     
}

