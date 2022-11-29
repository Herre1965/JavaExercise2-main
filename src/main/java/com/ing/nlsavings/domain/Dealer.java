package com.ing.nlsavings.domain;

import java.util.List;

public class Dealer {

    private List <Car> cars;
    private String name;
    private String city;

    public Dealer (String name, String city,List cars) {
        this.name = name;
        this.city = city;
        this.cars = cars;
        }

    public Dealer() {

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getCity() {return city;}

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCar() { return cars;}

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getDealerName() {
    return name;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

}






