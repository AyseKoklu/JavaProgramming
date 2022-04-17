package utilities;

public class MathUtility {

    // 2.1 Create a method that can return the sum of two integers
    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // 2.2 Create a method that can return the sum of two decimal numbers
    public static double sum(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    // 2.3 Create a method that can return the subtraction of two integers
    public static int subtraction(int num1, int num2) {
        int subtraction = num1 - num2;
        return subtraction;
    }

    // 2.4 Create a method that can return the subtraction of two decimals
    public static double subtraction(double num1, double num2) {
        double subtraction = num1 - num2;
        return subtraction;
    }

    // 2.5 Create a method that can return the multiplication of two integers
    public static int multiplication(int num1, int num2) {
        int multiplication = num1 * num2;
        return multiplication;
    }

    // 2.6 Create a method that can return the multiplication of two decimals
    public static double multiplication(double num1, double num2) {
        double multiplication = num1 * num2;
        return multiplication;
    }

    // 2.7 Create a method that passes two double parameters and return the division result
    public static double division(double num1, double num2) {
        double division = num1 / num2;
        return division;
    }

    // 2.8 Create a method that can check if an integer is even number
    public static boolean evenNumber(int num) {
        boolean isEvenNumber = false;
        if (num % 2 == 0) {
            isEvenNumber = true;
        }
        return isEvenNumber;
    }

    // 2.9 Create a method that can check if an integer is odd number
    public static boolean oddNumber(int num) {
        boolean isOddNumber = false;
        if (num % 2 == 1) {
            isOddNumber = true;
        }
        return isOddNumber;
    }

    // 2.10 Create a method that can return the maximum number between two integers
    public static int max(int num1, int num2) {
        int max = 0;
        if (num1 > num2) {
            max = num1;
        } else if (num2 > num1) {
            max = num2;
        }
        return max;
    }

    // 2.11 Create a method that can return the maximum number between two decimal numbers
    public static double max(double num1, double num2) {
        double max = 0;
        if (num1 > num2) {
            max = num1;
        } else if (num2 > num1) {
            max = num2;
        }
        return max;
    }

    //2.12 Create a method that can return the minimum number between two integers
    public static int min(int num1, int num2) {
        int min = 0;
        if (num1 < num2) {
            min = num1;
        } else if (num2 < num1) {
            min = num2;
        }
        return min;
    }

    // 2.13 Create a method that can return the minimum number between two decimal numbers
    public static double min(double num1, double num2) {
        double min = 0;
        if (num1 < num2) {
            min = num1;
        } else if (num2 < num1) {
            min = num2;
        }
        return min;
    }

    // 2.14 Create a method that can return the square of an integer
    public static int square(int num){
        int square = num*num;
        return square;
    }

    // 2.15 Create a method that can return the square of a double
    public static double square (double num){
        double square = num*num;
        return square;
    }

    //2.16 Create a method that can return the cube of an integer
    public static int cube(int num){
        int cube = num*num*num;
        return cube;
    }

    // 2.17 Create a method that can return the cube of a double
    public static double cube(double num){
        double cube = num*num*num;
        return cube;
    }

}