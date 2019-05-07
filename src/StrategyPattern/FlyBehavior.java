package StrategyPattern;

public interface FlyBehavior {
    public void fly();

    public class FlyWithWings implements FlyBehavior{
        @Override
        public void fly() {
            System.out.println("I am flying");
        }
    }

    public class FlyNoWay implements FlyBehavior{
        @Override
        public void fly() {
            System.out.println("I cannot fly");
        }
    }

    public class FlyRocketPowered implements FlyBehavior{
        @Override
        public void fly() {
            System.out.println("I am flying with rocket");
        }
    }



}
