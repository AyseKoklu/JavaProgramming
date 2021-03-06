package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 3, 4, 5, 6, 6, 7, 7, 7};

        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));

        System.out.println("-------------------------");

        double [] array2 = {1.5, 2.3, 4.4, 1.5};

        double[] unique2 = uniqueElements((array2));

        System.out.println(Arrays.toString(unique2));

        System.out.println("-------------------------");

        char [] array3 = {'A', 'B', 'B', 'C'};

        char[] unique3 = uniqueElements((array3));

        System.out.println(Arrays.toString(unique3));

    }

    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {

        int[] result = {}; // new int[0]

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }

    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {

        double[] result = {}; // new double[0.0]

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }

    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array) {

        char[] result = {}; // new double[0.0]

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }

    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array) {

        String[] result = {}; // new double[0.0]

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;

    }
}
