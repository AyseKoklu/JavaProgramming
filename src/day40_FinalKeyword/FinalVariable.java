package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "Batch 18";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;
        // pi = 4.14; final variables can not be reassigned

        final String name;

        name = "Java"; // final
        // name = "Wooden Spoon";

        System.out.println(name);

        System.out.println("-----------------------------------");

        FinalVariable obj = new FinalVariable("Sep/01");
        // obj.birthDay = "Sep/o2"; final variable cannot be reassigned
        System.out.println(obj.birthDay);

        System.out.println("-----------------------------------");

        // FinalVariable.name = "Python";
        System.out.println(FinalVariable.name);


    }


}
