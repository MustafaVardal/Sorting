package com.dataStructure.Sorting.mergeSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
       /* int[] a = {5,7,4,Integer.MAX_VALUE,2,8,Integer.MAX_VALUE,24,-100,617,41,Integer.MIN_VALUE};
        MergeSort.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
        for (int size = 10; size < 100_000_000; size *=2) {
            testTimeForSize(size);
        }
    }
    public static void testTimeForSize(int size){
        int[] a = generateRandomIntArray(size);

        long start = System.currentTimeMillis();

        MergeSort.sort(a);

        long end = System.currentTimeMillis();

        System.out.println("Time elapsed("+ size +" ):" + (end - start) / 1000.0F);
    }

    public static int[] generateRandomIntArray(int size){
        int[] a = new int[size];

        Random random = new Random();

        for (int i = 0; i <size ; i++) {
            a[i] = random.nextInt();
        }
        return a;
    }

}
