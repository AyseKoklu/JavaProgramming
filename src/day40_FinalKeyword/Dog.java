package day40_FinalKeyword;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String colour, String size, int age) {
        super(name, breed, gender, colour, size, age);
    }

    public void eat(){
        System.out.println(getName() + " is eating dog food");
    }

    /*
    @Override
    public void drink() { // final method cannot be overridden
        System.out.println(getName() + " is drinking beer");
    }
     */

    public final void bark(){
        System.out.println(getName() + " is barking");
    }


}
