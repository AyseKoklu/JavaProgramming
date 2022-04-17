package day15_Loop;

public class Alphabet {
    public static void main(String[] args) {
        //A~Z
        for (int i = 65; i <= 90; i++){
            System.out.print((char)i + " ");
        }
        System.out.println();
        System.out.println("-------------------");
        //a~z
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------");
        //Z~A
        for (int i = 90; i>= 65; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        System.out.println("-------------------");
        //z~a
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
    }
}
