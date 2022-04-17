package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Ayse", "Koklu");

        System.out.println("-------------------------");

        emailDomain("rukoklu32@gmail.com");

        System.out.println("-------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            emailDomain(email);
        }

        System.out.println("-------------------------");

        month(9);

        System.out.println("-------------------------");

        day(3);

    }

    // 1. Create a method that can display the initials of the person

    public static void initials (String firstName, String lastName){

        String initial = firstName.charAt(0) + ". " + lastName.charAt(0) + ".";
        initial = initial.toUpperCase();
        System.out.println("Initials = " + initial);

    }

    // 2. Create a method that can display the domain of the email

    public static void emailDomain (String email){

        String domain = email.substring(email.indexOf("@")+1, email.indexOf(".c"));
        System.out.println("Domain : " + domain);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method

    public static void month (int monthNumber){

        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
        }


    }

    // 4. Create a method that can print the name of the day based on the given number to the method

    public static void day (int dayNumber) {

        String result = "";

        switch (dayNumber){

            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid";
                break;
        }

        System.out.println("Day : " + result);

    }

    // 5. Create a method that can print how many days a month has

    public static void daysInMonth (String month){



    }
}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

	6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
 */