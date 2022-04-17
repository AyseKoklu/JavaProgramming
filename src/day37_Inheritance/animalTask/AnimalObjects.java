package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Husky", 'M', "small", 3, "orange");

        System.out.println(dog1);
        dog1.bark();
        // dog1.scratch();
        // dog1.sing();


        Cat cat1 = new Cat("Tarcin", "British", 'F', "medium", 2, "black");

        System.out.println(cat1);
        cat1.scratch();
        // cat1.bark();
        // cat1.sing();


        Parrot parrot1 = new Parrot("Popi", "Forest", 'M', "large", 6, "orange");

        System.out.println(parrot1);
        parrot1.sing();
        // parrot1.scratch();
        // parrot1.bark();


    }

}
