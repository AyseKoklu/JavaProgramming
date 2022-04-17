package day30_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
/*
        dog1.name = "Toby";
        dog1.breed = "Tekir";
        dog1.age = 1;
        dog1.gender = 'M';
        dog1.size = "medium";
        dog1.colour = "white";

 */

        dog1.setInfo("Toby", "Tekir", 1, 'M', "medium", "white");


        System.out.println(dog1);

        Dog dog2 = new Dog();
/*
        dog2.name = "Silly";
        dog2.breed = "Tuylu";
        dog1.age = 3;
        dog1.gender = 'F';
        dog1.size = "medium";
        dog1.colour = "black";

 */

        dog2.setInfo("Silly", "Tuylu", 3, 'F', "medium", "black");


        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "Husky", 2, 'M', "Large", "pink");

        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Mila", "Chow chow", 3, 'F', "Large", "Brown");

        Dog dog5 = new Dog();
        dog5.setInfo("Sammy", "PitBull", 2, 'M', "Large", "White");

        System.out.println("------------------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList <Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        femaleDogs.removeIf(p -> p.gender== 'M');
        System.out.println("Female Dogs frequency: " + femaleDogs.size());

        ArrayList <Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        maleDogs.removeIf(p -> p.gender== 'F');
        System.out.println("Male Dogs frequency: " + maleDogs.size());

    }

}
