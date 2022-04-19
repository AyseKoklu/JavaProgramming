package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test started");

        try{

            System.out.println(9/0);
            System.out.println("Try Block");

        }catch(ArithmeticException e){

            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception was occurred");

        }


        System.out.println("Test completed");

        System.out.println("--------------------------");

        System.out.println("Test 2 started");

        int[] numbers = {1,2,3,4,5};

        try{

            System.out.println(numbers[200]);
            System.out.println("Try Block");

        }catch(RuntimeException e){

            System.out.println("Catch Block");
            System.out.println("Runtime Exception was occurred");

        }


        System.out.println("Test 2 completed");

    }

}
