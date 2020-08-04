/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.view;

import ec.edu.espe.pim.controller.PaymentController;
import ec.edu.espe.pim.controller.ShoeController;
import ec.edu.espe.pim.controller.UserController;

/**
 *
 * @author JOSUE
 */
public class ProductInventoryManager {
    public static void main(String[] args) { 
        UserController userController = new UserController();
        userController.init();
        PaymentController paymentController = new PaymentController();
        //ShoeController shoeController = new ShowController();
        paymentController.init();
        //shoeController.init();
        
    }
}
