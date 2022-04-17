package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int arr2D [][] = {{1,2,3} , {4,5,6,7} , {8,9,10,11,12}};

        for(int i = 0; i < arr2D.length; i++){ // i: index numbers of single dimensional arrays
            // outer loop is getting each of the single dimensional array

            System.out.println(Arrays.toString(arr2D[i]));


            for (int j = 0; j < arr2D[i].length; j++) { // j: index number of elements
                // iterates each single dimensional array starting from 0 to the end of the length

                System.out.println(arr2D[i][j]);

            }

            System.out.println();
        }




    }
}
