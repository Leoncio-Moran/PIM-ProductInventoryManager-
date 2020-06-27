/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lesly
 */
public class InventoryWarehouse {
    
    private Date date;
    private List<PairOfShoes> listPairOfShoes = new ArrayList<>();

    public InventoryWarehouse() {
    }

    public InventoryWarehouse(List<PairOfShoes> pairOfShoeses) {
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<PairOfShoes> getListPairOfShoes() {
        return listPairOfShoes;
    }

    public void setListPairOfShoes(List<PairOfShoes> listPairOfShoes) {
        this.listPairOfShoes = listPairOfShoes;
    }

    @Override
    public String toString() {
        return "InventoryWarehouse{" + "date=" + date + ", listPairOfShoes=" + listPairOfShoes + '}';
    }
    
    
}
