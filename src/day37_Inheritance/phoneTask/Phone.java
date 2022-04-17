package day37_Inheritance.phoneTask;

public class Phone {

    public String brand;
    public String model;
    public String size;
    public int price;
    public String colour;
    public static boolean hasBattery;

    public Phone(String brand, String model, String size, int price, String colour) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    static {
        hasBattery = true;
    }

    public void call (long phoneNumber){
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text (long phoneNumber){
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= £" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */