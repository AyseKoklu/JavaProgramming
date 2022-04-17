package day23_CustomMethods_Void;

public class CustomMethodsIntro {

    public static void main(String[] args) {

        System.out.println("Test Started");
        greeting(); //calling the method
        greeting();
        System.out.println("Test Completed");
        // codes are printed out top to bottom

    }
    public static void greeting() {

        //sometimes the specifier and access modifier can be replaced differently e.g. static public void main...

        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");

        //methods can be created in anywhere in class but not inside another method

    }


}
