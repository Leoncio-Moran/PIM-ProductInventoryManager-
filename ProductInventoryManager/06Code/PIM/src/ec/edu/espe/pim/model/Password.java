/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.model;

/**
 *
 * @author S-Developers
 */
public interface Password {
    public String encryptPassword(String Password);
    public String decryptPassword(String Password);
}
