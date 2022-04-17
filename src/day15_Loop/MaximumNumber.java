package day15_Loop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int max = -2147483648; // any user entered number will be greater than this number


        for (int i = 0; i < 5; i++) { // printing out the statement five times
            System.out.println("Enter a number:");
            int num = scan.nextInt(); // e.g., 1, 2, 3, 4, 5
            // when the user enters one (or any other number) the current value becomes that, so the second
            // number is compared with that previous number
            if(num > max){ // if the user entered number is greater than current max number
                max = num;
            }

        }
        System.out.println("max = " + max);
        scan.close();
    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the max number
 */