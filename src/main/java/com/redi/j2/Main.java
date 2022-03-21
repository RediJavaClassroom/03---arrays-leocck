package com.redi.j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

    }

    public static void printReversedArray(int[] array) {
        List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list);
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        List<Integer> list1 = IntStream.of(array1).boxed().collect(Collectors.toList());
        List<Integer> list2 = IntStream.of(array2).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        while(!list1.isEmpty() || !list2.isEmpty()) {
            if(!list1.isEmpty()) {
                result.add(list1.remove(0));
            }
            if(!list2.isEmpty()) {
                result.add(list2.remove(0));
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
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
        List<Integer> list = IntStream.of(numbers).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int result = list.get(0);
        for (Integer i : list) {
            if (i > result) {
                return i;
            }
        }
        return result;
    }
}
