package day15_Loop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        // if you are using the scanner one time, you do not need to call
        //scanner. you can instead just use scanner object.
        System.out.println("Enter a word");
        String word = new Scanner (System.in).next();

        if (word.charAt(0) == 'x') {
           word =  word.replaceFirst("x", "a");
        }

    }

}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
