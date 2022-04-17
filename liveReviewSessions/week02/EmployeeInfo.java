package week02;

public class EmployeeInfo {
    public static void main(String[] args) {
    /*
    name
    company name
    job title
    gender
    salary
    employeeID
    has benefits (Y/N)
    is married
     */

        String name = "Ayse Koklu",
                companyName = "Apple",
                jobTitle = "SDET";
        char gender = 'F';
        double salary = 75_800;
        int employeeID = 238734;
        boolean hasBenefits = true;
        char isMarried = 'N';

        System.out.println(name + " is working at " + companyName + " as a " +
                jobTitle + ". She is a " + gender + "emale earning " + salary +
                ". Her employeeID is " + employeeID + ".");
        System.out.println("She has benefits = " + hasBenefits);
        System.out.println("Is she married ? = " + isMarried);

    }

}
