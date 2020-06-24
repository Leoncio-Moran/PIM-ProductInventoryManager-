/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lesly
 */
public class ListConversion {
    
    ArrayList<PairOfShoes> listPairOfShoeses = new ArrayList<>(); 
    ArrayList<String> listShoesStrings = new ArrayList<>();
    
    public List<String> convertListPairOfShoesToListString(){
        for(PairOfShoes pairOfShoes : listPairOfShoeses){
            listShoesStrings.add( pairOfShoes.toString());
        }
        return listShoesStrings;
    }
}

