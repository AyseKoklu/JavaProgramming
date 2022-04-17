package day08_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;
        boolean numberPositive = number > 0;
        boolean numberNegative = number < 0;
        boolean numberZero = number == 0;

        System.out.println("numberPositive = " + numberPositive);
        System.out.println("numberNegative = " + numberNegative);
        System.out.println("numberZero = " + numberZero);
        System.out.println(number + " is positive number : " + numberPositive);
        System.out.println(number + " is negative number : " + numberNegative);
        System.out.println(number + " is equal to zero : " + numberZero);


    }

}

/*
	1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.
			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false

 */