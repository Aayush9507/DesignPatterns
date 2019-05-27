package DecoratorPattern;

public class Darkroast extends Beverage {

    public Darkroast(){
        desc="Dark roast";
    }
    @Override
    public double cost() {
        return 1.59;
    }
}
