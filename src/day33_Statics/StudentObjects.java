package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ayse");
        Student student2 = new Student("Aygun", 'F');
        Student student3 = new Student("Niagra", 3214);
        Student student4 = new Student("Mert", 1256, 'A');
        Student student5 = new Student("Ali", 'M', 28);
        Student student6 = new Student("Toti", 'F', 34, 8732);
        Student student7 = new Student("Lolo", 'M', 21, 5643, 'C');

        System.out.println(student1 == student2);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students));

    }

}
