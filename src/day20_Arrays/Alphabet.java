package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char alphabet []= new char [26];//Z~A

        //alphabet [0]= 'Z';
        //...

        for (char i = 'Z', j = 0; i >= 'A'&& j <= alphabet.length ; i--, j++) {
            alphabet[j] = i;
        }


        /*
        char j = 'Z';
        for (int i = 0; i < alphabet.length; i++, j--) {
            alphabet[i] = j;
        }
         */




        System.out.println(Arrays.toString(alphabet)); // this returns the entire array
        System.out.println(alphabet[0]); // this returns the element aka a single character
    }
}
