package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        //Eligible
        boolean Eligible = age >= 21 && citizen == "USA";
        if (Eligible) {
            System.out.println(name + " is eligible to vote.");

        }
        //Not eligible
        if (!Eligible) {
            System.out.println(name + " is not eligible.");

        }
    }

}
