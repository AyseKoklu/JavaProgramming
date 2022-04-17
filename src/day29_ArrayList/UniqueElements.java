package day29_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 1, 1, 3, 4, 5, 6, 6, 3, 0, 6, 6, 6, 7, 6, 8, 8, 9));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int frequency = Collections.frequency(list, each); // finds the frequency of each element
            if (frequency == 1) {
                unique.add(each);
            }
        }

        System.out.println(unique);

        System.out.println("--------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 1, 1, 3, 4, 5, 6, 6, 3, 0, 6, 6, 6, 7, 6, 8, 8, 9));

        ArrayList<Integer> unique2 = new ArrayList<>();

        unique2.removeIf(p -> Collections.frequency(list2, p) > 1);

        System.out.println("unique2 = " + unique2);

        System.out.println("--------------------------------");




    }
}
