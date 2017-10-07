package com.company.pizzafactory.pizzas;

import java.util.ArrayList;

public abstract class Pizza {
    private ArrayList<String> toppings = new ArrayList<>();
    private int size;
    private double dough;

    public Pizza(int size, double dough) {
        this.size = size;
        this.dough = dough;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public boolean addTopping(String s) {
        if (!toppings.contains(s)) {
            toppings.add(s);
            return true;
        }
        else return false;
    }

    public boolean removeTopping(String s) {
        if (toppings.contains(s)) {
            toppings.remove(s);
            return true;
        }
        else return false;
    }

    public int getSize() {
        return size;
    }

    public double getDough() {
        return dough;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDough(double dough) {
        this.dough = dough;
    }

    public void listPizzaParameters() {
        System.out.println();
        System.out.println("ordered pizza type: " + this.getClass().getSimpleName());
        System.out.print("toppings: ");
        for (String topping : toppings) {
            System.out.print(topping + " ");
        }
        System.out.println();
        System.out.println("requested dough: " + dough + " cm");
        System.out.println();
    }
}
