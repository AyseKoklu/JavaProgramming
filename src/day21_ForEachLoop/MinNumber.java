package day21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {

        int numbers [] = {10, 5, 4, 20, 1, 0};
        int min = numbers [0];
/*
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }


        }*/

        for ( int each : numbers){
            if (each < min){
                min = each;
            }
        }

        System.out.println("min = " + min);
}}
