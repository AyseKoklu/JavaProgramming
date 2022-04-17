package day37_Inheritance.phoneTask;

public class PhoneShop { // parent class: only contains the common features of all the child classes

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "Large", 850, "Black");
        Samsung samsung = new Samsung("Galaxy s9", "6 inches", 800, "pink");
        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Grey");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(345);
        iphone.text(483794349);
        iphone.faceTime(3238928);
        iphone.faceTime("rukoluku");

        System.out.println("-----------------------");

        samsung.call(345);
        samsung.text(483794349);
        samsung.freeze();

        System.out.println("-----------------------");

        nokia.call(345);
        nokia.text(483794349);
        nokia.selfDefence();

        System.out.println("-----------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);



    }



}
