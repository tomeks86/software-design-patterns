package com.company.decorator;

public abstract class DrinkIngredient implements Drink {
    protected Drink drink;

    public DrinkIngredient(Drink drink) {
        this.drink = drink;
    }
}
