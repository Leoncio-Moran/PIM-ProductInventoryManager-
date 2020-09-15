/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.utils;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.ReadPreference;
import ec.edu.espe.pim.model.PairOfShoes;
import ec.edu.espe.pim.model.ShoppingCar;
import ec.edu.espe.pim.model.User;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Cursor;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class MongoDBManager implements IDataAccessObject {

    Mongo mongo;
    DB db;
    DBCollection dBCollection;
    DBObject dBObject;
    BasicDBObjectBuilder basicDBObject = BasicDBObjectBuilder.start();

    private DBObject createDBObject(Object object) {
        if (object instanceof PairOfShoes) {
            basicDBObject.append("id", "" + ((PairOfShoes) object).getId() + "");
            basicDBObject.append("size", "" + ((PairOfShoes) object).getSize() + "");
            basicDBObject.append("color", "" + ((PairOfShoes) object).getColor() + "");
            basicDBObject.append("brand", "" + ((PairOfShoes) object).getBrand() + "");
            basicDBObject.append("price", "" + String.valueOf(((PairOfShoes) object).getPrice()) + "");
            basicDBObject.append("shoeType", "" + ((PairOfShoes) object).getShoeType() + "");
            basicDBObject.append("stock", "" + ((PairOfShoes) object).getStock() + "");
        } else if (object instanceof User) {
            basicDBObject.append("user", "" + ((User) object).getUser() + "");
            basicDBObject.append("password", "" + ((User) object).getPassword() + "");
        } else if (object instanceof ShoppingCar) {
            basicDBObject.append("quantity", "" + ((ShoppingCar) object).getQuantity() + "");
            basicDBObject.append("code", "" + ((ShoppingCar) object).getCode() + "");
            basicDBObject.append("product", "" + ((ShoppingCar) object).getProduct() + "");
            basicDBObject.append("price", "" + ((ShoppingCar) object).getPrice() + "");
        }

        return basicDBObject.get();
    }

    private void connectToMongoDB() {
        try {
            mongo = new Mongo("localhost", 27017);
        } catch (UnknownHostException ex) {
            Logger.getLogger(MongoDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private DBCollection selectCollection(Object object) {
        if (object instanceof PairOfShoes) {
            dBCollection = db.getCollection("PairOfShoes");
            return dBCollection;
        } else if (object instanceof User) {
            dBCollection = db.getCollection("Users");
            return dBCollection;
        }
        return null;
    }

    @Override
    public void addToFile(Object object) {
        dBObject = createDBObject(object);
        connectToMongoDB();
        db = mongo.getDB("JsonImportDB");
        dBCollection = selectCollection(object);
        dBCollection.insert(dBObject);
    }

    @Override
    public ArrayList<Object> readObjects(String nameCollection) {
        Object object;
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<DBObject> dbObjects = new ArrayList<>();
        connectToMongoDB();
        db = mongo.getDB("JsonImportDB");
        dBCollection = db.getCollection(nameCollection);
        DBCursor dBCursor = dBCollection.find();
        while (dBCursor.hasNext()) {
            dBObject = dBCursor.next();
            dbObjects.add(dBObject);
        }

        for (int i = 0; i < dbObjects.size(); i++) {
            if (nameCollection.equals("PairOfShoes")) {
                BasicDBObject Obj = (BasicDBObject) dbObjects.get(i);
                int id = Integer.parseInt(Obj.getString("id"));
                int size = Integer.parseInt(Obj.getString("size"));
                String color = Obj.getString("color");
                String brand = Obj.getString("brand");
                float price = Float.parseFloat(Obj.getString("price"));
                String shoeType = Obj.getString("shoeType");
                int stock = Integer.parseInt(Obj.getString("stock"));

                PairOfShoes pairOfShoes = new PairOfShoes(id, size, color, brand, price, shoeType, stock);
                objects.add(pairOfShoes);

            } else if (nameCollection.equals("Users")) {
                BasicDBObject Obj = (BasicDBObject) dbObjects.get(i);
                String userName = Obj.getString("user");
                String password = Obj.getString("password");

                User user = new User(userName, password);
                objects.add(user);
            }
        }
        //mongo.close();
        return objects;
    }

    public void eraseDocument(BasicDBObject bObject, DBCollection bCollection) {

        bCollection.remove(dBObject);
    }

    @Override
    public ArrayList<Object> findObjects(int queryFind, String nameCollection) {
        Object object;
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<DBObject> dbObjects = new ArrayList<>();
        BasicDBObject queryDbObject = new BasicDBObject();
        connectToMongoDB();
        db = mongo.getDB("JsonImportDB");
        dBCollection = db.getCollection(nameCollection);
        queryDbObject.put("id", queryFind);
        DBCursor dBCursor = dBCollection.find(queryDbObject);
        while (dBCursor.hasNext()) {
            dBObject = dBCursor.next();
            dbObjects.add(dBObject);
        }

        for (int i = 0; i < dbObjects.size(); i++) {
            if (nameCollection.equals("PairOfShoes")) {
                BasicDBObject Obj = (BasicDBObject) dbObjects.get(i);
                int id = Integer.parseInt(Obj.getString("id"));
                int size = Integer.parseInt(Obj.getString("size"));
                String color = Obj.getString("color");
                String brand = Obj.getString("brand");
                float price = Float.parseFloat(Obj.getString("price"));
                String shoeType = Obj.getString("shoeType");
                int stock = Integer.parseInt(Obj.getString("stock"));

                PairOfShoes pairOfShoes = new PairOfShoes(id, size, color, brand, price, shoeType, stock);
                objects.add(pairOfShoes);

            } else if (nameCollection.equals("Users")) {
                BasicDBObject Obj = (BasicDBObject) dbObjects.get(i);
                String userName = Obj.getString("user");
                String password = Obj.getString("password");

                User user = new User(userName, password);
                objects.add(user);
            } else if (nameCollection.equals("ShoppingCar")) {
                BasicDBObject Obj = (BasicDBObject) dbObjects.get(i);
                int quantity = Integer.parseInt(Obj.getString("quantity"));
                int code = Integer.parseInt(Obj.getString("code"));
                String product = Obj.getString("product");
                float price = Float.parseFloat(Obj.getString("price"));
                
                ShoppingCar shoppingCar = new ShoppingCar(quantity, code, product, price);
                objects.add(shoppingCar);
            }
        }
        //mongo.close();
        return objects;

    }

}
