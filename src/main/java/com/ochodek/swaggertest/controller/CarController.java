package com.ochodek.swaggertest.controller;

import com.ochodek.swaggertest.dto.CarDto;
import com.ochodek.swaggertest.model.Car;
import com.ochodek.swaggertest.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarDto> findAll() {
        return carService.findAll();
    }



}
