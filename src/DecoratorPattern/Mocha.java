package DecoratorPattern;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;

    }
    @Override
    public String getDesc() {
        return beverage.getDesc()+",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+ 0.20;
    }
}
