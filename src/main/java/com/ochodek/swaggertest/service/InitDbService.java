package com.ochodek.swaggertest.service;

import com.ochodek.swaggertest.dto.CarDto;
import com.ochodek.swaggertest.enums.CarBrand;
import com.ochodek.swaggertest.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class InitDbService {

    private CarService carService;

    @Autowired
    public InitDbService(CarService carService) {
        this.carService = carService;
    }

    @PostConstruct
    private void initDb() {
        carService.add(new CarDto(CarBrand.AUDI, "SK000111", 2));
        carService.add(new CarDto(CarBrand.MERCEDES, "SK111000", 1));
    }

}
