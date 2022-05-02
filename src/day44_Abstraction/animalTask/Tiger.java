package day44_Abstraction.animalTask;

public final class Tiger extends Animal {
    public Tiger(String name, String breed, char gender, int age, char size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats deer.");
    }
}