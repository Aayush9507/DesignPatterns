package FactoryMethodPattern;

public class UtahStyleCheesePizza extends Pizza {

    public UtahStyleCheesePizza(){
        name = "UT style sauce and cheese";
        dough = "UT style cheese dough";
        sauce = "UT cheese sauce";
        toppings.add("Grated cheese with pineapple");
    }
}
