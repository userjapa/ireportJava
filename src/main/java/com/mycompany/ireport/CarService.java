package com.mycompany.ireport;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CarService implements ICarService {

//    @Autowired
//    private JdbcTemplate jtm;
    
    @Autowired
    private ICarRepository carRepo;

    @Override
    public List<Car> findAll() {

//        String sql = "SELECT * FROM Cars";
//
//        List<Car> cars = jtm.query(sql, new BeanPropertyRowMapper(Car.class));
//
//        return cars;
        return carRepo.findAll();
    }
}