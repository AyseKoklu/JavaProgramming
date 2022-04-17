package week02;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class UserInputInfo {
    public static void main(String[] args) {
        //Output goes to console --- print or println
        System.out.println("Output");

        String name = "";
        //How can I receive input for my JAVA class?

        //1. Create your scanner object?
        Scanner input = new Scanner(System.in); // you don't see anything

        //2. Prompt the user for putting input
        System.out.println("Put your name :"); // this is printed out to console

        // 3. Get the input
        name = input.next(); // reads the data from console and assigns the value to my variable.

        // 4. Use the value that I read
        System.out.println("name = " + name);

        /*step 1 and 3 are MUST, but step 2 and 4 depends on the situation
        we need to import scanner class from JAVA utilities
        import java.util.Scanner; you put this statement at the top of your page before class

        input.nextDouble() = double data type input.nextInt() = integer data type
        nextLine() is used for more than one words
        */



    }

}
