package day37_Inheritance.phoneTask;

public final class Nokia extends Phone{

    public Nokia(String model, String size, int price, String colour) {
        super("Nokia", model, size, price, colour);
    }

    public void selfDefence(){
        System.out.println(brand + " " + model + " is also used for self defence");
    }

}

/*
1.4 Create a sub class of Phone named Nokia:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    selfDefense()
                    toString()
 */