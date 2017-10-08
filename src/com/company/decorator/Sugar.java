package com.company.decorator;

public class Sugar extends DrinkIngredient {
    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        String desc = drink.getDescription();
        if (desc.contains("x sugar")) {
            int ind = desc.lastIndexOf("x sugar");
            StringBuilder sb = new StringBuilder(desc.substring(0,ind - 2));
            int mult = Integer.parseInt(desc.substring(ind - 2, ind).replaceAll("^\\s+", ""));
            mult++;
            sb.append(String.format("%2d", mult));
            sb.append(desc.substring(ind));
            return sb.toString();
        }
        if (desc.contains("sugar")) return desc.replace("sugar", "2x sugar");
        return desc + ", sugar";
    }

    @Override
    public double calculateCosts() {
        return drink.calculateCosts();
    }
}
