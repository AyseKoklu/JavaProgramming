package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "          batch 25        ";
        // white spaces are the printed out extra spaces at the beginning and end aka unused spaces
        // the spaces between characters will not be removed e.g., batch     25 will still be printed out as batch     25

        str1 = str1.trim (); // this will create a new String e.g. "batch 25"

        System.out.println(str1);

        System.out.println("---------------------");

        String str2 = "Cydeo School";
        int num1 = str2.indexOf("h");
        System.out.println("num1 = " + num1);
        int num2 = str2.indexOf("o"); // first o
        System.out.println("num2 = " + num2);
        int num3 = str2.indexOf("ool"); //second o >> can use the following characters to make it unique
        System.out.println("num3 = " + num3);

        String str3 = "Java Programming Language";
        int num4 = str3.indexOf("amm");
        System.out.println(num4);

        int num5 = str3.indexOf("g ");
        System.out.println(num5);

        int num6 = str3.lastIndexOf("g");
        System.out.println(num6);

        // lastIndexOf starts reading from the end of String, indexOf starts reading from the beginning of the String

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        System.out.println(firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println(lastA);

        int secondA = s.indexOf("a N");
        System.out.println(secondA);

        int fourthA = s.indexOf ("Ca") + 1;
        System.out.println(fourthA);

        int fifthA = s.lastIndexOf("a W");
        System.out.println(fifthA);



    }
}
