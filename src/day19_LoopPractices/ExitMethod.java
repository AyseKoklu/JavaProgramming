package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i==3){
               //break; // terminates the loop, will not print out 3 and onwards, Wooden Spoon will still be printed
               //continue; // terminate the current iteration of the loop, will not print out 3, Wooden Spoon will still be printed
            System.exit(0); // terminates the entire program, will not print out 3 and onwards, Wooden Spoon will not be printed
            }
            System.out.println(i);

        }

        System.out.println("Wooden Spoon");
    }
}
