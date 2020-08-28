/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import ec.edu.espe.pim.model.PairOfShoes;
import java.util.ArrayList;

/**
 *
 * @author lesly
 */
public interface Promotion {
     public void discount(ArrayList<PairOfShoes> listOfShoes, int id, int quanty);
     public void sale(ArrayList<PairOfShoes> listOfShoeses, int id, int quanty);
    
}
