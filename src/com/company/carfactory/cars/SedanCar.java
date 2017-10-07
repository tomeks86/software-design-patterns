package com.company.carfactory.cars;

public class SedanCar extends Car {
    public SedanCar(CarType model) {
        super(model);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building a sedan car!");
    }
}
