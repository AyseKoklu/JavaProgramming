package day15_Loop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String lastName = scan.next();
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
                // C                             +  ydeo >>>> Cydeo
        // name = ("" + name.charAt(0)) . toUpperCase()......
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(name + " " + lastName);

        scan.close();
    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */