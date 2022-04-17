package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", ID, salary, companyName);
    }

    public void analyse(){
        System.out.println(jobTitle + " " + name + " is analysing the documents");
    }

}
