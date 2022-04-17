package day12_Scanner;

import java.util.Scanner; // regular import: imports one class
// import java.util.*; this called wild import : imports everything from the package

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // this is creating an object and can be used over and over again
        System.out.println("Enter a number between 1-7: ");
        int day = scan.nextInt(); // to use the variable again we need to create a container (int day)
        String result = " "; // temporary value
        if (day >= 1 && day <= 7) {
            result = (day == 1)? "Monday" :(day==2)? "Tuesday" :(day==3)? "Wednesday"
                    :(day==4)? "Thursday" :(day ==5)? "Friday" :(day==6)? "Saturday" : "Sunday";
        }
        else {
            result = "Invalid Number";
        }
        System.out.println(result);
        scan.close();

        /*
        new Scanner (System.in).nextInt();
        new Scanner (System.in).nextInt();
        new Scanner (System.in).nextInt();
        ...
        if we dont create an object we would have to create Scanner each time which is a time waste
         */


    }
}
