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
        List<PairOfShoes> listPairsShoes = new ArrayList<>();
        Iterator <String> it = listShoStrings.iterator();
        while(it.hasNext()){
            String current = it.next().trim();
            if(current.isEmpty()){
                continue;
            }
            String[] temp = current.split(",");
            int idPairOfShoes = Integer.parseInt(temp[0]);
            int size = Integer.parseInt(temp[1]);
            String color = temp[2];
            String brand = temp[3];
            float price = Float.parseFloat(temp[4]);
            String typeShoe = temp[5];
            PairOfShoes pairOfShoes = new PairOfShoes(idPairOfShoes, size, color, brand, price, typeShoe);
            listPairsShoes.add(pairOfShoes);
        }
        return listPairsOfShoes;
    }
}

