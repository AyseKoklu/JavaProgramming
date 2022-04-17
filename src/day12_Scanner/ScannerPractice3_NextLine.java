package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Enter your programming language: ");
        String programming = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt(); //Enter key is left in the programmes memory and will be applied to
        // the next scanner. it should be taken out for us to be able to provide an input for the next scanner

        scan.nextLine(); //Enter key is taken out from the memory

        System.out.println("Enter your school name: ");
        String schoolName = scan.nextLine();

        System.out.println("name = " + name);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        scan.close();
    }
}
