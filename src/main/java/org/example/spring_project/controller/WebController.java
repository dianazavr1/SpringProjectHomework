package org.example.spring_project.controller;


import org.example.spring_project.model.Car;
import org.example.spring_project.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @Autowired
    public CarService carService;

    @GetMapping("/")
    public String home(Model model){
        Car car = carService.getCar();
        //model.addText("car");
        model.addAttribute("car", car);
        return "index";
    }
}
