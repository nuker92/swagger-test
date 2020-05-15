package com.ochodek.swaggertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping
    public String helloWorld(@RequestParam(defaultValue = "World") String name) {

        return "Hello " + name + "Obecnie mamy: " + LocalDateTime.now();
    }



}
