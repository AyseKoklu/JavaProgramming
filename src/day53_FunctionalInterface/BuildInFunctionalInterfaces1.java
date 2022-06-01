package day53_FunctionalInterface;

import java.util.*;
import java.util.function.*;

public class BuildInFunctionalInterfaces1 {
    public static void main(String[] args) {

        // Predicate: accepts one argument and returns a boolean

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");
        System.out.println(result1);

        Predicate<Integer> isEven = p -> p % 2 == 0;

        boolean result2 = isEven.test(34);
        System.out.println(result2);

        System.out.println("------------------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));

        list.removeIf(isEven);
        System.out.println(list);

        System.out.println("------------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);
        System.out.println(names);

        System.out.println("------------------------------------------------");

        // Consumer: accepts one argument and does not return a value

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));

        /*
        for (Integer each : list2) {
            if(each % 2 != 0){
                System.out.println(each);
            }
        }
        */

        list2.forEach(p -> {
            if (p % 2 != 0) System.out.println(p);
        });

        System.out.println("------------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah", "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

        System.out.println("------------------------------------------------");

        // Function: accepts one argument and returns a value

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);

        System.out.println("------------------------------------------------");

        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result[i] = a.get(i);
            }

            return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int[] result3 = convertToArray.apply(numbers);

        System.out.println("------------------------------------------------");

        // create a function that can return the maximum number from an int array

        // create a function that can swap the first and last elements of an array

        // Create a function that can reverse an array and returns it

        // create a function that can reverse a List


    }

}
