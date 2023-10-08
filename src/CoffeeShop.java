import Supplements.Milk;
import Supplements.Sugar;
import Supplements.WhippedCream;
import Types.Americano;
import Types.Coffee;
import Types.Espresso;
import Types.Latte;

import Types.Coffee;
import Decorators.CoffeeDecorator;
import Decorators.FeeDecorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee latteWithFee = new FeeDecorator(new Latte());
        System.out.println("Cost with fee: " + latteWithFee.cost());
        System.out.println("Description: " + latteWithFee.getDescription());

        Coffee espressoWithFee = new FeeDecorator(new Espresso());
        System.out.println("Cost with fee: " + espressoWithFee.cost());
        System.out.println("Description: " + espressoWithFee.getDescription());

        Coffee americanoWithFee = new FeeDecorator(new Americano());
        System.out.println("Cost with fee: " + americanoWithFee.cost());
        System.out.println("Description: " + americanoWithFee.getDescription());
    }
}


