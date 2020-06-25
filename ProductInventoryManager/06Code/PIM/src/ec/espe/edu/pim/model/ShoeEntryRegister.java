package ec.espe.edu.pim.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoeEntryRegister {

    private static int id;

    private Date date;
    private String providersName;
    List<PairOfShoes> listPairOfShoesesProvider = new ArrayList<>();

    public ShoeEntryRegister(String providersName, List<PairOfShoes> listPairOfShoesesProvider) {
        date = new Date();
        this.providersName = providersName;
        this.listPairOfShoesesProvider = listPairOfShoesesProvider;
        this.id += 1;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        ShoeEntryRegister.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProvidersName() {
        return providersName;
    }

    public void setProvidersName(String providersName) {
        this.providersName = providersName;
    }

    public List<PairOfShoes> getListPairOfShoesesProvider() {
        return listPairOfShoesesProvider;
    }

    public void setListPairOfShoesesProvider(List<PairOfShoes> listPairOfShoesesProvider) {
        this.listPairOfShoesesProvider = listPairOfShoesesProvider;
    }

    @Override
    public String toString() {
        return "ShoeEntryRegister: " + "date=" + date + ", providersName=" + providersName + ", listPairOfShoesesProvider=" + listPairOfShoesesProvider + '}';
    }
    
    
}
