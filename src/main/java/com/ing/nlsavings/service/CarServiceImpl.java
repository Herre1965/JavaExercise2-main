package com.ing.nlsavings.service;

import com.ing.nlsavings.domain.Car;

import java.util.*;

public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        this.cars.add(car);
    }

    @Override
    public void deleteCarById(UUID carId) {
        this.cars.removeIf(car -> car.getUuid().equals(carId));
    }

    @Override
    public Car getCarById(UUID carId) {
        return this.cars.stream().filter(car -> car.getUuid().equals(carId)).findFirst().orElse(null);
    }

    @Override
    public List<Car> getAllCars() {
        return this.cars;
    }

    @Override
    public List<Car> getCarsByBrand(String brand) {
        return this.cars.stream()
                .filter(car -> car.getBrand().toString().equalsIgnoreCase(brand))
                .toList();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Car> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Car car) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Car> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Car> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Car get(int index) {
        return null;
    }

    @Override
    public Car set(int index, Car element) {
        return null;
    }

    @Override
    public void add(int index, Car element) {

    }

    @Override
    public Car remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Car> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Car> listIterator(int index) {
        return null;
    }

    @Override
    public List<Car> subList(int fromIndex, int toIndex) {
        return null;
    }
}
