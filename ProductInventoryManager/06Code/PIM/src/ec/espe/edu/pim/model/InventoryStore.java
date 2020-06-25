package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InventoryStore {
    
    private static InventoryStore inventory;

    private Date date;
    private List<PairOfShoes> listPairOfShoeses = new ArrayList<>();

    private InventoryStore() {
        this.date = new Date();

    }

    public static InventoryStore getInstance() {
        if (inventory == null) {
            inventory = new InventoryStore();
        }
        return inventory;
    }

    public void addPairOfShoes(PairOfShoes pairOfShoes) {
        listPairOfShoeses.add(pairOfShoes);
    }

    public void deletePairOfShoes(PairOfShoes pairOfShoes) {
        listPairOfShoeses.remove(pairOfShoes);
    }

    public List<PairOfShoes> GetListOfShoes() {
        return listPairOfShoeses;
    }

    public void cleanListOfShoes() {
        listPairOfShoeses.clear();
    }

    public int defineListSize() {
        return listPairOfShoeses.size();
    }

    public PairOfShoes getPairOfShoes(int position) {
        return listPairOfShoeses.get(position);
    }

    public void showPairsOfShoes() {
        System.out.println(date);
        Iterator it = listPairOfShoeses.iterator();
        PairOfShoes aux;
        while (it.hasNext()) {
            aux = (PairOfShoes) it.next();
            System.out.println(aux.toString());
        }
    }

    @Override
    public String toString() {
        return "InventoryStore{" + "date=" + date + ", listPairOfShoeses=" + listPairOfShoeses + '}';
    }

    
}
