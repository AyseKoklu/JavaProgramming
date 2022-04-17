package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; // auto-boxing
        // Long n1 = num1; >>>>> This is wrong, we can only use the dedicated classes

        int num2 = n1; // unboxing

        System.out.println("-----------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue; // >>> primitives accepts other classes as long as it is within the range

        Byte b1 = 25;
        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("----------------------------------");

        int num3 = 200;

        Integer num4 = num3;
        // Long l2 = num3;
        // Double d1 = num3;

        // Primitives only can be converted in the certain Wrapper Classes, but Wrapper Classes can
        // be converted into any primitives as long as the range supports

        System.out.println("-----------------------------------");

        Integer z = 900;
        Integer y = z;

        System.out.println("-----------------------------------");


        int[] numbers1 = {1, 2, 3, 4, 5};

        Integer[] numbers2 = {1, 2, 3, 4, 5};

    }

}
