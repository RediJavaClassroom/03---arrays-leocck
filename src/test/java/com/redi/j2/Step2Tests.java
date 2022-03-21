package com.redi.j2;

import com.redi.j2.fixtures.Fixtures;
import com.redi.j2.proxies.Main;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Step2Tests {

    @Test
    void task_2_1_shouldDefineMergeArraysMethod()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // then - the method exists
        assertTrue(main.hasMethod("mergeArrays", int[].class, int[].class),
                "Could not find the method 'mergeArrays', which receives two int[] as parameter");

        // and - the method is public
        assertTrue(main.isMethodPublic("mergeArrays", int[].class, int[].class),
                "Method 'mergeArrays' must be public");

        // and - the method is static
        assertTrue(main.isMethodStatic("mergeArrays", int[].class, int[].class),
                "Method 'mergeArrays' must be static");

        // and - the method should return 'int[]'
        assertTrue(main.isMethodReturnType(int[].class, "mergeArrays", int[].class, int[].class),
                "Method 'mergeArrays' should return a int[]");
    }

    @Test
    void task_2_2_shouldMergeTwoarrays()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and two arrays of numbers
        int[] list1 = new int[]{0, 1, 2, 3, 4};
        int[] list2 = new int[]{5, 6, 7, 8, 9};

        // when - you run the 'mergeArrays' method
        int[] result = main.mergeArrays(list1, list2);

        // then - the result should be what is expected
        assertArrayEquals(new int[]{0, 5, 1, 6, 2, 7, 3, 8, 4, 9}, result,
                "The 'mergeArrays' does not work correct for inputs {0, 1, 2, 3, 4} and {5, 6, 7, 8, 9}");

        // and - the original arrays are not changed by the method
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, list1,
                "The 'mergeArrays' method should not change the elements of the parameter arrays");
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, list2,
                "The 'mergeArrays' method should not change the elements of the parameter arrays");
    }

    @Test
    void task_2_3_shouldWorkWithDifferentSizes()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and two arrays of numbers
        int[] list1 = new int[]{0, 1, 2};
        int[] list2 = new int[]{3, 4, 5, 6, 7};

        // when - you run the 'mergeArrays' method
        int[] result1 = main.mergeArrays(list1, list2);
        int[] result2 = main.mergeArrays(list2, list1);

        // then - the result should be what is expected
        assertArrayEquals(new int[]{0, 3, 1, 4, 2, 5, 6, 7}, result1,
                "The 'mergeArrays' does not work correct for inputs {0, 1, 2} and {3, 4, 5, 6, 7}");
        assertArrayEquals(new int[]{3, 0, 4, 1, 5, 2, 6, 7}, result2,
                "The 'mergeArrays' does not work correct for inputs {3, 4, 5, 6, 7} and {0, 1, 2}");

        // and - the original arrays are not changed by the method
        assertArrayEquals(new int[]{0, 1, 2}, list1,
                "The 'mergeArrays' method should not change the elements of the parameter arrays");
        assertArrayEquals(new int[]{3, 4, 5, 6, 7}, list2,
                "The 'mergeArrays' method should not change the elements of the parameter arrays");
    }

    @Test
    void task_2_4_shouldWorkWithEmptyArrays()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and two arrays of numbers
        int[] list1 = new int[]{0, 1, 2};
        int[] list2 = new int[]{};

        // when - you run the 'mergeArrays' method
        int[] result1 = main.mergeArrays(list1, list2);
        int[] result2 = main.mergeArrays(list2, list1);
        int[] result3 = main.mergeArrays(new int[]{}, new int[]{});

        // then - the result should be what is expected
        assertArrayEquals(new int[]{0, 1, 2}, result1,
                "The 'mergeArrays' does not work correct for inputs {0, 1, 2} and {}");
        assertArrayEquals(new int[]{0, 1, 2}, result2,
                "The 'mergeArrays' does not work correct for inputs {} and {0, 1, 2}");
        assertArrayEquals(new int[]{}, result3,
                "The 'mergeArrays' does not work correct for inputs {} and {}");

        // and - the original arrays are not changed by the method
        assertArrayEquals(new int[]{0, 1, 2}, list1,
                "The 'mergeArrays' method should not change the elements of the parameter arrays");
        assertArrayEquals(new int[]{}, list2,
                "The 'mergeArrays' method should not change the elements of the parameter arrays");
    }
}