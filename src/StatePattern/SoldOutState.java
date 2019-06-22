package StatePattern;

public class SoldOutState implements State{

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("Machine is sold out already");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you cant eject, no quarter inserted");
    }

    @Override
    public void turnCrank() {
        System.out.println("no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumballs dispensed");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
