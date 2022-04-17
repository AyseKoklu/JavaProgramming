package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 1983 ;


        if (score >= 0 && score <= 100){
            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }
        else {
            System.out.println("Invalid score");
        }
        System.out.println("-----------------------");
        
        String result = " "; //temporary
        if (score >= 0 && score <= 100){

            if (score >= 90) {
                result = "Excellent";
            } else if (score >= 80) {
                result = "Great";
            } else if (score >= 70) {
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        }
        else {
            result = "Invalid score";
        }
        System.out.println("result = " + result);
    }
}
