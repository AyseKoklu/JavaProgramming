package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "small", 3, "orange");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'F', "medium", 2, "black");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Popi", "Forest", 'M', "large", 6, "pink");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);
    }

}
