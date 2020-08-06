
package ec.edu.espe.pim.model;

import com.google.gson.Gson;
import ec.edu.espe.pim.controller.Shoes;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class Inventory {
    
    public void addProduct(){
        Shoes shoes = new Shoes();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Scanner in = new Scanner(System.in);
         
        System.out.print(" Input the ID : ");
        shoes.setId(in.nextInt());        
        System.out.print(" Input the Size: ");
        shoes.setSize(in.nextInt());
        in.nextLine();
        System.out.print(" Input the Color: ");
        shoes.setColor(in.nextLine());
        System.out.print(" Input the Brand: ");
        shoes.setBrand(in.nextLine());        
        System.out.print(" Input the Price: ");
        shoes.setPrice(in.nextFloat()); 
        in.nextLine();
        System.out.print(" Input the Shoes type: ");
        shoes.setShoeType(in.nextLine());
        System.out.print(" Input the Stock: ");
        shoes.setStock(in.nextInt());
        
        jsonFile.addToFile(shoes);
        
    }
    
    public void addProduct(
            JTextField ID,JTextField size,JTextField brand,
            JComboBox color,JTextField price,JComboBox type,
            JTextField stock){
        Shoes shoes = new Shoes();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        
        shoes.setId(Integer.valueOf(ID.getText()));   //id     
        
        shoes.setSize(Integer.valueOf(size.getText())); //size
        
        shoes.setColor(color.getToolTipText()); //color*/
        
        shoes.setBrand(brand.getText());      //brand  
        
        shoes.setPrice(Float.valueOf(price.getText()));  //price
        
        shoes.setShoeType(type.getToolTipText());  //type
       
        shoes.setStock(Integer.valueOf(stock.getText())); //stock
        
        jsonFile.addToFile(shoes);
        
    }
    
    public void update(ArrayList<Shoes> inventory ){
        
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        
        jsonFile.eraseJson(Shoes.class.getSimpleName());
        
        inventory.forEach((shoes) -> {
            jsonFile.addToFile(shoes);
        });
        
        
    } 
          
    public void deleteProduct(ArrayList<Shoes> listOfShoes,int id){
        
        for (int i = 0; i < listOfShoes.size() ; i++) {
            
            if((listOfShoes.get(i).getId())== id){
                listOfShoes.remove(i);
            }
            
        }
        
        update(listOfShoes);
        
    }
    
    public void showProducts(){
        
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<Shoes> inventory = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();        
        Gson gson = new Gson();
        
        object = jsonFile.readObjects(Shoes.class.getSimpleName());
        
        for (Object obj : object) {
            Shoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, Shoes.class);
            inventory.add(shoes);
        }
                      
        inventory.forEach((shoe)->{
            System.out.print  ("---------------------------");
            System.out.println(shoe.toString());
            System.out.println("---------------------------");
        });
           
    }    
}
