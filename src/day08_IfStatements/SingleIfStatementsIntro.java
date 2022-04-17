package day08_IfStatements;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        int number = 301;
        boolean evenNumber = number % 2 == 0;

        if (evenNumber) { // or directly put number % 2 == 0 in the parenthesis

            System.out.println(number + " is even number.");

        }

        if (!evenNumber) { // or boolean oddNumber = !evenNumber; then if.. or boolean oddNumber = number % 2 != 0; then if..

            System.out.println(number + " is odd number.");

            System.out.println("-----------------------------");

            int n = 200;
            //positive
            //or negative
            //zero

            if (n > 0) {

                System.out.println(n + " is a positive number.");

            }

            if (n < 0) {

                System.out.println(n + " is a negative number.");
            }


            if (n == 0) {
                System.out.println(n + " is equal to zero.");


            }


        }



    }
}
