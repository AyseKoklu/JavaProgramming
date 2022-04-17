package day25_CusomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("------------------------");

        double [] arr2 = {1.2,3.4,5.6,7.8};

        ArraysUtility.printEachElement(arr2);

        System.out.println("--------------------------");

        char [] arr3 = {'A', 'B', 'C'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("--------------------------");

        String [] arr4 = {"ARK", "MDM", "SK"};

        ArraysUtility.printEachElement(arr4);

        System.out.println("--------------------------");

        int [] arr5 = {1,5,4,87,32};

        System.out.println(ArraysUtility.max(arr5));

        System.out.println("--------------------------");

        double [] arr6 = {2.3,45.5,23.3,1.2};

        double max2 = ArraysUtility.max(arr6);

        System.out.println(max2);

        System.out.println("--------------------------");

        int [] a1 = {1,23,4,5,6,7,556};

        boolean r1 = ArraysUtility.contains(a1, 6);

        System.out.println(r1);

        System.out.println("--------------------------");

        double [] a2 = {1.2,3.4,4.5,5.6,6.7};

        boolean r2 = ArraysUtility.contains(a2,2.3);

        System.out.println(r2);


    }


}
