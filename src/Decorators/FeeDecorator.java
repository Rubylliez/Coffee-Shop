package Decorators;

import Types.Coffee;

public class FeeDecorator extends CoffeeDecorator {
    public FeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double addFee(double cost) {
        return 0.12 * cost;
    }
}
