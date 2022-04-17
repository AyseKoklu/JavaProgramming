package day09_IfStatements;

public class NameOfDays {
    public static void main(String[] args) {

        int day = 9;
        String nameOfDay;

        if (day == 1) {
            //System.out.println("Monday");
            nameOfDay = "Monday"; // we can do either way. >> if you decide to do all this way, still dont forget to do soutv at the end
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid");
        }
    }

    }


