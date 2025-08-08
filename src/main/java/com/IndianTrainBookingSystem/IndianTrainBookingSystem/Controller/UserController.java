package com.IndianTrainBookingSystem.IndianTrainBookingSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {
    @GetMapping("/hello")
    public String sayHelloWorld(){
        return "HELLO WORLD";
    }
}
