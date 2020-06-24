package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Inventory {
    
    private List <PairOfShoes> listPairOfShoes = new ArrayList<>();
    private Date date;
    private int startItem;
    private int entryItem;
    private int disrepairItem;
    private int finalItem;
    private int saleItem;
    private float totalRaised;    

    public Inventory() {
    }
    
    public Inventory(Date date, int startItem, int entryItem, int disrepairItem, int finalItem, int saleItem, float totalRaised) {
        this.date = date;
        this.startItem = startItem;
        this.entryItem = entryItem;
        this.disrepairItem = disrepairItem;
        this.finalItem = finalItem;
        this.saleItem = saleItem;
        this.totalRaised = totalRaised;
    }

    public List<PairOfShoes> getListPairOfShoes() {
        return listPairOfShoes;
    }

    public void setListPairOfShoes(List<PairOfShoes> listPairOfShoes) {
        this.listPairOfShoes = listPairOfShoes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStartItem() {
        return startItem;
    }

    public void setStartItem(int startItem) {
        this.startItem = startItem;
    }

    public int getEntryItem() {
        return entryItem;
    }

    public void setEntryItem(int entryItem) {
        this.entryItem = entryItem;
    }

    public int getDisrepairItem() {
        return disrepairItem;
    }

    public void setDisrepairItem(int disrepairItem) {
        this.disrepairItem = disrepairItem;
    }

    public int getFinalItem() {
        return finalItem;
    }

    public void setFinalItem(int finalItem) {
        this.finalItem = finalItem;
    }

    public int getSaleItem() {
        return saleItem;
    }

    public void setSaleItem(int saleItem) {
        this.saleItem = saleItem;
    }

    public float getTotalRaised() {
        return totalRaised;
    }

    public void setTotalRaised(float totalRaised) {
        this.totalRaised = totalRaised;
    }

    @Override
    public String toString() {
        return "Inventory{" + "listPairOfShoes=" + listPairOfShoes + ", date=" + date + ", startItem=" + startItem + ", entryItem=" + entryItem + ", disrepairItem=" + disrepairItem + ", finalItem=" + finalItem + ", saleItem=" + saleItem + ", totalRaised=" + totalRaised + '}';
    }
    
    
}
