package com.company.adapter;

public class Main {
    public static void main(String[] args) {
        WizardAdapter wiz1 = new WizardAdapter();
        double dec;
        for (int i = 0; i < 20; i++) {
            System.out.printf("action %2d: ", i + 1);
            dec = Math.random();
            if (dec < 0.33) wiz1.attack();
            else if (dec < 0.66) wiz1.defend();
            else wiz1.escape();
        }
    }
}
