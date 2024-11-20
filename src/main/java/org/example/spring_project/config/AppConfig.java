package org.example.spring_project.config;

import org.example.spring_project.model.Car;
import org.example.spring_project.model.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car car(){
        return new Car ("Tesla", "Model 3");
    }
    @Bean
    public Owner owner(){
        return new Owner("Diana");
    }
}
