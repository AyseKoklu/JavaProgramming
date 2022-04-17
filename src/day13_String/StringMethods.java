package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        //char tenthChar = word.charAt(9); this will give StringIndexOutOfBoundException error.
        System.out.println("--------------------");

        String s1 = "Today is a great day..";
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);
        char lastChar = s1.charAt(totalChars-1); // or = s1.charAt(s1.length()-1);
        System.out.println(lastChar);

        System.out.println("--------------------");

        String str = "wooden spoon";
                str = str.toUpperCase(); //"WOODEN SPOON"

        System.out.println(str);

        String s = "aYsE rUmEySa KoKlU";
        s = s.toLowerCase();
        System.out.println(s);
    }

}
