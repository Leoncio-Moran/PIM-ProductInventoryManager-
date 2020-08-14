
package ec.edu.espe.pim.model;

public class Customer {
    
    private int ci;
    private String name;
    private String lastName;
    private int telephone;
    private String addrress;
    private String email;
   

    public Customer(int ci, String name, String lastName, int telephone, String addrress, String email) {
        this.ci = ci;
        this.name = name;
        this.lastName = lastName;
        this.telephone = telephone;
        this.addrress = addrress;
        this.email = email;        
    }
    
    
    public Customer() {
                
    }

    
    
    public int getId() {
        return ci;
    }

    public void setId(int id) {
        this.ci = id;
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

    
    @Override
    public String toString() {
        return "Client{" + "id=" + ci + ", name=" + name + ", lastName=" + lastName + ", telephone=" + telephone + ", addrress=" + addrress + ", email=" + email + '}';
    }
    
    
}
