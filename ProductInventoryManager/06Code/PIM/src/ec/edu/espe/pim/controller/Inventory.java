
package ec.edu.espe.pim.controller;

import com.google.gson.Gson;
import ec.edu.espe.pim.model.PairOfShoes;
import ec.edu.espe.pim.utils.IDataAccessObject;
import ec.edu.espe.pim.utils.JsonFileAdministrator;
import ec.edu.espe.pim.utils.MongoDBManager;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class Inventory {
 
    
    public void addProduct(
            int ID, int size,String brand,
            String color,float price,String shoeType,
            int stock){
        PairOfShoes shoes = new PairOfShoes(ID,size,color,brand,price,shoeType,stock);
        System.out.println(shoes.toString());
        IDataAccessObject dataAccessObject = new MongoDBManager();
        
        dataAccessObject.addToFile(shoes);
        
        
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
    
    public void discount(ArrayList<PairOfShoes> listOfShoes,int id,int quanty){
        int newStock;
        for (int i = 0; i < listOfShoes.size() ; i++) {
            
            if((listOfShoes.get(i).getId())== id){
                newStock = listOfShoes.get(i).getStock() - quanty;
                listOfShoes.get(i).setStock(newStock);
            }
            
        }
        
        update(listOfShoes);
        
    }
    
    public void showProducts(){
        
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<PairOfShoes> inventory = new ArrayList<>();
        IDataAccessObject dataAccessObject = new MongoDBManager();
        
        object = dataAccessObject.readObjects("PairOfShoes");
        
        for (Object obj : object) {
            inventory.add((PairOfShoes)obj);
        }
           
    } 
    public  ArrayList<PairOfShoes> showProduct(){
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<PairOfShoes> inventory = new ArrayList<>();
        IDataAccessObject dataAccessObject = new MongoDBManager();
      
        objects = dataAccessObject.readObjects("PairOfShoes");
        
        for (Object obj : objects) {
            inventory.add((PairOfShoes)obj);
        }
        
        return inventory;
           
    }    
}
