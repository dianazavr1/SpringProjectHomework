package org.example.spring_project.service;

import org.example.spring_project.model.Car;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public Car getCar(){
        return new Car ("Ford", "Mustang");
    }

}
