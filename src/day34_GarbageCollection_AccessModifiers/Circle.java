package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    //public static ArrayList<Integer> numbers = new ArrayList<>();
    // numbers.add(10); we need a block for lines like this
    public static ArrayList<Integer> numbers;

    // public static Sheet sheet;

    public Circle(double radius) { // to initialise all the instances
        this.radius = radius;
        // pi = 3.14; // this is unnecessary and not the best practice
    }

    static { // to initialise all the statics
        // radius = 5; static block only accepts static variables
        pi = 3.14;
        name = "Circle";
        // instead, we could also do >>> public static double pi = 3.14 at the top.
        // but sometimes we will need more than one line to set the variable, therefore the static block

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

    /*
    // if we initialise the static variables in the main method we cannot use them in another class
    public static void main(String[] args) {

        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);

    }

     */


}
