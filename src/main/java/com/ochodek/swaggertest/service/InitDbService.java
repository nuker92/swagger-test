package com.ochodek.swaggertest.service;

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
        carService.add(new Car(CarBrand.AUDI, 2, "SK000111"));
        carService.add(new Car(CarBrand.MERCEDES, 1, "SK111000"));
    }

}
