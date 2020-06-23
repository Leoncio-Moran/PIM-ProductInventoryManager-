
package ec.espe.edu.pim.model;

import java.util.Date;

public class Client {
    
    private int id;
    private String name;
    private String lastName;
    private int telephone;
    private String addrress;
    private String email;
    private CreateOrder createOrder; 

    public Client(int id, String name, String lastName, int telephone, String addrress, String email, CreateOrder createOrder) {
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
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

    public CreateOrder getCreateOrder() {
        return createOrder;
    }

    public void setCreateOrder(CreateOrder createOrder) {
        this.createOrder = createOrder;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", telephone=" + telephone + ", addrress=" + addrress + ", email=" + email + ", createOrder=" + createOrder + '}';
    }
    
    
}
