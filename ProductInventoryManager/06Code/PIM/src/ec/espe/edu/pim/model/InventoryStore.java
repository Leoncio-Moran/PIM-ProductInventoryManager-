package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InventoryStore {
    
    private Date date;
    private List<PairOfShoes> listPairsOfShoes = new ArrayList<>();

    public InventoryStore() {
    }
    
    public InventoryStore(List<PairOfShoes> pairsOfShoes) {
        this.date = new Date();
        this.listPairsOfShoes = listPairsOfShoes;
    }

    public void addPairOfShoes(PairOfShoes pairOfShoes) {
        listPairsOfShoes.add(pairOfShoes);
    }

    public void deletePairOfShoes(PairOfShoes pairOfShoes) {
        listPairsOfShoes.remove(pairOfShoes);
    }

    public List<PairOfShoes> GetListOfShoes() {
        return listPairsOfShoes;
    }

    public void cleanListOfShoes() {
        listPairsOfShoes.clear();
    }

    public int defineListSize() {
        return listPairsOfShoes.size();
    }

    public PairOfShoes getPairOfShoes(int position) {
        return listPairsOfShoes.get(position);
    }

    public void showPairsOfShoes() {
        System.out.println(date);
        Iterator it = listPairsOfShoes.iterator();
        PairOfShoes aux;
        while (it.hasNext()) {
            aux = (PairOfShoes) it.next();
            System.out.println(aux.toString());
        }
    }
    
    public PairOfShoes getPairOfShoesById(int id){
        PairOfShoes pairOfShoesTemp = null;
        for(PairOfShoes pairOfShoes : listPairsOfShoes){
            if(id == pairOfShoes.getIdPairOfShoes()){
                pairOfShoesTemp = pairOfShoes;
                return pairOfShoesTemp;
            }
        }
        return pairOfShoesTemp;
    }
    
    

    @Override
    public String toString() {
        return "InventoryStore{" + "date=" + date + ", listPairsOfShoes=" + listPairsOfShoes + '}';
    }

    
}
