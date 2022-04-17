package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ayse", 'F', 24, 70000);

        System.out.println(employee1);

        employee1.setAge(25);

        System.out.println(employee1);

        Employee employee2 = new Employee("Aaron", 'M', 35, 80000);

        employee2.setName("Andy");
        employee2.setSalary(employee2.getSalary() + 15000);

        System.out.println(employee1);
        System.out.println(employee2);



    }

}
