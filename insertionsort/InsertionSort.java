package com.dataStructure.Sorting.insertionsort;

import java.util.Scanner;

public class InsertionSort {


    /**
     * Sort the array in-place in non-decreasing order.
     *
     * @param array the array to be sorted.
     */
 /*   public void insertionSort(int[] array) {

        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }*/

    /*public void insertionSort(int[] arr) {
        // It should be known numbers. And almost ordered numbers and small set of numbers.
        int arrayLength = arr.length;
        // for loop need to be start second value for comparison with first value.
        for (int i = 1; i < arrayLength; i++) {
            // All assigned value will go a memory.
            int store = arr[i];

            // We prepared previous number to check second and first number.
            int previousNumber = i - 1;

            // IF
            // Previous number should be 0 or greater than 0.
            // And inside of array which represent previous number should be greater than store.
            // Then work while loop inside.

            while (previousNumber >= 0 && arr[previousNumber] > store) {

                // previous number should be sorted by small to big.
                // Instance :
                // Example case: {5,1,3,6}--->
                // After sort of element ---> {1,3,5,6}
                // **
                // **
                arr[previousNumber + 1] = arr[previousNumber];

                // Decrease the previous number
                previousNumber = previousNumber - 1;

            }
            // For next step. Assign the store to next iterable number of array.
            arr[previousNumber + 1] = store;
        }
    }*/
   /* public void insort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }

    }*/
    /*
    public void sorted(int[] array) {
        int temp;

        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

    }*/

   /* public void sort(int[] array){
        int temp;

        for (int i = 1; i < array.length; i++) {
            temp = array[i]; // Array of element is copying of temp.
            int j = i-1; // Get ready to start of position of array.

            while (j >=0 && array[j] > temp){ // Rules of insertion sort!
                array[j+1] = array[j];  // Shifting next right of the array. Because array[j] is greater than temp number.
                j--; // get previous location
            }
            array[j + 1] = temp;  // And here we are going to put the temp array in a list if it is less than array[j] otherwise.
                                  // The process will be spontaneously to continue.
        }
    }*/
    public void sorted(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] < temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = temp;
        }

    }

    public int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


   /* LINEAR-SEARCH(A, v)
    for i = 1 to A.length
       if A[i] == v
            return i
    return NIL*/


    public int linearSearch(int[] a, int v){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v){
                return i;
            }
        }
        return 0;
    }



    /*

    ADD-BINARY(A, B)
    carry = 0
    for i = 1 to A.length
        sum = A[i] + B[i] + carry
        C[i] = sum % 2  // remainder
        carry = sum / 2 // quotient
    C[A.length + 1] = carry
    return C

     */
    public int[] addBinary(int[] a, int[] b){

        int carry = 0;
        int n = a.length;
        int[] c = new int[n+1];

        for (int i = n-1; i >=0 ; i--) {
            int sum = a[i] + b[i] + carry;
            c[i+1] = sum %2;
            carry = sum / 2;
        }
        c[0] = carry;
        return c;
    }

}
