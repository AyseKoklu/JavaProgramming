package week06;

public class PrintAllLetters {
    public static void main(String[] args) {

        // Print all the letters from A to Z
        // char A in the ASCII table is 65 , and Z is 90
        // how can I turn integer into char : explicit casting

        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
        for (char c = 'A'; c <= 'Z' ; c++) {
            System.out.print(c + " ");
        }

    }
}
