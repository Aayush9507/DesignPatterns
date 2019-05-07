package StrategyPattern;

public class MallardDuck extends Duck{


    public MallardDuck(){
        quackBehavior = new QuackBehavior.Quack();
        flyBehavior = new FlyBehavior.FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am real mallard duck");
    }

}
