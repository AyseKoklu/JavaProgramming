package day15_Loop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str = " ";

        boolean r = str.isEmpty();
        //empty means the String length is zero

        System.out.println(r);

        boolean r1 = str.isBlank();
        // blank means the String does not have any characters in it, but can have white space

        System.out.println(r1);

        String str2 = "Cydeo   ";
        System.out.println(str2.isBlank());

        System.out.println("------------------------");

        String s1 = "Cydeo";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2) + " " + s1.equalsIgnoreCase(s2));

        String sentence = "My favourite programming language is Java.";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        // contains method is also case-sensitive
        System.out.println(hasCSharp + "\n" + hasJava + "\n" + hasJava2 + "\n" + hasJava3);

        System.out.println("-------------------------------");

        String input1 = "I love JaVa";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2)); // false

        System.out.println(input1.contains("Java")); //false

        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("---------------");

        String a = "Wooden Spoon";

        boolean x  = a.startsWith("Woo");
        boolean y = a.endsWith("oon");
        boolean z = a.toLowerCase().startsWith("wo"); // to ignore the case sensitivity
        // this method is case-sensitive
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // charAt, indexOf, substring, equals, repeat, contains will be used a lot

    }
}
