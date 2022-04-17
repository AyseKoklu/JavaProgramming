package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int nums [] = {1,2,3,4,5};

        System.out.println(nums); //hashcode
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]); // this is an element, and element has a variable type such as int or String so no need to write toString

        String str = "Java";

        System.out.println(str.toString()); // toString is implicitly called in String variable so we dont need to write it.

        System.out.println("---------------------------------------");

        int score [] = {234, 2435, 21 ,35, 23, 5};

        System.out.println(Arrays.toString(score)); // before sorting

        Arrays.sort(score); // 5, 21, 23, ...

        System.out.println(Arrays.toString(score));

        System.out.println("Min Score: " + score[0]); // this will return the min element
        System.out.println("Max Score: " + score[score.length-1]); // this will return the max element

        String names [] = {"Ayisha", "Anna", "anna", "Ayse", "Muj", "Selma" , "Nursena Bebek", "Muju Cocuk"};

        Arrays.sort(names); // String follows ascii table, upper case comes first

        System.out.println(Arrays.toString(names));

        String words [] = {"Anna", "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------");

        int arr1 [] = {1,2,3};
        int arr2 [] = {1,3,2};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2);

        System.out.println("------------------------------------------");

        char ch1 [] = {'a', 'b', 'c'};
        char ch2 [] = {'a', 'c', 'b'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);


        // Anagram = listen vs silent >> built out of same characters

    }
}
