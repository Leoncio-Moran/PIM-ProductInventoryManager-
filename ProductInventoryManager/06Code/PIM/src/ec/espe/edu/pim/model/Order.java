
package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
    
 private List <PairOfShoes> listPairOfShoes = new ArrayList<>();
 private Date date;
 private int idOrder;

    public Order(Date date, int idOrder) {
        this.date = date;
        this.idOrder = idOrder;
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

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Override
    public String toString() {
        return "Order{" + "listPairOfShoes=" + listPairOfShoes + ", date=" + date + ", idOrder=" + idOrder + '}';
    }
 
 
}
