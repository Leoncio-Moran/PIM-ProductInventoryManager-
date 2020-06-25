package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    
    private static int idOrder;

    private List<PairOfShoes> listPairOfShoes = new ArrayList<>();
    private Date date;

    public Order(List<PairOfShoes> listPairOfShoeses) {
        date = new Date();
        idOrder += 1;
        this.listPairOfShoes = listPairOfShoeses;
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

    public static int getIdOrder() {
        return idOrder;
    }

    public static void setIdOrder(int idOrder) {
        Order.idOrder = idOrder;
    }

    @Override
    public String toString() {
        return "Order: " + ", idOrder: " + idOrder
                + ", date: " + date + "listPairOfShoes: " + listPairOfShoes;
    }
    
    

}
