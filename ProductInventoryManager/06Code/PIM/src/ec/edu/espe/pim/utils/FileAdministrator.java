
package ec.edu.espe.pim.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileAdministrator {
      
    
    public void WriteUsersInCSV(String User,String Password){
        
        try {
            File DataFile =  new File("Users.csv");
            FileWriter WriteFile;
            PrintWriter Line;
            if(!DataFile.exists()){
                try {   
                    DataFile.createNewFile();
                    WriteFile = new FileWriter(DataFile,true);
                    Line = new PrintWriter(WriteFile);
                    
                    //writing file
                    
                    Line.println(User+ ";" + Password);
                    Line.close();
                    WriteFile.close();
                    
                } catch (Exception e) {
                    System.err.println("Error creating file");
                }
                
            }else{
                try {
                    
                    WriteFile = new FileWriter(DataFile,true);
                    Line = new PrintWriter(WriteFile);
                    //write file
                    
                   Line.println(User+ ";" + Password);
                    Line.close();
                    WriteFile.close();
                    
                } catch (Exception e) {
                    System.err.println("Error creating file");
                }
            }
            
            
        } catch (Exception e) {
            
            System.err.println("Error writing to file"); 
            
        }
        
    }
    
    public void WriteInventaryInCSV(int id,int size,String color, String brand, float price , String typeOfShoes ,int stock){
        
        try {
            File DataFile =  new File("Inventory.csv");
            FileWriter WriteFile;
            PrintWriter Line;
            if(!DataFile.exists()){
                try {   
                    DataFile.createNewFile();
                    WriteFile = new FileWriter(DataFile,true);
                    Line = new PrintWriter(WriteFile);
                    
                    //writing file
                    
                    Line.println(id+ ";" + size + ";" + color + ";" + brand + ";" + price + ";" + typeOfShoes + ";" + stock);
                    Line.close();
                    WriteFile.close();
                    
                } catch (Exception e) {
                    System.err.println("Error creating file");
                }
                
            }else{
                try {
                    
                    WriteFile = new FileWriter(DataFile,true);
                    Line = new PrintWriter(WriteFile);
                    //write file
                    
                    Line.println(id+ ";" + size + ";" + color + ";" + brand + ";" + price+ ";" + typeOfShoes + ";" + stock);
                    Line.close();
                    WriteFile.close();
                    
                } catch (Exception e) {
                    System.out.println("Error creating file");
                }
            }
            
            
        } catch (Exception e) {
            
            System.err.println("Error writing to file"); 
            
        }
        
    }
    
    public ArrayList<String[]> readCSV(){
        
        try {
            BufferedReader reader =  new BufferedReader(new FileReader("Users.csv"));
            ArrayList<String[]> list = new ArrayList<>();
            String line = "";
            while((line = reader.readLine()) != null){
                //System.err.println(line);
                String[] temp = line.split(";");
                //System.out.println(temp[0] + ";" + temp[1]);
                list.add(temp);
            }
            
            reader.close();
            return list;
            
        } catch (Exception e) {
            System.out.println("Could not open file");
            return null;
        }
          
    }
    
    public ArrayList<String[]> readDataInCSV(){
        
        try {
            BufferedReader reader =  new BufferedReader(new FileReader("Inventory.csv"));
            ArrayList<String[]> list = new ArrayList<>();
            String line = "";
            while((line = reader.readLine()) != null){
                //System.err.println(line);
                String[] temp = line.split(";");
                //System.out.println(temp[0] + ";" + temp[1]);
                list.add(temp);
            }
            
            reader.close();
            return list;
            
        } catch (Exception e) {
            System.out.println("could not read the file");
            return null;
        }
          
    }
    
    public void ErraseFile(){
        File DataFile =  new File("Inventory.csv");
        
        
        System.out.println("Eliminating...");
        DataFile.delete();
        System.out.println("Successfully removed ....");
        
    }
    
    public void updateFileInventary(int id,int size,String color, String brand, float price , String typeOfShoes , int stock){
        
        ErraseFile();
        WriteInventaryInCSV(id, size, color, brand, price, typeOfShoes , stock);
        
    }
    
}
