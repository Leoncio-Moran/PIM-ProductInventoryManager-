
package ec.edu.espe.pim.controller;

//import ec.edu.espe.pim.model.TypeOfPayment;
import ec.edu.espe.pim.model.Customer;
import ec.edu.espe.pim.model.ShoppingCar;
import java.util.Date;
import java.util.List;


public class Bill {
    
    private int idBill;
    
    private final Date date = new Date(); 
    private float totalPrice;
    
    
    
    public void clientBill(List<ShoppingCar> products,Customer client){
        System.out.println("     ---- PIM  B I L L ----");
        System.out.println("Name: " + client.getName());
        System.out.println("Telephone: "+ client.getTelephone());
        System.out.println("Date:  " + date);
        System.out.println("Products:");
        System.out.printf("| %-3s| %-15s |  %-8s\n","QC", "Product", "Price");
        products.stream().map((product) -> {
            System.out.printf("| %-3s| %-8s |  %-8s\n",product.getQuantity(), product.getDescription(), product.getPrice());
            return product;
        }).forEachOrdered((product) -> {
            totalPrice += product.getPrice();
        });
        System.out.println("----------------------------------");
        System.out.println("\t\t Total: " + totalPrice);
        System.out.println("----------------------------------");
        System.out.println("       --- T H A K   Y O U -- ");
    }
    
    
    
}
