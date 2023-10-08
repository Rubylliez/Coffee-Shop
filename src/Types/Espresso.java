package Types;

public class Espresso implements Coffee {
    @Override
    public double cost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
