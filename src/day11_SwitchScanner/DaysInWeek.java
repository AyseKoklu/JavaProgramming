package day11_SwitchScanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 5;

        switch (number) { // 1 2 3 4 5 6 7
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break; // we need break statements, so that it wouldn't print the next available blocks
            // in this case everything after Friday would be printed too (until })if we didn't have the break;
            case 7:
                System.out.println("Sunday");
                break; // exits the switch after executing the case block
            default: // only gets executed if none of the case blocks are matching.
                // can be placed anywhere within the switch statement but preferred at the end
                System.out.println("Invalid");
            break; // this is optional since we reached to }

        }
             /*
            we can only use switch statement (in boolean) to see if the numbers are equal or not
            so, we cannot use <= >= but we can use ==
            if statement is more powerful than switch
            we can convert all switch statements into if statements but not vice versa
            all blocks have to have unique value.
            case value MUST match with switch's data type
            long, float, double, boolean are not accepted in switch statement
             */


    }

}
