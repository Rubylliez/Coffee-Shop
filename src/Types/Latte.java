package Types;

public class Latte implements Coffee {
    @Override
    public double cost() {
        return 3.0;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
