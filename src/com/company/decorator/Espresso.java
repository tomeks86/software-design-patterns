package com.company.decorator;

public class Espresso implements Drink {
    @Override
    public String getDescription() {
        return "Espresso coffee";
    }

    @Override
    public double calculateCosts() {
        return 2.0;
    }
}
