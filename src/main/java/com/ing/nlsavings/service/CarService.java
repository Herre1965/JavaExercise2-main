package com.ing.nlsavings.service;

import com.ing.nlsavings.domain.Car;

import java.util.List;
import java.util.UUID;

public interface CarService extends List<Car> {

    void addCar(Car car);

    void deleteCarById(UUID carId);

    Car getCarById(UUID carId);

    List<Car> getAllCars();

    List<Car> getCarsByBrand(String brand);
}
