package com.ochodek.swaggertest.repository;

import com.ochodek.swaggertest.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends JpaRepository<Car, Long> {



}
