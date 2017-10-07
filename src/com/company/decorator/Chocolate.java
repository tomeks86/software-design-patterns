package com.company.decorator;

public class Chocolate extends DrinkIngredient {
    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", chocolate";
    }

    @Override
    public double calculateCosts() {
        return drink.calculateCosts() + 1.5;
    }
}
