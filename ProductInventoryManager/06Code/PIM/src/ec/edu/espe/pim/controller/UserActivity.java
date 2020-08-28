/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template jsonFile, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import com.google.gson.Gson;
import ec.edu.espe.pim.utils.FileAdministrator;
import ec.edu.espe.pim.controller.Inventory;
import ec.edu.espe.pim.model.Customer;
import ec.edu.espe.pim.utils.JsonFileAdministrator;
import ec.edu.espe.pim.model.User;
import ec.edu.espe.pim.utils.Encryption;
import java.util.ArrayList;
import java.util.Scanner;
import ec.edu.espe.pim.model.PairOfShoes;
import ec.edu.espe.pim.model.ShoppingCar;

/**
 *
 * @author S-Developers
 */
public class UserActivity {

    Scanner in = new Scanner(System.in);
    Encryption encryptPassword = new Encryption();
    FileAdministrator file = new FileAdministrator();
    ArrayList<String[]> data = new ArrayList<>();
    Inventory inventory = new Inventory();
    ArrayList<ShoppingCar> cart = new ArrayList<>();
    
    private String newPassword;
    private String userName;
    private String userPass;

    public void registerUser() {
        System.out.println("\n");
        System.out.print(" Input the user name: ");
        userName = in.nextLine(); // txtUser.getText();
        System.out.print(" Input your Password: ");
        userPass = in.nextLine(); 
        newPassword = encryptPassword.encryptPassword(userPass);
        file.WriteUsersInCSV(userName, newPassword);

    }

    public void viewUser() {

        data = file.readCSV();
        System.out.println("\n\n");
        System.out.printf("         %-10s   | %-10s\n", "Users", "Paswords");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < data.size(); i++) {
            System.out.printf(" %-20s | %-20s\n", data.get(i)[0], encryptPassword.decryptPassword(data.get(i)[1]));
        }
        System.out.println("");
    }

    public void deleteProduct() {

        int idToDelete;
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<PairOfShoes> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();

        object = jsonFile.readObjects(PairOfShoes.class.getSimpleName());

        for (Object obj : object) {
            PairOfShoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, PairOfShoes.class);
            listOfShoes.add(shoes);
        }

        System.out.print(" Enter the product ID to delete: ");
        idToDelete = in.nextInt();

        inventory.deleteProduct(listOfShoes, idToDelete);

    }

    public void sellProduct() {

        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        int id;
        int quantity;
        boolean addMore = false;
        char opt;
        
        do {
            do {
                System.out.print(" Input the ID: ");
                id = in.nextInt();
            } while (!checkId(id));

            System.out.print(" How many pairs of shoes are you going to sell?: ");
            quantity = in.nextInt();
            checkStock(quantity);
            
            if (checkId(id) && checkStock(quantity)) {
                System.out.println(" Añadiendo al carrito...");
                ids.add(id);
                quantities.add(quantity);
            }
                        
            System.out.print(" Do you want to enter another product? [Y/N]: ");
            opt = in.next().charAt(0);
            
            addMore = 'Y' == opt || 'y' == opt;
            
        } while (addMore);
        
                //
        //addToCart(ids, quantities);
        
    }
    
    public void sellProduct(int id,int cant) {

        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        //int id;
        int quantity;
        //boolean addMore = false;
        char opt;
        
        ids.add(id);
        quantities.add(cant);       
                
        //addToCart(ids, quantities);
        
    }

    public PairOfShoes extractProduct(int id){
        PairOfShoes prod = null;
        
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<PairOfShoes> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();

        object = jsonFile.readObjects(PairOfShoes.class.getSimpleName());

        for (Object obj : object) {
            PairOfShoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, PairOfShoes.class);
            listOfShoes.add(shoes);
        }
        
        for (PairOfShoes shoe : listOfShoes) {
            if( shoe.getId() == id ){
                prod = shoe;
                return shoe;
            }
        }
        
        return prod;
        //return null;
    }
    
    public ArrayList<ShoppingCar> extractCart(){
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<ShoppingCar> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();
        object = jsonFile.readObjects(ShoppingCar.class.getSimpleName());
        
        for(Object obj : object){
            ShoppingCar shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, ShoppingCar.class);
            listOfShoes.add(shoes);
        }
        //System.out.println(listOfShoes.toString());
        return listOfShoes;
    }
    
    public void addToCart(int id, int quantities) {
        
        JsonFileAdministrator tempFile = new JsonFileAdministrator();
        PairOfShoes shoes ;
        ShoppingCar car;
        
        shoes = extractProduct(id);
        car = new ShoppingCar(
<<<<<<< HEAD
                quantities,(shoes.getId()),
=======
                quantities,
>>>>>>> c8345e324adb096f8f453d8ab8f4d83faed5950a
                (shoes.getColor() + " " + shoes.getShoeType() + " " + shoes.getBrand()),
                quantities*shoes.getPrice());
        
        tempFile.addToFile(car);      
        
    }

    public boolean checkStock(int quantity) {

        ArrayList<Object> object = new ArrayList<>();
        ArrayList<PairOfShoes> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();

        object = jsonFile.readObjects(PairOfShoes.class.getSimpleName());

        for (Object obj : object) {
            PairOfShoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, PairOfShoes.class);
            listOfShoes.add(shoes);
        }

        if (listOfShoes.stream().anyMatch((shoe) -> ((shoe.getStock()- quantity) > 0))) {            
            return true;
        }
        System.out.println(" Insufficient quantity....");
        return false;
    }

    private boolean checkId(int id) {

        ArrayList<Object> object = new ArrayList<>();
        ArrayList<PairOfShoes> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();

        object = jsonFile.readObjects(PairOfShoes.class.getSimpleName());

        for (Object obj : object) {
            PairOfShoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, PairOfShoes.class);
            listOfShoes.add(shoes);
        }

        if (listOfShoes.stream().anyMatch((shoe) -> (shoe.getId() == id))) {
            return true;
        }

        System.out.println("\n ID not found...");
        return false;
    }

    public void addUser() {

        User user;
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();

        System.out.println("\n");
        System.out.print(" Input the user name: ");
        userName = in.nextLine();
        System.out.print(" Input your Password: ");
        userPass = in.nextLine();

        newPassword = encryptPassword.encryptPassword(userPass);
        user = new User(userName, newPassword);
        jsonFile.addToFile(user);

    }
    
    public void addUser(String person,String pass) {

        User user;
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        
        userName = person;
        userPass = pass;
        
        newPassword = encryptPassword.encryptPassword(userPass);
        user = new User(userName, newPassword);
        jsonFile.addToFile(user);

    }

    public ArrayList<User> readUsers() {
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<User> listOfUsers = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();
        object = jsonFile.readObjects(User.class.getSimpleName());

        for (int i = 0; i < object.size(); i++) {
            User user;
            Object objectJ;
            objectJ = object.get(i);
            String jUser = gson.toJson(objectJ);
            user = gson.fromJson(jUser, User.class);
            listOfUsers.add(user);

        }

        return listOfUsers;

    }

    public void showUsers() {
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<User> listOfUsers = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();
        object = jsonFile.readObjects(User.class.getSimpleName());

        for (int i = 0; i < object.size(); i++) {
            User user;
            Object objectJ;
            objectJ = object.get(i);
            String jUser = gson.toJson(objectJ);
            user = gson.fromJson(jUser, User.class);
            listOfUsers.add(user);

        }

        System.out.println("\n\n");
        System.out.printf("| %-8s   | %-8s   |\n", "Users", "Paswords");
        System.out.println("---------------------------");

        listOfUsers.forEach((user) -> {
            System.out.printf("| %-10s | %-10s |\n", user.getUser(), encryptPassword.decryptPassword(user.getPassword()));
        });

    }

    public void showProduct() {

        inventory.showProducts();

    }
    
    public Customer clientData(){
        
        Customer client =  new Customer();
        in.nextLine();
        System.out.println("Input the name: ");
        client.setName(in.nextLine());
        System.out.println("Input the telephone: ");
        client.setTelephone(in.nextInt());
        System.out.println("Input the email:");
        client.setEmail(in.nextLine());
        
        
        return client;
    }
    
}
