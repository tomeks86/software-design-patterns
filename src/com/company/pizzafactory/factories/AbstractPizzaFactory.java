package com.company.pizzafactory.factories;

import com.company.pizzafactory.pizzas.Pizza;

public abstract class AbstractPizzaFactory {
    abstract public Pizza createPizza();

    abstract public Pizza createPizza(String[] toppingsAdd, int size, double dough);
}
