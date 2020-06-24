/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.shoes;

import ec.edu.espe.shoes.controller.ShoesController;
import ec.edu.espe.shoes.utils.MainMenu;

/**
 *
 * @author Johao Morales
 */
public class ShoesApplication {
    public static void main(String[] args) {
        MainMenu menu = new MainMenu("JOHAO MORALES - CollectionsAndArrays");
        ShoesController controller = new ShoesController();
        
        menu.add("ADD A NEW SHOE", controller::addShoes);
        menu.add("VIEW SHOE LIST", controller::showShoes);
        menu.add("-EXIT-", menu::close);
        menu.show();
    }
}
