package Supplements;

import Types.Coffee;

public class Sugar implements Coffee {
    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}