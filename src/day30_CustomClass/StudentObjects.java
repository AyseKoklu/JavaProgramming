package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Ayse", 'F', 24, 3232, 'A');

        Student student2 = new Student();
        student2.setInfo("NurSena", 'F', 24, 9966, 'A');

        Student student3 = new Student();
        student3.setInfo("Selmita", 'F', 48, 1974, 'A');

        Student student4 = new Student();
        student4.setInfo("Ben", 'M', 32, 8754, 'D');

        Student student5 = new Student();
        student5.setInfo("Tom", 'M', 45, 7463, 'C');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            
            if (student.grade == 'A'){
                earlyBirds.add(student);
            } else {
                angryBirds.add(student);
            }
            
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

    }

}
