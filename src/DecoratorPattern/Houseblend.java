package DecoratorPattern;

public class Houseblend extends Beverage {

    public Houseblend(){
        desc = "Houseblend";

    }
    @Override
    public double cost() {
        return 0.89;
    }
}
