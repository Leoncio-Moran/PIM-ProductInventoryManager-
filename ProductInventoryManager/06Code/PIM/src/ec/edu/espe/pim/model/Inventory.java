
package ec.edu.espe.pim.model;

import ec.edu.espe.pim.controller.PairOfShoes;
import java.util.ArrayList;


public class Inventory {
    
    PairOfShoes shoes;
    FileAdministrator file = new FileAdministrator();
    ArrayList<String[]> data = new ArrayList<>();
    ArrayList<PairOfShoes> inventory = new ArrayList<>();
    
    public void showInventory(){
        
        data = file.readDataInCSV();
        
        System.out.println("\n\n");
        //System.out.println(data.size());
        
        System.out.printf("| %-3s | %-4s | %-5s | %-10s | %-8s | %-5s | %-5s |\n","ID","SIZE","COLOR","BRAND","PRICE","TYPE","STOCK");
        System.out.println("---------------------------------------------------------");
        
        data.forEach((strings) -> {
            System.out.printf("| %-3s | %-4s | %-5s | %-10s | %-5s | %-3s | %-5s |\n",
                    strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6]);
            System.out.println("---------------------------------------------------------");
        });
 
                
        System.out.println("");
        System.out.println("Press a key to continue... ");
        new java.util.Scanner(System.in).nextLine();
    }
    
    public void addProduct(int id,int size,String color, String brand, float price , String typeOfShoes,int stock){
       
        file.WriteInventaryInCSV(id, size, color, brand, price, typeOfShoes,stock);
        
    }
    
    public void updateInventary(ArrayList<PairOfShoes> inventory){
        
        file.ErraseFile();
        inventory.forEach((shoe) -> {
            file.WriteInventaryInCSV(
                    shoe.getIdPairOfShoes(), shoe.getSize(),
                    shoe.getColor() , shoe.getBrand() , 
                    shoe.getPrice(), shoe.getShoeType(),
                    shoe.getStock()
            );
        });
        
        
    }
    
    public void eraseProduct(ArrayList<PairOfShoes> listOfShoes,int id){
        
        for (int i = 0; i < listOfShoes.size() ; i++) {
            
            if((listOfShoes.get(i).getIdPairOfShoes())== id){
                listOfShoes.remove(i);
            }
            
        }
        
        updateInventary(listOfShoes);
        
    }
}
