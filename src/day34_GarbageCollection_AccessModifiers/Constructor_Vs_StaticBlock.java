package day34_GarbageCollection_AccessModifiers;

public class Constructor_Vs_StaticBlock {

    static{
        System.out.println("Static Block");
    }

    public Constructor_Vs_StaticBlock(){ // this needs object(main method) to run
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();

    }

}
