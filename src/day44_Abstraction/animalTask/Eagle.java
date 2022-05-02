package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable {
    public Eagle(String name, String breed, char gender, int age, char size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats snake.");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts snake");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 50km/h");
    }
}
