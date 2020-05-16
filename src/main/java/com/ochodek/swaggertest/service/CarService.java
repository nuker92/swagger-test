package com.ochodek.swaggertest.service;

import com.ochodek.swaggertest.dto.CarDto;
import com.ochodek.swaggertest.model.Car;
import com.ochodek.swaggertest.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarDto> findAll() {
        return carRepository.findAll().stream()
                .map(car -> {
                    CarDto dto = new CarDto();
                    dto.setBrand(car.getBrand());
                    dto.setAge(car.getAge());
                    dto.setLicensePlate(car.getLicensePlate());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    public Car add(CarDto carDto) {
        return carRepository.save(new Car(carDto.getBrand(), carDto.getAge(), carDto.getLicensePlate()));
    }

    public Car findById(Long id) {
        return carRepository.findById(id).orElse(null);
    }


}
