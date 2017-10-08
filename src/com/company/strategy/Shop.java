package com.company.strategy;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Item> shoppingChart = new ArrayList<>();
    private boolean paid = false;

    public boolean addItem(Item item) {
        shoppingChart.add(item);
        return true;
    }

    public boolean removeItem(Item item) {
        if (shoppingChart.contains(item)) {
            shoppingChart.remove(item);
            return true;
        }
        return false;
    }

    public float calculateTotal() {
        float total = 0;
        for (Item item : shoppingChart) {
            total += item.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentMethod) {
        if (!paid) {
            double amount = calculateTotal();
            paymentMethod.pay(amount);
            paid = true;
        } else System.out.println("Trying to pay with: " + paymentMethod.showName() + " but already paid!");
    }
}
