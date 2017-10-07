package com.company.pizzafactory.factories;

import com.company.pizzafactory.pizzas.Pizza;

public class PizzaCreator {
    public Pizza getPizza(AbstractPizzaFactory factory) {
        return factory.createPizza();
    }
}
