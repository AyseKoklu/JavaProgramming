package day09_IfStatements;

public class Tasks {
    public static void main(String[] args) {
        //task 1
        int a = 100,
                b = 123;
        if (a > b) {
            System.out.println(a + " is the maximum number.");
        }
        else if (b > a) {
            System.out.println(b + " is the maximum number.");
        }
        else {
            System.out.println( a + " and " + b + " are equal.");
        }

        System.out.println("---------------------------");
        //task 2

        int c = 3674,
                d = 3764;
        if (c < d) {
            System.out.println(c + " is the minimum number.");
        }
        else if (d < c) {
            System.out.println(d + " is the minimum number.");
        }
        else {
            System.out.println(c + " and " + d + " are equal.");
        }

        System.out.println("-----------------------");
        //task 3
        int ageAlc = 34;

        if (ageAlc >= 18) {
            System.out.println("Can buy alcohol");
        }
        else {
            System.out.println("Can not buy alcohol");
        }

        System.out.println("-----------------------");
        //task 4

        int age = 34;
        String citizen= "USA";

        if ((age >= 18) && (citizen == "USA")) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not Eligible");
        }

    }
}

/*
		1. Maximum number between two different numbers
		2. Minimum number between two different numbers
		3. Write a progrm that can check if the person is eligible to buy alcohol
		4. Write a progrm that can check if the person is eligible to vote
 */