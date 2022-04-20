package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        // unchecked exception:

        int a = 10;
        int b = 0;

        // System.out.println(  a / b  );
        // ArithmeticException
        // System.out.println("Wooden Spoon");

        char [] characters = {'A', 'B', 'C'};
        //                     0 ,  1 ,  2

        // System.out.println(characters[99]);
        // ArrayIndexOutOfBoundsException

        Student student = null;

        // System.out.println(student.getName());
        // NullPointerException

        final String str = "Wooden Spoon";

        // str = null;

        // System.out.println(str.toUpperCase());

        String str2 = ""; // != null

        System.out.println(str2.isEmpty());





        // checked Exception:

        System.out.println("Hello");

        // Thread.sleep(3000);

        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file");



    }

}
