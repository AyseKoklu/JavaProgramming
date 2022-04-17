package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        // assignment: '=' changing the value of the variable
        int number = 100;
        System.out.println("number = " + number); // 100

        number = 200;
        System.out.println("number = " + number); // 200

        String name = "Ayse";
        System.out.println("name = " + name);

        name = "Selma";
        System.out.println("name = " + name);

        // cannot reassign variable 'name' to new one e.g. xxx name = 123; xxx

        int popis = 100;
        popis = 100;
        popis = 100;
        popis = 100;
        System.out.println("popis = " + popis);

        System.out.println("----------------------------------------");

        // Addition Assignment : '+='

        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 200); //300

        // x = x + 200;
        x += 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;

        //deposit £300
        availableBalance += 300; // availableBalance = 1000.50 + 300
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("-------------------------------");

        // Subtraction assignment: '-='

        //withdrawing £500

        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        // String can only be used with += not with other shorthand operators

        //withdrawing £200, then depositing £400.

        availableBalance -= 200;
        availableBalance += 400;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("-------------------------------");

        // Multiplication assignment: '*='

        double salary = 50000.50;
        System.out.println("salary = " + salary); // 50000.50
        salary *= 2; // salary = salary * 2
        System.out.println("salary = " + salary); // 100001.0

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);

        System.out.println("-------------------------------");

        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("-------------------------------");

        double num3 = 25000;
        num3 %= 3;
        System.out.println("num3 = " + num3);

        // %= used to assign remainder to variable

        System.out.println("-------------------------------");
        
        int amount = 127; //pennies
        int quarters = amount / 25;
        int pennies = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("pennies = " + pennies);

        System.out.println("-------------------------------");
        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("-------------------------------");
        int y = 300;
        y %= 16;
        System.out.println("y = " + y);

        System.out.println("-------------------------------");

        int balance = 3500;
        // insurance fee = 153
        balance %= 153;
        System.out.println("balance = " + balance);








    }


}
