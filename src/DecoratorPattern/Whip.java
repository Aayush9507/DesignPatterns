package DecoratorPattern;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
       this.beverage = beverage;
    }
    @Override
    public String getDesc() {
        return beverage.getDesc()+ ",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+.20;
    }
}
