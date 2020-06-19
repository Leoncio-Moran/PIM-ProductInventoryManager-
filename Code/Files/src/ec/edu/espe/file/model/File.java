/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.file.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johao Morales
 */
public class File {    
    public static void main(String[] args){
        ArrayList<Shoe> shoes = new ArrayList<Shoe>();
        
        try {
            FileInputStream fileEntry = new FileInputStream("typeofshoes.txt");
            ObjectInputStream tuberiaEntry = new ObjectInputStream(fileEntry);
            shoes = (ArrayList<Shoe>) tuberiaEntry.readObject();
            
            for (Shoe shoe : shoes) {
                shoe.showShoe();
                System.out.println();
            }
        } catch (Exception exception) {}
       
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.print("ENTER SHOE BRAND: ");
        String brand = scanner.nextLine();

        System.out.print("ENTER SHOE COLOR: ");
        String color = scanner.nextLine();

        System.out.print("ENTER THE SHOE SIZE: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ENTER SHOE ID: ");
        int id = scanner.nextInt(); 
        scanner.nextLine();
        System.out.println("************************");
        Shoe shoeForSave = new Shoe(brand, color, size, id);
        
        FileOutputStream file = null;
        
        try {
            file = new FileOutputStream("typeofshoes.txt", false);
            ObjectOutputStream tuberia = new ObjectOutputStream(file);
            shoes.add(shoeForSave);
            tuberia.writeObject(shoes);
            tuberia.reset();
        } catch(Exception ex){ }
        
        try {
            java.io.File txtFile = new java.io.File("shoes.txt");
            
            if (!txtFile.exists()) {
                txtFile.createNewFile();
            }
            
            PrintWriter printer = new PrintWriter(new FileWriter(txtFile, false));
            
            for (Shoe shoe : shoes) {
                printer.println(shoe);
            }
            
            printer.close();
        } catch (Exception ex) {}
    }
}