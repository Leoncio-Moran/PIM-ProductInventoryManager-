/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author lesly
 */
public class ListConversion {
    
    ArrayList<PairOfShoes> listPairsOfShoes = new ArrayList<>(); 
    ArrayList<String> listShoesStrings = new ArrayList<>();
    
    public List<String> convertListPairOfShoesToListString(List<PairOfShoes> pairsOfShoes){
        for(PairOfShoes pairOfShoes : listPairsOfShoes){
            listShoesStrings.add( pairOfShoes.toString());
        }
        return listShoesStrings;
    }
    
    public List<PairOfShoes> convertListStringToPairOfShoes(List<String> listShoStrings){
        Iterator <String> it = listShoStrings.iterator();
        while(it.hasNext()){
            
        }
        return listPairsOfShoes;
    }
}

