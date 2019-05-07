package StrategyPattern;

public class MiniDuckSimulator {

    public static void main(String[] args) {

            Duck mallard = new MallardDuck();

            mallard.performQuack();
            mallard.performFly();

            Duck model = new ModelDuck();
            model.performFly();
            model.setFlyBehavior(new FlyBehavior.FlyRocketPowered());
            model.performFly();
            model.performQuack();

    }
}
