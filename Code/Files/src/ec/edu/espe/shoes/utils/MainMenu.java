/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.shoes.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author Johao Morales
 */
public class MainMenu {
    private ArrayList<MenuOption> options = new ArrayList<>();
    private String title;
    private boolean menuRunning = true;
    
    public static class MenuOption {
        private String label;
        private Runnable callback;
        
        public MenuOption(String label, Runnable callback) {
            this.label = label;
            this.callback = callback;
        }
        
        public String getLabel() { return label; }
        public Runnable getCallback() { return callback; }
    }
    
    public MainMenu(String title) {
        this.title = title;
    }
    
    public void add(String label, Runnable callback) {
        options.add(new MenuOption(label, callback));
    }
    
    public void show() {
        Scanner scanner = new Scanner(System.in);
        
        while (menuRunning) {
            System.out.println(title);
            System.out.println();
            
            int position = 1;
            
            for (MenuOption option : options) {
                System.out.printf("%d: %s\n", position++, option.label);
            }
            
            int optionEntered = 0;
            
            do {
                try {
                    System.out.print("ENTER AN OPCION: ");
                    optionEntered = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {}
            } while (optionEntered <= 0 || optionEntered > options.size());
            
            MenuOption option = options.get(optionEntered - 1);
            option.callback.run();
            
            try {
                System.out.println();
                System.out.println();
                System.out.print("**PRESS ENTER TO CONTINUE**");
                System.in.read();
            } catch (IOException e) {}
        }
    }
    
    public void close() {
        menuRunning = false;
    }
}
