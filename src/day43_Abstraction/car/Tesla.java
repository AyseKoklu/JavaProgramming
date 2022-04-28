package day43_Abstraction.car;

public final class Tesla extends Car{
    public Tesla(String model, String colour, int year, double price) {
        super("Tesla", model, colour, year, price);
    }

    public void start(){
        System.out.println("Say \"Start\"");
    }

    public void autoPilot(){
        System.out.println(getBrand() + " " + getModel() + " " + " has auto park feature");
    }
}
