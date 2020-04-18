package com.sasza.tymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public CarController() {
        Car car1 = new Car("BMW","5");
        Car car2 = new Car("Fiat","1255");
        Car car3 = new Car("VW","Polo");
     //   Car car4 = new Car("Subaru","Forester");
       cars = new ArrayList<>();
       cars.add(car1);
       cars.add(car2);
       cars.add(car3);


    }

    @GetMapping("/")
    public String getCar(Model model) {
        model.addAttribute("cars",cars);
        model.addAttribute("newCar",new Car());
        return "car";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car){
        System.out.println(car);
        cars.add(car);
        return "redirect:/";
    }
}
