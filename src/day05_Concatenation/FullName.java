package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Ayse";
        String lastName = "Koklu";
        String fullName = firstName + " " + lastName;
        int age = 24;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        // Full name of the person is ....
        System.out.println("Full name of the person is " + fullName + ".");

        // .. is .. years old.
        System.out.println(fullName + " is " + age + " years old.");

        // Fullname is Jobtitle, works at company name, and fullName's salary is salary.
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and " + fullName + "'s salary is £" + salary + ".");

    }

}

/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName 2. lastName
3. Use concatenation to print the full address
 */