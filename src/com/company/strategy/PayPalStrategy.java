package com.company.strategy;

public class PayPalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("PayPal payment, amount to pay: %6.2f%n", amount);
    }

    @Override
    public String showName() {
        return "PayPal payment strategy";
    }
}
