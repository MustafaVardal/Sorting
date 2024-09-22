package com.dataStructure.Sorting.insertionsort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        InsertionSort ins = new InsertionSort();

        int[] arr = {3,5,2,8,1,4};

        int[] arr2={31,41,59,26,41,58};

        int[] a = {1,0,1,0};
        int[] b = {1,1,0,1};

       // ins.insertionSort(arr);
       // ins.insort(arr);
       // ins.sort(arr);
        ins.sorted(arr2);


        // Result of two binary numbers!
        System.out.println(Arrays.toString(ins.addBinary(a, b)));


        System.out.println(ins.sumArray(arr2));
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i] + " ");
        }
        // Best case scenario is good O(1). depends on the input number.
        // Worst case scenario is absolutely terrible. Could be n*n .
       /* for (int size = 10; size < 100_000_000; size *= 2) {
            testTimeForSize(size);
        }*/

    }


   /* public static void testTimeForSize(int size) {

        InsertionSort sort = new InsertionSort();
        int[] a = generateRandomIntArray(size);

        long start = System.currentTimeMillis();
        // sort.insertionSort(a);
        Arrays.sort(a);
        long end = System.currentTimeMillis();

        System.out.println("Time elapsed:( " + size + " ) " + (end - start) / 1000.0F);
    }

    public static int[] generateRandomIntArray(int size) {
        int[] a = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt();


        }
        return a;
    }*/
}
