package day44_Abstraction.animalTask;

public final class Parrot extends Animal implements Playable, Flyable {
    public Parrot(String name, String breed, char gender, int age, char size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats chocolate.");
    }

    @Override
    public void play() {
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 20km/h");
    }

}
