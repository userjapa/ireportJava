package com.mycompany.ireport;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table("car")
public class Car {
    
    @EmbeddedId
    private CarId id;
    private String name;
    private Integer price;
    
    public Car() {}

    public Car(String name, int price) {
        this.id = new CarId();
        this.name = name;
        this.price = price;
    }

    public CarId getId() {
        return id;
    }

    public void setId(CarId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
}