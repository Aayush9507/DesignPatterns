package StrategyPattern;

public interface QuackBehavior {

    public void quack();

    public class Quack implements QuackBehavior{
        @Override
        public void quack() {
            System.out.println("Quack");
        }
    }

    public class MuteQuack implements QuackBehavior{
        @Override
        public void quack() {
            System.out.println("Silenceee");
        }
    }

    public class Squeak implements QuackBehavior{
        @Override
        public void quack() {
            System.out.println("Squeakk");
        }
    }


    }

