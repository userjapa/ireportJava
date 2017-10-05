package com.mycompany.ireport;

class CarSend {
    public String id;
    public String name;
    public Integer price;

    public CarSend(CarId id, String name, int price) {
        this.id = id.getId();
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer Price) {
        this.price = Price;
    }
    
    
    
}
