package Decorators;

import Types.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract double addFee(double cost);

    @Override
    public double cost() {
        return coffee.cost() + addFee(coffee.cost());
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}