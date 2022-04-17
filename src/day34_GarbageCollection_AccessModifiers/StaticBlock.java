package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static {    // static block runs one time and runs first
        System.out.println("Static Block");
    }

    static {
        System.out.println("Static Block");
    }

    static {
        System.out.println("Static Block");
    }

    // we can have more than one static block, but we will never need to

}
