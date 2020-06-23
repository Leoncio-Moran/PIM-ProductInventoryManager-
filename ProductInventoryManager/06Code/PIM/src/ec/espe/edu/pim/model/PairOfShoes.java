package ec.espe.edu.pim.model;


public class PairOfShoes {
    private int idPairOfShoes;
    private int size;
    private String color;
    private String brand;
    private float price;
    private String shoeType;

    public PairOfShoes(int idPairOfShoes, int size, String color, String brand, float price, String shoeType) {
        this.idPairOfShoes = idPairOfShoes;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.shoeType = shoeType;
    }

    public int getIdPairOfShoes() {
        return idPairOfShoes;
    }

    public void setIdPairOfShoes(int idPairOfShoes) {
        this.idPairOfShoes = idPairOfShoes;
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

    @Override
    public String toString() {
        return "PairOfShoes{" + "idPairOfShoes=" + idPairOfShoes + ", size=" + size + ", color=" + color + ", brand=" + brand + ", price=" + price + ", shoeType=" + shoeType + '}';
    }
    
    
}
