package Supplements;

import Types.Coffee;

public class WhippedCream implements Coffee {
    private Coffee coffee;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.4;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }
}