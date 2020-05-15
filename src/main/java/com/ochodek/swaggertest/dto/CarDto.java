package com.ochodek.swaggertest.dto;

import com.ochodek.swaggertest.enums.CarBrand;
import lombok.Data;

@Data
public class CarDto {

    private CarBrand brand;
    private String licensePlate;
    private int age;

}
