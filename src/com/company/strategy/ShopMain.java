package com.company.strategy;

import java.util.Locale;

public class ShopMain {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Shop bakery = new Shop();
        Item bread1 = new Item("bread1", 2.5);
        bakery.addItem(bread1);
        bakery.addItem(new Item("bread2", 3));
        bakery.removeItem(bread1);
        bakery.removeItem(bread1);
        bakery.pay(new PayPalStrategy("myemail@gmail.com", "somePass"));
        bakery.pay(new CreditCardStrategy("Stefan Beton", 14234324, 243));
    }
}
