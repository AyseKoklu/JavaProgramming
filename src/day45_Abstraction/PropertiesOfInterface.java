package day45_Abstraction;

public interface PropertiesOfInterface {

    // int a; // instance variable
    // static int b; // static variable

    int a = 100; // static and final by default
    static int b = 200; // final by default

    /*
    public PropertiesOfInterface(int a){ // constructor
        this.a= a; // to assign instance variables
    }
    *//*
    static{
        b = 100; // static block
    }
     */

    /*
    public void method1(){
        System.out.println("Instance method"); // instance method
    }
     */

    static void method2() {
        System.out.println("Static method"); // static method
    }

    void method3(); // abstract method

    default void method4() { // default method
        System.out.println("Default method");
    }

    class Test implements PropertiesOfInterface{
        @Override
        public void method3() {

        }

        public static void main(String[] args) {
            new Test().method4();
        }

    }


}
