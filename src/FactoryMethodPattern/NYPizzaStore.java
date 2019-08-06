package FactoryMethodPattern;

public class  NYPizzaStore  extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        if(type.equals("veg")){
            return new NYStyleVegPizza();
        }
        else

            return null;
    }
}
