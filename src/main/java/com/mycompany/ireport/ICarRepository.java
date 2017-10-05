package com.mycompany.ireport;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, CarId> {
    
}
