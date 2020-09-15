/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template jsonFile, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.controller;

import com.google.gson.Gson;
import ec.edu.espe.pim.model.User;
import ec.edu.espe.pim.utils.Encryption;
import java.util.ArrayList;
import java.util.Scanner;
import ec.edu.espe.pim.model.PairOfShoes;
import ec.edu.espe.pim.model.ShoppingCar;
import ec.edu.espe.pim.utils.FileUsers;
import ec.edu.espe.pim.utils.IDataAccessObject;
import ec.edu.espe.pim.utils.JsonFileAdministrator;
import ec.edu.espe.pim.utils.MongoDBManager;
import javax.swing.JOptionPane;

/**
 *
 * @author S-Developers
 */
public class UserActivity {

    Scanner in = new Scanner(System.in);
    Encryption encryptPassword = new Encryption();
    FileUsers fileUsers = new FileUsers();
    ArrayList<String[]> data = new ArrayList<>();
    Inventory inventory = new Inventory();
    ArrayList<ShoppingCar> cart = new ArrayList<>();
    IDataAccessObject dataAccessObject = new MongoDBManager();
    
    private String newPassword;
    private String userName;
    private String userPass;

    public void deleteProduct() {

        int idToDelete;
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<PairOfShoes> listOfShoes = new ArrayList<>();
        Gson gson = new Gson();

        object = dataAccessObject.readObjects(PairOfShoes.class.getSimpleName());

        for (Object obj : object) {
            PairOfShoes shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, PairOfShoes.class);
            listOfShoes.add(shoes);
        }

        idToDelete = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el código del zapato que desee eliminiar"));

        inventory.deleteProduct(listOfShoes, idToDelete);

    }

    public void sellProduct(int id,int cant) {

        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        //int id;
        int quantity;
        char opt;
        
        ids.add(id);
        quantities.add(cant);       
                
    }

    public PairOfShoes extractProduct(int id){
        PairOfShoes prod = null;
        
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<PairOfShoes> listOfShoes = new ArrayList<>();

        objects = dataAccessObject.findObjects(id, "PairOfShoes");
        int _id = ((PairOfShoes)objects.get(0)).getId();
        int _size = ((PairOfShoes)objects.get(0)).getSize();
        String _color = ((PairOfShoes)objects.get(0)).getColor();
        String _brand = ((PairOfShoes)objects.get(0)).getBrand();
        float _price = ((PairOfShoes)objects.get(0)).getPrice();
        String _shoeType = ((PairOfShoes)objects.get(0)).getShoeType();
        int _stock = ((PairOfShoes)objects.get(0)).getStock();
        for (PairOfShoes shoe : listOfShoes) {
            if (shoe.getId() == id) {
                prod = shoe;
                return shoe;
            }
        }
        return new PairOfShoes(_id, _size, _color, _brand, _price, _shoeType, _stock);
    }
    public ArrayList<ShoppingCar> extractCart() {
        ArrayList<Object> object = new ArrayList<>();
        ArrayList<ShoppingCar> listOfShoes = new ArrayList<>();
        JsonFileAdministrator jsonFile = new JsonFileAdministrator();
        Gson gson = new Gson();
        object = jsonFile.readObjects(ShoppingCar.class.getSimpleName());

        for (Object obj : object) {
            ShoppingCar shoes;
            String shoe = gson.toJson(obj);
            shoes = gson.fromJson(shoe, ShoppingCar.class);
            listOfShoes.add(shoes);
        }
        return listOfShoes;
    }
    public void addToCart(int id, int quantities) {

        JsonFileAdministrator tempFile = new JsonFileAdministrator();
        PairOfShoes shoes;
        ShoppingCar car;

        shoes = extractProduct(id);
        car = new ShoppingCar(
                quantities, (shoes.getId()),
                (shoes.getColor() + " " + shoes.getShoeType() + " " + shoes.getBrand()),
                quantities * shoes.getPrice());

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

        object = dataAccessObject.readObjects(PairOfShoes.class.getSimpleName());

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

        System.out.println("\n");
        System.out.print(" Input the user name: ");
        userName = in.nextLine();
        System.out.print(" Input your Password: ");
        userPass = in.nextLine();

        newPassword = encryptPassword.encryptPassword(userPass);
        user = new User(userName, newPassword);
        dataAccessObject.addToFile(user);

    }
    
    public void addUser(String person,String pass) {

        User user;
        
        userName = person;
        userPass = pass;
        
        newPassword = encryptPassword.encryptPassword(userPass);
        user = new User(userName, newPassword);
        dataAccessObject.addToFile(user);

    }

    public ArrayList<User> readUsers() {
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<User> listOfUsers = new ArrayList<>();
            objects = dataAccessObject.readObjects("Users");

        for (int i = 0; i < objects.size(); i++) {
            listOfUsers.add((User)objects.get(i));
        }
        return listOfUsers;
    }

    public void showUsers() {
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<User> listOfUsers = new ArrayList<>();
        Gson gson = new Gson();
        objects = dataAccessObject.readObjects("Users");

         for (int i = 0; i < objects.size(); i++) {
            listOfUsers.add((User)objects.get(i));
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
    
}
