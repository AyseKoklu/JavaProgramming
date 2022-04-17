package week03;

public class Grader {

    public static void main(String[] args) {
        int grade = 84;

        if (grade <= 100 && grade >= 90) {
            System.out.println("A");
        }
        else if (grade <= 89 && grade >= 80) {
            System.out.println("B");
        }
        else if (grade <= 79  && grade >= 70) {
            System.out.println("C");
        }
        else if (grade <= 69 && grade >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("Fail");
        }

    }

}
