package ec.espe.edu.pim.model;

import java.util.Date;

public class Client {

    private int id;
    private String name;
    private String lastName;
    private String telephone;
    private String addrress;
    private String email;
    private ShoeEntryRegister createOrder;

    public Client() {
        name = "99999999999";
        lastName = "999999999999";
        telephone = "999999999999";
        addrress = "9999999999999";
        email = "999999999999";
        createOrder = null;
    }

    public Client(int id, String name, String lastName, String telephone, String addrress, String email, ShoeEntryRegister createOrder) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.telephone = telephone;
        this.addrress = addrress;
        this.email = email;
        this.createOrder = createOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddrress() {
        return addrress;
    }

    public void setAddrress(String addrress) {
        this.addrress = addrress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShoeEntryRegister getCreateOrder() {
        return createOrder;
    }

    public void setCreateOrder(ShoeEntryRegister createOrder) {
        this.createOrder = createOrder;
    }

    @Override
    public String toString() {
        return "Client:" + "\n id: " + id + "\n name: " + name + "\n lastName: " + lastName + "\n telephone: "
                + telephone + "\n addrress: " + addrress + "\n email: " + email + "\n createOrder: " + createOrder;
    }

}
