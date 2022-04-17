package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        /*
        primitives:
	int: for integers
	double: for decimals
	char: for single characters, ''
	boolean: true/false

    String: sequence of characters (String of text), "" & if the numbers (eg NINO) will not be used in calculation and instead will mean information, you may use String.
         */

        // DataType VariableName = Data;

        // Command + R >> to replace the variable name in all the places in the same class.

        /*
        Variable name must be:
		1. MUST be unique
		2. camelCase
		3. Can Not start with digits
		4. starts with lower case letters
		5. Can Not be Java Reserved words
		6. Can Not have special characters other than _ and $
		7. readable, understandable
         */

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160; 160 is out of byte's range, it gives error
        short weight = 160; // 160 is within the range of short

        // salary: £100000
        // short salary = 100000; 100000 is out of byte's range, it gives error
        int salary = 100_000;

        // int is the preferred data type for integer numbers
        // if you write comma (,) java gives error. either use underscore (_) or don't use anything between the digits.

        long asset = 3_333_333_333L; // when the data is out of int's range we have to type L/l at the end
        // the more memory space it takes, the slower the performance is


        // tax: 0.26
        float tax = 0.26F; // to be able to use float we have to type F/f at the end

        double PI = 3.14;

        // primitive data types: double > float > long > int > short > byte

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        
        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);
        
        char ch4 = 35734;
        System.out.println("ch4 = " + ch4);
        
        char ch5 = 232;
        System.out.println("ch5 = " + ch5);
        
        char gender = 'F';
        System.out.println("gender = " + gender);
        
        char grade = 'C';
        System.out.print("grade = " + grade);
        
        char symbol = '-';
        System.out.println(symbol);
        
        boolean isEmployeed = true;
        System.out.println("isEmployeed = " + isEmployeed);
        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried);
        boolean result = 100> 300;
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "NJ";
        String country = "UK";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

        
    }


}
