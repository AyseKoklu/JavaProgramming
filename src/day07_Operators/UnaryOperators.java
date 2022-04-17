package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25; // aka 25, for positive numbers there is no need to add + to indicate its positivity
        int num2 = -25; // negative number

        System.out.println( num1 < 0 ); // false
        System.out.println( num2 < 0 ); // true

        System.out.println("------------------------------");

        int a = 5;
        ++a; // pre-increment: increase the value by 1 immediately
        System.out.println(a);

        --a; // pre-decrement: decrease the value by 1 immediately
        System.out.println(a);

        System.out.println("------------------------------");

        int b = 100;
        System.out.println(++b); // pre-increment: increases the value by 1 right away

        int c = 100;
        System.out.println(c++); // post-increment: increases the value by 1 in the next step
        System.out.println(c); //101


        System.out.println("------------------------------");

        int x = 200;
        System.out.println(--x); //199
        System.out.println(x++); //199

        int y = 200;
        System.out.println(y--);
        System.out.println(y);

        int z = 45;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);
        System.out.println(--z);
        System.out.println(z--);
        System.out.println(z);





    }

}
