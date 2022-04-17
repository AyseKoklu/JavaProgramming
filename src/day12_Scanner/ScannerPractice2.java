package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter true or false: ");
        boolean result = scan.nextBoolean(); // you cannot even use expressions like 0 == 0
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("name = " + name); // Java, a single word, cannot print two words

        scan.close();
    }
}
