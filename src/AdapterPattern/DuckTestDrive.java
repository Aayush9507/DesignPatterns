package AdapterPattern;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The turkey says");

        turkey.gobble();
        turkey.fly();

        System.out.println("Duck says");
        testDuck(mallardDuck);
        testDuck(turkeyAdapter);


    }

    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
