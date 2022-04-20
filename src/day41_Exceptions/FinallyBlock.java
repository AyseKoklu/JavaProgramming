package day41_Exceptions;

public class FinallyBlock {



    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("Try Block");
        } catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally Block");
        }
        // finally block always gets executec
        // if you want to avoid finally block from running you have to execute to program before it reaches to finally block
        // aka System.exit(0)

    }

}
