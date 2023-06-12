package Project.OrderManagementDemo.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "cust_demo")
public class Customer {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;
    private String name;
    private String adress;
    public Customer() {
    }
    public Customer(String name, String adress) {
        this.name = name;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
