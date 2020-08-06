package ec.edu.espe.pim.controller;

public class Shoes {

  
    private int id;
    private int size;
    private String color;
    private String brand;
    private float price;
    private String shoeType;
    private int stock;
    private String shoefor;

    public Shoes(int id, int size, String color, String brand, float price, String shoeType, int stock, String shoefor) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.shoeType = shoeType;
        this.stock = stock;
        this.shoefor = shoefor;
    }

    public Shoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getShoeType() {
        return shoeType;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getShoefor() {
        return shoefor;
    }

    public void setShoefor(String shoefor) {
        this.shoefor = shoefor;
    }
    

    @Override
    public String toString() {
        return "Shoes{" + "id=" + id + ", size=" + size + ", color=" + color + ", brand=" + brand + ", price=" + price + ", shoeType=" + shoeType + ", stock=" + stock + ", shoefor=" + shoefor + '}';
    }
    
   
}
