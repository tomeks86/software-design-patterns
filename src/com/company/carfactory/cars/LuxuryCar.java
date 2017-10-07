package com.company.carfactory.cars;

public class LuxuryCar extends Car {
    public LuxuryCar(CarType model) {
        super(model);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building a luxury car!");
    }
}
