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
public class Users {

    private String user;
    private String password;
    
    
    public Users(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    
    public String getUser() {
        return user;
    }
   
    public void setUser(String user) {
        this.user = user;
    }
    
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "\n" + " user=" + user + ", password=" + password ;
    }
 
    
    
}
