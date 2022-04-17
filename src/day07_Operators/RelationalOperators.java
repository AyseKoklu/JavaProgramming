package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 200 > 40; //true
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; //true
        System.out.println("result2 = " + result2);

        boolean result3 = 300 >= 300; //true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 301; //false
        System.out.println("result4 = " + result4);

        boolean resul5 = 100 < 200; // true
        System.out.println("resul5 = " + resul5);

        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6);

        int score = 75 ;
        boolean failed = score <= 59;

        System.out.println("failed = " + failed); // false

        boolean result7 = 45 <= 60;

        // you cannot use String for the first 4 relational operators

        int x = 100;
        int y = 200;

        boolean equal = x == y; // false
        System.out.println("equal = " + equal);

        boolean result8 = "Ayse" == "Good gal";
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a';
        System.out.println("result9 = " + result9);

        boolean result10 = 'A' == 'A';
        System.out.println("result10 = " + result10);

        // even the spaces in the " " or ' ' should be exactly the same

        System.out.println("-----------------------------------");

        boolean result11 = 100 != 200.05; //true
        System.out.println("result11 = " + result11);

        boolean result12 = 200 != 200;
        System.out.println("result12 = " + result12);



    }
}
