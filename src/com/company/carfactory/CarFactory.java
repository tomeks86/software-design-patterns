package com.company.carfactory;

import com.company.carfactory.cars.*;

public class CarFactory {
    public static Car buildCar(CarType model) {
        switch (model) {
            case SEDAN:
                return new SedanCar(model);
            case SMALL:
                return new SmallCar(model);
            case LUXURY:
                return new LuxuryCar(model);
            default:
                System.out.println("invalid car model selected!");
                return null;
        }
    }
}
