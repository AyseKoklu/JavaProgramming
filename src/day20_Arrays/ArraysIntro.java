package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names

        String myGroup []; // declaring the variable, cannot contain any data yet,, data types must match!
        myGroup = new String [5]; // index number: 0 ~ 4
        // or >> String myGroup [] = new String [5];

        myGroup [0] = "Gunay";
        myGroup [1] = "Neira";
        myGroup [2] = "Suat";
        myGroup [3] = "Hulya";
        // myGroup [3] = "Mikael"; >> when you re-assign the previous variable is gone, java >> top to bottom
        myGroup [4] = "Mikael";
        // myGroup [5] = "Ayse"; >> will give error
        // myGroup [-1] = "Adam"; >> index number cannot be less than 0

        // System.out.println(myGroup); // hashcode >> wrong way to call Arrays
        System.out.println(Arrays.toString(myGroup)); // ["Gunay", "Neira", "Suat", "Hulya", "Mikael"

        // default value will be assigned when there is no object is given
        // non-primitives: null
        // byte, short, int, long: 0
        // float, double: 0.0
        // boolean: false

        System.out.println("===========================================");

        //if you know how many data, and exact data to be assigned you can write it like this >>
        String days [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //                  0           1           2           3           4           5       6

        System.out.println(Arrays.toString(days));

        int number = 5;
        if (number >= 8 && number <= 0){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

        System.out.println("=================================");

        String months [] = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        System.out.println(Arrays.toString(months));

        int number2 = 9;
        if (number2 <= 0 && number2 >= 13){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        System.out.println(months[number2-1]);


    }
}
