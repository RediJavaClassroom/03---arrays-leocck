package com.redi.j2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {0, 1, 2};
        int[] arr2 = {3, 4, 5, 6, 7};

        mergeArrays(arr1, arr2);
    }

    public static void printReversedArray(int[] array) {

        System.out.print("[");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i>0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {

        int[] result = new int[array1.length + array2.length];

        // selecting the bigger array
        int[] biggerArray;
        int[] smallerArray;
        if (array1.length > array2.length) {
            biggerArray = array1;
            smallerArray = array2;
        }
        else {
            biggerArray = array2;
            smallerArray = array1;
        }

        int difference = biggerArray.length - smallerArray.length; // it can be zero

        for(int i=0, j=0; j<smallerArray.length; i+=2, j++) {
            result[i] = array1[j];
            result[i+1] = array2[j];
        }

        for (int i=smallerArray.length*2, j=biggerArray.length-difference; j<biggerArray.length; i++, j++) {
            result[i] = biggerArray[j];
        }

        return result;
    }

    public static int findFirstInArray(String[] texts, String search) {
        for (int i = 0; i < texts.length; i++) {
            if(texts[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastInArray(String[] texts, String search) {
        for (int i = texts.length-1; i >= 0; i--) {
            if(texts[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static int secondSmallest(int[] numbers) {
        if(numbers.length == 0) {
            return -1;
        }
        if(numbers.length == 1) {
            return numbers[0];
        }

        int[] copiedArray = new int[numbers.length];
        System.arraycopy(numbers, 0, copiedArray, 0, numbers.length);

        Arrays.sort(copiedArray);
        int result = copiedArray[0];
        for (int i : copiedArray) {
            if (i > result) {
                return i;
            }
        }
        return result;
    }
}
