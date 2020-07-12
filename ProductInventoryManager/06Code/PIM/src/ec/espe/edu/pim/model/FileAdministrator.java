
package ec.espe.edu.pim.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileAdministrator {
      
    
    public void WriteDataCSV(String User,String Password){
        
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
            e.printStackTrace();
            return null;
        }
        
        
    }
    
    public void readfile(){
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        
        try {
            
            BufferedReader file = Files.newBufferedReader(Paths.get("Users.csv"));
            String line;
            while((line = file.readLine()) != null){
                String[] dataReadLine = line.split(";");
                ArrayList<String> tempData = new ArrayList<String>();
                for (String element : dataReadLine){
                    tempData.add(element);
                }
                data.add(tempData);
            }
            file.close();
            System.out.println(data);
            System.out.println(data.get(0));
            System.out.println(data.get(0).get(0));
            System.out.println(data.get(0).get(1));
        } catch (Exception e) {
            
            
        }
        
        
    }
    
    
}
