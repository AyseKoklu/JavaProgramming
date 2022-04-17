package day10_NestedIf;

import org.w3c.dom.ls.LSOutput;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even"); // String
        }
        else {
            System.out.println("Odd"); // String
        }

        System.out.println("-----------------------------");

        String result1 = (n % 2 == 0)? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("-----------------------------");

        int age = 23;
        if (age >= 21) {
            System.out.println("Eligible"); // String
        }
        else {
            System.out.println("Not Eligible"); // String
        }

        String eligible = (age >= 21)? "Eligible" : "Not Eligible";
        System.out.println(eligible);

        System.out.println("------------------------");


        int number = 100;
        /*
        if (number > 0){
            System.out.println("Positive");
        }
        else if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
        */

        String posNegZer= (number > 0)? "Positive" :(number < 0)? "Negative" : "Zero";
        System.out.println(posNegZer);

    }

}
