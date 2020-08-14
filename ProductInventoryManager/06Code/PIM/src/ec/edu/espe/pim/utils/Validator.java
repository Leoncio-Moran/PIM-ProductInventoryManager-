/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.utils;

/**
 *
 * @author lesly
 */
public class Validator {
     public static boolean validateCI(String CI) {
        if (CI.length() != 10) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (!Character.isDigit(CI.charAt(i))) {
                return false;
            }
        }
        int lastDigit = Character.getNumericValue((CI.charAt(CI.length() - 1)));
        int digit, sumPairs = 0, oddSum = 0;

        for (int i = 0; i < 9; i++) {
            digit = Character.getNumericValue(CI.charAt(i));

            if ((i + 1) % 2 == 0) {
                sumPairs += digit;
            } else {
                oddSum += (digit * 2) > 9 ? (digit * 2) - 9 : (digit * 2);
            }
        }
        int total = sumPairs + oddSum;
        int higher = (10 - (total % 10)) + total;

        if ((total % 10) == 0) {
            return lastDigit == 0;
        }
        return lastDigit == (higher - total);
    }
    
}
