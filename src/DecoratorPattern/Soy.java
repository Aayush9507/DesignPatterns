package DecoratorPattern;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    Soy(Beverage beverage){
        this.beverage=beverage;

    }
    @Override
    public String getDesc() {

        return beverage.getDesc()+ ",Soy";
    }

    @Override
    public double cost() {

        double cost = beverage.cost();

        if (beverage.getSize()==Size.TALL){
            cost+=.10;
        }
        if (beverage.getSize()==Size.GRANDE){
            cost+=.15;
        }
        if (beverage.getSize()==Size.VENTI){
            cost+=.20;
        }


        return beverage.cost()+.20;
    }
}
