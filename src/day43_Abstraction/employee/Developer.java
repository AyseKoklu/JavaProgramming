package day43_Abstraction.employee;

public final class Developer extends Employee{


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is writing codes.");
    }

    public void sleep(){
        System.out.println(getName() + " sleeps 5 hours.");
    }

    public final void unitTesting(){
        System.out.println(getName() + " is unit testing.");
    }

}
