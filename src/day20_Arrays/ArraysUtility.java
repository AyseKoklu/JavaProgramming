package day20_Arrays;


import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int numbers [] = {10,9,8,7,4,3,5,6,1};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // sorts the array in ascending order

        System.out.println(Arrays.toString(numbers));


    }
}
