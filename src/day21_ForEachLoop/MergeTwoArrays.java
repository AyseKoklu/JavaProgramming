package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String group1 [] = {"Ali", "Layan", "Aysenur"};
        String group2 [] = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};
        String merged [] = new String [group1.length + group2.length]; // adding up the first and second array's length

        int i = 0;

        for (String each : group1) { // accessing each element of group1
            merged [i++] = each; // we use post increment because it has to pass index 0 first
        }

        for (String each : group2) { // accessing each element of group2
            merged [i++] = each;
        }

        System.out.println(Arrays.toString(merged));


        System.out.println("========================");



        int arr1 [] = {1,2,3,4};
        int arr2 [] = {5,6};
        int mergedNums [] = new int [arr1.length + arr2.length];

        int j = 0;

        for (int i1 : arr1) {
            mergedNums [j++] = i1;
        }
        for (int i2 : arr2) {
            mergedNums [j++] = i2;
        }

        System.out.println(Arrays.toString(mergedNums));


        System.out.println("========================");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int k = 0;

        for (char c : ch1) {
            chars [k++]+= c;
        }
        /*
        or
        for (char c : ch1) {
            chars [k]+= c;
            k++;
        }
         */
        for (char c : ch2) {
            chars [k++]+= c;
        }

        System.out.println(Arrays.toString(chars));
    }
}

/*
 1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */