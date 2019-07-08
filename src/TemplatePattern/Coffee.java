package TemplatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffe");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    boolean customerWantsCondiments() {

        String ans = getUserInput();

        if (ans.toLowerCase().startsWith("y")){
            return true;
        }
        else {
            return false;
        }

    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk with your coffee? (y/n) ?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        }
        catch (IOException ioe){
            System.out.println("Error reading input");
        }

        if(answer == null){
            return "no";
        }
        return answer;
    }
}
