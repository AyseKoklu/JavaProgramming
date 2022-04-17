package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String colour, int miles) {
        super("Toyota", model, year, price, colour, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

    @Override
    public void start() {
        System.out.println("Put the key into the ignition and turn the key to start "  + brand + " " + model);
    }
}

/*
1. Toyota:
					extra methods:
							reliable()
 */