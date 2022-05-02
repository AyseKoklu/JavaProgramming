package day44_Abstraction.animalTask;

public final class Eagle extends Animal {
    public Eagle(String name, String breed, char gender, int age, char size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats snake.");
    }
}
