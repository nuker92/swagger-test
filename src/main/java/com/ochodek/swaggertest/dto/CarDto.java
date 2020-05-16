package com.ochodek.swaggertest.dto;

import com.ochodek.swaggertest.enums.CarBrand;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CarDto {

    @ApiModelProperty(value = "Brand of the car")
    private CarBrand brand;
    @ApiModelProperty(value = "License Plate of the car")
    private String licensePlate;
    @ApiModelProperty(value = "Age of the car")
    private int age;

    public CarDto() {
        // empty
    }

    public CarDto(CarBrand brand, String licensePlate, int age) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.age = age;
    }
}
