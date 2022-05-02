package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private char size;
    private final String colour;

    public final static boolean canBreathe;

    static {
        canBreathe = true;
    }

    public Animal(String name, String breed, char gender, int age, char size, String colour) {
        setName(name);
        this.breed = breed;
        if (!(gender == 'M' || gender == 'F')) {
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public char getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Invalid name: " + name);
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public abstract void eat();

    public final void drink() {
        System.out.println(name + " the " + breed + " drinking water.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", colour='" + colour + '\'' +
                '}';
    }
}

/*
Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a cosntructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */