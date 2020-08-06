/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import ec.edu.espe.pim.gui.frmSellProduct;
import ec.edu.espe.pim.gui.frmSignIn;
import ec.edu.espe.pim.service.UserService;
import javax.swing.JFrame;

/**
 *
 * @author JOSUE
 */
public class UserController {
    private UserService userService = new UserService();
    
       public void init() {
        frmSignIn view= new frmSignIn(userService);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(true);
    }
}
