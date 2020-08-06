/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.utils;
/**
 *
 * @author Alexandra Moscoso
 */
public class Encryption {
    
    private char character;
    
    
     public String encryptPassword(String Password){
        
        String NewPassword = "";
        for(int i=0 ; i < Password.length() ; i++){
            character = Password.charAt(i);
            character++;
            NewPassword += character; 
        }
        return NewPassword;
    }
     
     public String decrypt(String Password){
         
        String NewPassword = "";
        for(int i=0 ; i < Password.length() ; i++){
            character = Password.charAt(i);
            character--;
            NewPassword += character; 
        }
        return NewPassword;
     
     }
     
     
}

