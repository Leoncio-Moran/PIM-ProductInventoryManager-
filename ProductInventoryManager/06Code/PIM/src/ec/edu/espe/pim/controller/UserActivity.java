/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template jsonFile, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import com.google.gson.Gson;
import ec.edu.espe.pim.model.FileAdministrator;
import ec.edu.espe.pim.model.Inventory;
import ec.edu.espe.pim.model.JsonFileAdministrator;
import ec.edu.espe.pim.model.Users;
import ec.edu.espe.pim.utils.Encryption;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexandra Moscoso
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
            System.out.printf(" %-20s | %-20s\n", data.get(i)[0], encryptPassword.decrypt(data.get(i)[1]));
        }
        System.out.println("");
    }

    public void deleteProduct() {

        int idToDelete;
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<Shoes> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();

        object = jsonFile.readObjects(Shoes.class.getSimpleName());

        for (Object obj : object) {
            Shoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, Shoes.class);
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
        
                
        addToCart(ids, quantities);
        
    }

    public Shoes extractProduct(int id){
        Shoes prod = null;
        
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<Shoes> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();

        object = jsonFile.readObjects(Shoes.class.getSimpleName());

        for (Object obj : object) {
            Shoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, Shoes.class);
            listOfShoes.add(shoes);
        }
        
        for (Shoes shoe : listOfShoes) {
            if( shoe.getId() == id ){
                prod = shoe;
                return shoe;
            }
        }
        
        return prod;
        //return null;
    }
    
    private void addToCart(ArrayList<Integer> ids, ArrayList<Integer> quantities) {
        
        Bill bill = new Bill();
        Shoes shoes ;
        ShoppingCar car = null ;
        for(int i = 0 ; i < ids.size() ; i++){
            
            shoes = extractProduct(ids.get(i));
            
            car = new ShoppingCar(
                    quantities.get(i), //quanttities
                    (shoes.getColor() + " " + shoes.getShoeType() + " " + shoes.getBrand()), // Product
                    (quantities.get(i) * shoes.getPrice()) ); //  total price
           cart.add(car);
        }
        
        
        bill.clientBill(cart, clientData());
        
    }

    private boolean checkStock(int quantity) {

        ArrayList<Object> object = new ArrayList<>();
        ArrayList<Shoes> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();

        object = jsonFile.readObjects(Shoes.class.getSimpleName());

        for (Object obj : object) {
            Shoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, Shoes.class);
            listOfShoes.add(shoes);
        }

        if (listOfShoes.stream().anyMatch((shoe) -> ((shoe.getStock() - quantity) > 0))) {            
            return true;
        }
        System.out.println(" Insufficient quantity....");
        return false;
    }

    private boolean checkId(int id) {

        ArrayList<Object> object = new ArrayList<>();
        ArrayList<Shoes> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();

        object = jsonFile.readObjects(Shoes.class.getSimpleName());

        for (Object obj : object) {
            Shoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, Shoes.class);
            listOfShoes.add(shoes);
        }

        if (listOfShoes.stream().anyMatch((shoe) -> (shoe.getId() == id))) {
            return true;
        }

        System.out.println("\n ID not found...");
        return false;
    }

    public void addUser() {

        Users user;
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();

        System.out.println("\n");
        System.out.print(" Input the user name: ");
        userName = in.nextLine();
        System.out.print(" Input your Password: ");
        userPass = in.nextLine();

        newPassword = encryptPassword.encryptPassword(userPass);
        user = new Users(userName, newPassword);
        jsonFile.addToFile(user);

    }

    public ArrayList<Users> readUsers() {
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<Users> listOfUsers = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();
        object = jsonFile.readObjects(Users.class.getSimpleName());

        for (int i = 0; i < object.size(); i++) {
            Users user;
            Object objectJ;
            objectJ = object.get(i);
            String jUser = gson.toJson(objectJ);
            user = gson.fromJson(jUser, Users.class);
            listOfUsers.add(user);

        }

        return listOfUsers;

    }

    public void showUsers() {
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<Users> listOfUsers = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();
        object = jsonFile.readObjects(Users.class.getSimpleName());

        for (int i = 0; i < object.size(); i++) {
            Users user;
            Object objectJ;
            objectJ = object.get(i);
            String jUser = gson.toJson(objectJ);
            user = gson.fromJson(jUser, Users.class);
            listOfUsers.add(user);

        }

        System.out.println("\n\n");
        System.out.printf("| %-8s   | %-8s   |\n", "Users", "Paswords");
        System.out.println("---------------------------");

        listOfUsers.forEach((user) -> {
            System.out.printf("| %-10s | %-10s |\n", user.getUser(), encryptPassword.decrypt(user.getPassword()));
        });

    }

    public void showProduct() {

        inventory.showProducts();

    }
    
    public Client clientData(){
        
        Client client =  new Client();
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
