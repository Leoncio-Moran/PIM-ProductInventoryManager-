
package ec.edu.espe.pim.controller;

import com.google.gson.Gson;
import ec.edu.espe.pim.model.PairOfShoes;
import ec.edu.espe.pim.utils.JsonFileAdministrator;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class Inventory {
    
    /*public void addProduct(){
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
        System.out.print(" Input the ShoeFor: ");
        shoes.setShoefor(in.nextLine());
        
        jsonFile.addToFile(shoes);
        
    }*/
    
    public void addProduct(
            int ID, int size,String brand,
            String color,float price,String shoeType,
            int stock){
        PairOfShoes shoes = new PairOfShoes(ID,size,color,brand,price,shoeType,stock);
        System.out.println(shoes.toString());
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        
        
        jsonFile.addToFile(shoes);
        
        
    }
    
    public void update(ArrayList<PairOfShoes> inventory ){
        
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        
        jsonFile.eraseJson(PairOfShoes.class.getSimpleName());
        
        inventory.forEach((shoes) -> {
            jsonFile.addToFile(shoes);
        });
        
        
    } 
          
    public void deleteProduct(ArrayList<PairOfShoes> listOfShoes,int id){
        
        for (int i = 0; i < listOfShoes.size() ; i++) {
            
            if((listOfShoes.get(i).getId())== id){
                listOfShoes.remove(i);
            }
            
        }
        
        update(listOfShoes);
        
    }
    
    public void showProducts(){
        
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<PairOfShoes> inventory = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();        
        Gson gson = new Gson();
        
        object = jsonFile.readObjects(PairOfShoes.class.getSimpleName());
        
        for (Object obj : object) {
            PairOfShoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, PairOfShoes.class);
            inventory.add(shoes);
        }
                      
        /*inventory.forEach((shoe)->{
            System.out.print  ("---------------------------");
            System.out.println(shoe.toString());
            System.out.println("---------------------------");
        });*/
           
    } 
    public  ArrayList<PairOfShoes> showProduct(){
        
       
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<PairOfShoes> inventory = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();        
        Gson gson = new Gson();
        
        object = jsonFile.readObjects(PairOfShoes.class.getSimpleName());
        
        for (Object obj : object) {
            PairOfShoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, PairOfShoes.class);
            inventory.add(shoes);
        }
        
                      
        /*inventory.forEach((shoe)->{
            System.out.print  ("---------------------------");
            System.out.println(shoe.toString());
            System.out.println("---------------------------");
        });*/
        return inventory;
           
    }    
}