
package ec.edu.espe.pim.controller;

import ec.edu.espe.pim.model.TypeOfPayment;
import java.util.Date;
import java.util.List;


public class Bill {
    
    private int idBill;
    private Client client;
    private List<PairOfShoes> listOfShoes;
    private Date date = new Date(); 
    private float totalPrice;
    private TypeOfPayment payment;
    
    
    public void generateBill(){
        System.out.println("-- PIM --");
        System.out.println("Name: " + client.getName() + " " + client.getLastName());
        System.out.println("Date:  " + date);
        System.out.println("Products:");
        
        
    }
    
}
