package day11_SwitchScanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter an integer: ");
        int num1 = scan.nextInt();

        System.out.println("Enter a decimal: ");
        double num2 = scan.nextDouble();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication = " + num1 * num2);

        scan.close(); // closes the scanner

        int num3 = scan.nextInt(); // will cause an error message
        System.out.println(num3);

    }

}
