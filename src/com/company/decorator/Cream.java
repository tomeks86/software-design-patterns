package com.company.decorator;

public class Cream extends DrinkIngredient {
    public Cream(Drink decoratedDrink) {
        super(decoratedDrink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", cream";
    }

    @Override
    public double calculateCosts() {
        return drink.calculateCosts() + 2.0;
    }
}
