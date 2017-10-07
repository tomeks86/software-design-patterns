package com.company.carfactory.cars;

public class SmallCar extends Car {
    public SmallCar(CarType model) {
        super(model);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building a small car!");
    }
}
