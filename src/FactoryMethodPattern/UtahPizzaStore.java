package FactoryMethodPattern;

public class UtahPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {

        if(type.equals("cheese")){
            return new UtahStyleCheesePizza();
        }
        if(type.equals("veg")){
            return new UtahStyleVegPizza();
        }
        else

            return null;

    }
}
