package com.ochodek.swaggertest.model;

import com.ochodek.swaggertest.enums.CarBrand;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private CarBrand brand;
    private String licensePlate;
    private int age;

    public Car() {
        // empty
    }

    public Car(CarBrand brand, int age, String licensePlate) {
        this.brand = brand;
        this.age = age;
        this.licensePlate = licensePlate;
    }
}
