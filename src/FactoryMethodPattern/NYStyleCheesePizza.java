package FactoryMethodPattern;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        name = "NY style sauce and cheese";
        dough = "NY style cheese dough";
        sauce = "NY cheese sauce";
        toppings.add("Grated cheese");
    }

}
