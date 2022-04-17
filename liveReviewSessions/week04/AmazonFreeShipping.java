package week04;

public class AmazonFreeShipping {

    public static void main(String[] args) {
        double totalPrice = 7.4;
        if (totalPrice >= 25) {
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total: £" + totalPrice);
        } else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total: £" + totalPrice);
        }
        System.out.println("Thanks for shopping with us !");
    }
}
