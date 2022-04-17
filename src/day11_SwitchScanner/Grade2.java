package day11_SwitchScanner;

public class Grade2 {

    public static void main(String[] args) {
        char ch = 'A';

        switch (ch) { // this is how the OR (||) logic applied to switch statement
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
            break;
            default:
                System.out.println("Invalid");
        }
    }
}



/*
if the grade is A B C D ====> Passed
otherwise ====> Failed
 */