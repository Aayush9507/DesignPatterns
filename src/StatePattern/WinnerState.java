package StatePattern;

public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine=gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you cant insert another quarter");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {

        gumballMachine.releaseBall();
        if(gumballMachine.getCount()==0){
            gumballMachine.setState(gumballMachine.getSoldOutState());

        }
        else {
            gumballMachine.releaseBall();
            System.out.println("You are a winner, you got two gumballs");
            if (gumballMachine.getCount()>0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
            else {
                gumballMachine.state=gumballMachine.getSoldOutState();
            }
        }

    }

    @Override
    public void refill() {

    }
}
