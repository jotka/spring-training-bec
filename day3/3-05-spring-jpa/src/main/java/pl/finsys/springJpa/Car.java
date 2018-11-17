package pl.finsys.springJpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class Car {
    @Id
    @Column(name = "CAR_ID")
    private long id;
    @Column(name = "CAR_COMPANY")
    private String company;
    @Column(name = "CAR_MODEL")
    private String model;
    @Column(name = "CAR_PRICE")
    private long price;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Car(long id, String company, String model, long price) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.price = price;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
            "id=" + id +
            ", company='" + company + '\'' +
            ", model='" + model + '\'' +
            ", price=" + price +
            '}';
    }
}