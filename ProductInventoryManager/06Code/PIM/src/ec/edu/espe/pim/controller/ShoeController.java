/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import ec.edu.espe.pim.gui.frmSellProduct;
import ec.edu.espe.pim.service.ShoeService;
import javax.swing.JFrame;

/**
 *
 * @author JOSUE
 */
public class ShoeController {
    private ShoeService shoeService = new ShoeService();
    
    public void init() {
        frmSellProduct view = new frmSellProduct(shoeService);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(true);
    }
}
