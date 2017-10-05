package com.mycompany.ireport;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Embeddable;

@Embeddable
public class CarId implements Serializable {
    private String id;

    public CarId() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }   
    
}
