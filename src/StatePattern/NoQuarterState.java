package StatePattern;


public class NoQuarterState implements State {

    GumballMachine gumballmachine;

    public NoQuarterState(GumballMachine gumballmachine){
        this.gumballmachine = gumballmachine;

    }

    public void insertQuarter(){
        System.out.println("You inserted a quarter");
        gumballmachine.setState(gumballmachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() {

    }

}

