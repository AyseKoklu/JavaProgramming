package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
        // person1.name = "Danny";
        // person1.age = 34;

        person1.setName("Danny");
        person1.setAge(-200);

        // System.out.println(person1.name + " : " + person1.age);

        System.out.println(person1.getName() + " : " + person1.getAge());

    }

}
