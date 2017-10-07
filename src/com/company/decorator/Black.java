package com.company.decorator;

public class Black implements Drink {
    @Override
    public String getDescription() {
        return "black coffee";
    }

    @Override
    public double calculateCosts() {
        return 3.5;
    }
}
