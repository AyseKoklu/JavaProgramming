package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {
        int score = 400;

        if (score >= 0 && score <= 100) { // if the score is valid, print the true statement
            if (score >= 60) { // if the student passed the exam
                System.out.println("Passed");
            } else { // if the student failed the exam
                System.out.println("Failed");
            }
        }
        else { // if the score is not valid
            System.out.println("Invalid");
        }

        System.out.println("--------------------");

        int age = 37;
        boolean hasID = true;

        if (hasID == true) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        }
        else {
            System.out.println("You must have an ID ");
        }

        System.out.println("---------------------");

        int number = 7; // 1~7

        if (number >= 1 && number <= 7) {
            if (number == 1) {
                System.out.println("Monday");
            }
            else if (number == 2) {
                System.out.println("Tuesday");
            }
            else if (number == 3) {
                System.out.println("Wednesday");
            }
            else if (number == 4) {
                System.out.println("Thursday");
            }
            else if (number == 5) {
                System.out.println("FriYAY");
            }
            else if (number == 6) {
                System.out.println("Saturday");
            }
            else {
                System.out.println("Sunday");
            }
        }
        else {
            System.out.println("Not valid");
        }



    }

}
