package Types;

public class Americano implements Coffee {
    @Override
    public double cost() {
        return 2.2;
    }

    @Override
    public String getDescription() {
        return "Americano";
    }
}

