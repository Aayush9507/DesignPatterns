package FactoryMethodPattern;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nystore = new NYPizzaStore();
        PizzaStore utstore = new UtahPizzaStore();


        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Aayush ordered" +pizza.getName() + "\n");
        Pizza pizza1 = utstore.orderPizza("cheese");
        System.out.println("Itish ordered" +pizza1.getName() +  "\n");


    }
}
