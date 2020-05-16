package com.ochodek.swaggertest.controller;

import com.ochodek.swaggertest.dto.CarDto;
import com.ochodek.swaggertest.model.Car;
import com.ochodek.swaggertest.service.CarService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @ApiOperation(value = "Find all cars", notes = "Provide info about cars")
    public List<CarDto> findAll() {
        return carService.findAll();
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody CarDto carDto) {
        carService.add(carDto);
        return new ResponseEntity<>("You successfully add a car", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> findById(@ApiParam(value = "Id of car", example = "1") @PathVariable long id) {
        Car car = carService.findById(id);
        if (car != null) {
            return new ResponseEntity<>(car, HttpStatus.OK);
        }
        return new ResponseEntity<>(new Car(), HttpStatus.BAD_REQUEST);
    }

}
