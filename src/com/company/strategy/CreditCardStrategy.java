package com.company.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private Integer cardNumber;
    private Integer cvv;

    public CreditCardStrategy(String name, Integer cardNumber, Integer cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Credit card payment, amount to pay: %6.2f%n", amount);
    }

    @Override
    public String showName() {
        return "Credit card payment strategy";
    }
}
