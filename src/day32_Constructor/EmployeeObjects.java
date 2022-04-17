package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        Employee employee2 = new Employee("Youssef", 'M');
        Employee employee3 = new Employee("Gemma", 'F', "SDET");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


    }

}
