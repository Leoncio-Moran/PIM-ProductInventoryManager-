package ec.edu.espe.pim.controller;

public class Shoes {

  
    private int id;
    private int size;
    private String color;
    private String brand;
    private float price;
    private String shoeType;
    private int stock;
    
    public Shoes(int idPairOfShoes, int size, String color, String brand, float price, String shoeType, int stock) {
        this.id = idPairOfShoes;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.shoeType = shoeType;
        this.stock = stock;
    }

    public Shoes() {
    }       

    public int getId() {
        return id;
    }

    public void setId(int idPairOfShoes) {
        this.id = idPairOfShoes;
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
    

    @Override
    public String toString() {
        return "\n id = " + id + ", size = " + size + ", stock ="+ stock +
               "\n color =" + color + ", brand = " + brand + 
               "\n price =" + price + ", shoeType =" + shoeType;
    }
    
    
}
