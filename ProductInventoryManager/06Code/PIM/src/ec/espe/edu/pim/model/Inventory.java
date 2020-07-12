
package ec.espe.edu.pim.model;

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
        System.out.printf("| %-3s | %-4s | %-10s | %-10s | %-5s | %-3s |\n","ID","SIZE","COLOR","BRAND","PRICE","TYPE");
        System.out.println("---------------------------------------------------------");
        for(int i  = 0 ; i< data.size();i++){
            //System.out.println(data.get(i)[0]);
            System.out.printf("| %-3s | %-4s | %-10s | %-10s | %-5s | %-3s |\n",
                   data.get(i)[0],  data.get(i)[1],data.get(i)[2],  data.get(i)[3],data.get(i)[4], data.get(i)[5]); 
        }
        System.out.println("");
        System.out.println("Press a key to continue... ");
        new java.util.Scanner(System.in).nextLine();
    }
    
    public void addProduct(int id,int size,String color, String brand, float price , String typeOfShoes){
       
        file.WriteInventaryInCSV(id, size, color, brand, price, typeOfShoes);
        
    }
    
    public void updateInventary(ArrayList<PairOfShoes> inventory){
        
        file.ErraseFile();
        inventory.forEach((shoe) -> {
            file.WriteInventaryInCSV(
                    shoe.getIdPairOfShoes(), shoe.getSize(),
                    shoe.getColor() , shoe.getBrand() , 
                    shoe.getPrice(), shoe.getShoeType()
            );
        });
        
        
    }
    
    public void eraseProduct(ArrayList<PairOfShoes> inventory,int id){
        
        for (int i = 0; i < inventory.size() ; i++) {
            
            if((inventory.get(i).getIdPairOfShoes())== id){
                inventory.remove(i);
            }
            
        }
        
    }
}
