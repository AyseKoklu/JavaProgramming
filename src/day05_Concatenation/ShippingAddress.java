package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Ayse Koklu",
                buildingNumber = "7 Austin Court",
                streetName = "Village Road",
                city = "London",
                state = "Enfield",
                zipCode = "EN1 2DY";
        String shippingAddress = name + "\n" + buildingNumber + ", " + streetName + " \n" + city
                + ", " + state + "\n" + zipCode;

        /*
        System.out.println(name + "\n" + buildingNumber + ", " + streetName + " \n" + city
                + ", " + state + "\n" + zipCode);
        */

        System.out.println(shippingAddress);


    }

}

/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
 */