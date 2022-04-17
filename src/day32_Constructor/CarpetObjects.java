package day32_Constructor;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(2.2, 3.4, 12, true);
        Carpet carpet2 = new Carpet(3.1, 4, 8.5, false);
        Carpet carpet3 = new Carpet(2, 1.9, 11, true);
        Carpet carpet4 = new Carpet(5.6, 4.3, 9.5, false);


        System.out.println(carpet1);
        System.out.println(carpet2);
        System.out.println(carpet3);
        System.out.println(carpet4);

    }

}
