/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author S-Developers
 */
public class Validator {
    public boolean verifyDigits(String CI) {

        boolean validDigits = true;
        for (int i = 0; i < 10; i++) {
            if (!Character.isDigit(CI.charAt(i))) {
                validDigits = false;
            }
        }
        return validDigits;
    }
    public boolean verifyLength(String CI) {

        boolean validLength = true;
        if (CI.length() != 10) {
            validLength = false;
        }

        return validLength;
    }

    public int calculateValidationAddition(String CI) {
        int pairsAddition = 0, oddSum = 0, digit;
        int total;
        for (int i = 0; i < 9; i++) {
            digit = Character.getNumericValue(CI.charAt(i));
            if ((i + 1) % 2 == 0) {
                pairsAddition += digit;
            } else {
                oddSum += (digit * 2) > 9 ? (digit * 2) - 9 : (digit * 2);
            }
        }
        total = pairsAddition + oddSum;
        return total;
    }

    public boolean compareDigits(String CI, int total) {

        int lastDigit = Character.getNumericValue((CI.charAt(CI.length() - 1)));
        int higher = (10 - (total % 10)) + total;

        if ((total % 10) == 0) {
            return lastDigit == 0;
        }
        return lastDigit == (higher - total);
    }

    public boolean verifyCI(String CI) {
        boolean checkCI = false;
        checkCI = verifyLength(CI);
        checkCI = verifyDigits(CI);
        int total = 0;
        total = calculateValidationAddition(CI);
        checkCI = compareDigits(CI, total);

        return checkCI;
    }
    public boolean verifyEmail(String email) {
       
        boolean valido = false;
       
        Pattern patronEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");
   
        Matcher mEmail = patronEmail.matcher(email.toLowerCase());
        if (mEmail.matches()){
           valido = true; 
        }
        return valido;
    }
    
}
