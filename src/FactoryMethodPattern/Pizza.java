package FactoryMethodPattern;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("preparing " +name);
        System.out.println("tossing dough");
        System.out.println("adding sauce");
        for (String top: toppings){
            System.out.println(" "+top);
        }

    }
    void bake(){
        System.out.println("Baking  pizza");
    }

    void cut(){
        System.out.println("cutting pizza");
    }

    void box(){
        System.out.println("adding to box");
    }

    public String getName(){
        return name;
    }
}
