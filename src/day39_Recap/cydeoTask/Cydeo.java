package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {
        Tester tester = new Tester("Emma", 24, 'F', 45, "SDET", 80000);
        Developer developer = new Developer("Ali", 45, 'M', 67, 100000);
        Teacher teacher = new Teacher("Lola", 34, 'F', 89, "Teacher", 120000);
        Student student = new Student("Ayse", 24, 'F', 10, "Java");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-------------------------------");

        developer.setAge(35);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("-----------------------------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();
        //  student.work();

        System.out.println("------------------------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBugs();

        System.out.println("------------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        // tester.fixingBugs();
        tester.createTicket();

        System.out.println("------------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();
        // teacher.fixingBugs();
        //  teacher.createTicket();

        System.out.println("------------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();
        // student.fixingBugs();
        // student.createTicket();
        student.study();


    }



}


/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes

 */