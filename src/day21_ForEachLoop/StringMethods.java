package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";
        char ch [] = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        for ( char each : str.toCharArray()){
            System.out.println(each);
        }

        System.out.println("--------------------------------");

        String sentence = "Wooden Spoon";
        String arr1 [] = sentence.split(" ");

        System.out.println(Arrays.toString(arr1));

        System.out.println("===================================");

        String email = "WoodenSpoon@cydeo.com";
        String arr2 [] = email.split("@");

        System.out.println(Arrays.toString(arr2));

        String s = "Today is nice day. Today is Monday. Today we learn Java";
        String arr3 [] = s.split("\\. ");

        System.out.println(Arrays.toString(arr3));

    }
}
