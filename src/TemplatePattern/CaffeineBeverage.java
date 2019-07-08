package TemplatePattern;

//The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
// Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.
//Here prepareRecipe() is our template method

public abstract class CaffeineBeverage {

    final void prepareRecipe(){

        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }


    }

    boolean customerWantsCondiments() {
        return true;
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Add boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring in the cup");
    }

}
