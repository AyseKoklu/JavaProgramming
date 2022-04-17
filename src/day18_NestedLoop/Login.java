package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your credentials: ");
        String username = scan.next();
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in.");
        }
        else {
            for (int i = 1; i <= 2; i++) {
                System.err.println("Incorrect username or password");
                System.out.println("Enter your credentials:");
                username = scan.next();
                password = scan.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }
            }
            if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))){
                    System.err.println("Your account is locked");
            }


        }


        scan.close();
    }
}
/*
2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to
                        enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */