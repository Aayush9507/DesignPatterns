package DecoratorPattern;

public abstract class CondimentDecorator extends Beverage{
    public abstract String getDesc();
    public Beverage beverage;

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}


