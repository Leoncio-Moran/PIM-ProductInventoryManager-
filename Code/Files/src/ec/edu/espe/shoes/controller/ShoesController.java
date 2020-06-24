/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.shoes.controller;

import ec.edu.espe.shoes.model.Shoe;
import ec.edu.espe.shoes.view.ShoeView;
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
public class ShoesController {
    public void addShoes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("************************");
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
        
        ArrayList<Shoe> shoes = new ArrayList<Shoe>();
        shoes.add(shoeForSave);
        
        try {
            FileOutputStream file = new FileOutputStream("typeofshoes.txt", false);
            ObjectOutputStream tuberia = new ObjectOutputStream(file);
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
    
    public ArrayList<Shoe> getShoes() {
        ArrayList<Shoe> shoes = new ArrayList<Shoe>();
        
        try {
            FileInputStream fileEntry = new FileInputStream("typeofshoes.txt");
            ObjectInputStream tuberiaEntry = new ObjectInputStream(fileEntry);
            shoes = (ArrayList<Shoe>) tuberiaEntry.readObject();
        } catch (Exception exception) {}
        
        return shoes;
    }
    
    public void showShoes() {
        ArrayList<Shoe> shoes = getShoes();
        
        
        for (Shoe shoe : shoes) {
            ShoeView view = new ShoeView(shoe);
            System.out.println();
            view.display();
            System.out.println();
        }
    }
}
