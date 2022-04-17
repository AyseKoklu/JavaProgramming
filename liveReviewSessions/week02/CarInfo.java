package week02;

public class CarInfo {
    public static void main(String[] args) {

        // I want you to give example of the car that you will buy after you find a well-paid job.

        int year = 2022;
        String make = "Audi",
                model = "A6";
        // automatic = true; manual = false;
        boolean transmission = true;
        String colour = "Black";
        int mileage = 0;
        int price = 75_000; // for Europe

        System.out.println(year + " " + make + " " + model + "\nAutomatic transmission :" + transmission );

        // let's turn this value into TL 1 Euro = 15.5 TL
        double priceInTL = price * 15.5;
        double taxRate = 1.80; //for this kind of cars
        double priceAfterTaxInTl = priceInTL + (priceInTL * taxRate);
        System.out.println("So, the price in Turkish lira will be " + priceAfterTaxInTl + ".");

        // Variables are used, because it makes our data reusable and maintainable.
    }

}
