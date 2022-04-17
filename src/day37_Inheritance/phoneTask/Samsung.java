package day37_Inheritance.phoneTask;

public final class Samsung extends Phone{

    public Samsung(String model, String size, int price, String colour) {
        super("Samsung", model, size, price, colour);
    }

    public void freeze (){
        System.out.println(brand + " " + model + " is freezing");
    }


}

/*
Create a subclass of Phone named Samsung:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    freeze()
                    toString()
 */
