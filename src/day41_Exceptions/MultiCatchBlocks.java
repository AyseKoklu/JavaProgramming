package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        try{
            System.out.println(employee.getSalary()); // NullPointerException
        } catch(NullPointerException e){
            System.out.println("First catch block");
        } catch(IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        } catch(ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        } catch(ClassCastException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        } catch(RuntimeException e){
            System.out.println("Last catch block");
        }

        // Parent exception (RuntimeException) cannot be placed before the child exceptions (e.g., ClassCastException)

        System.out.println("Test completed");


        System.out.println("---------------------------------------");

        try {
            System.out.println("Java".charAt(-1));
        } catch(RuntimeException e){
            e.printStackTrace();
        }

    }

}
