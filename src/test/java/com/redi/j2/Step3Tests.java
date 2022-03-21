package com.redi.j2;

import com.redi.j2.fixtures.Fixtures;
import com.redi.j2.proxies.Main;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Step3Tests {

    @Test
    void task_3_1_shouldDefinefindFirstInArrayMethod()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // then - the method exists
        assertTrue(main.hasMethod("findFirstInArray", String[].class, String.class),
                "Could not find the method 'findFirstInArray', which receives a String[] and a String as parameters");

        // and - the method is public
        assertTrue(main.isMethodPublic("findFirstInArray", String[].class, String.class),
                "Method 'findFirstInArray' must be public");

        // and - the method is static
        assertTrue(main.isMethodStatic("findFirstInArray", String[].class, String.class),
                "Method 'findFirstInArray' must be static");

        // and - the method should return an int
        assertTrue(main.isMethodReturnType(int.class, "findFirstInArray", String[].class, String.class),
                "Method 'findFirstInArray' should return an int");
    }

    @Test
    void task_3_2_shouldFindTheFirstString()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and - a List with Strings
        String[] list = new String[]{"Germany", "Japan", "Austria", "France", "Poland", "France"};

        // when - we try to find an existing string
        int result = main.findFirstInArray(list, "France");

        // then - the result should be the index position of this string
        assertEquals(3, result,
                "The 'findFirstInArray' does not work correct for inputs " + Arrays.asList(list) + " and 'France'");
    }

    @Test
    void task_3_3_shouldWorkWithNonexistentSearch()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and - a List with Strings
        String[] list = new String[]{"Germany", "Japan", "Austria", "France", "Poland"};

        // when - we try to find an unexisting string
        int result = main.findFirstInArray(list, "Brazil");

        // then - the result should be the index position of this string
        assertEquals(-1, result,
                "The 'findFirstInArray' does not work correct for inputs " + Arrays.asList(list) + " and 'Brazil'");
    }

    @Test
    void task_3_4_shouldIgnoreCase()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and - a List with Strings
        String[] list = new String[]{"Germany", "Japan", "Austria", "France", "Poland"};

        // when - we try to find an existing string
        int result = main.findFirstInArray(list, "francE");

        // then - the result should be the index position of this string
        assertEquals(3, result,
                "The 'findFirstInArray' does not work correct for inputs " + Arrays.asList(list) + " and 'francE'");
    }

    @Test
    void task_3_4_shouldWorkWithEmptyArrays()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and - a List with Strings
        String[] list = new String[]{};

        // when - we try to find an existing string
        int result = main.findFirstInArray(list, "a");

        // then - the result should be the index position of this string
        assertEquals(-1, result,
                "The 'findFirstInArray' does not work correct for inputs " + Arrays.asList(list) + " and 'a'");
    }

    @Test
    void task_3_5_shouldDefinefindLastInArrayMethod()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // then - the method exists
        assertTrue(main.hasMethod("findLastInArray", String[].class, String.class),
                "Could not find the method 'findLastInArray', which receives a String[] and a String as parameters");

        // and - the method is public
        assertTrue(main.isMethodPublic("findLastInArray", String[].class, String.class),
                "Method 'findLastInArray' must be public");

        // and - the method is static
        assertTrue(main.isMethodStatic("findLastInArray", String[].class, String.class),
                "Method 'findLastInArray' must be static");

        // and - the method should return an int
        assertTrue(main.isMethodReturnType(int.class, "findLastInArray", String[].class, String.class),
                "Method 'findLastInArray' should return an int");
    }

    @Test
    void task_3_6_shouldFindTheLastString()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and - a List with Strings
        String[] list = new String[]{"Germany", "Japan", "Austria", "France", "Poland", "France"};

        // when - we try to find an existing string
        int result = main.findLastInArray(list, "France");

        // then - the result should be the index position of this string
        assertEquals(5, result,
                "The 'findLastInArray' does not work correct for inputs " + Arrays.asList(list) + " and 'France'");
    }

    @Test
    void task_3_7_shouldWorkWithNonexistentSearch()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and - a List with Strings
        String[] list = new String[]{"Germany", "Japan", "Austria", "France", "Poland"};

        // when - we try to find an unexisting string
        int result = main.findLastInArray(list, "Brazil");

        // then - the result should be the index position of this string
        assertEquals(-1, result,
                "The 'findLastInArray' does not work correct for inputs " + Arrays.asList(list) + " and 'Brazil'");
    }

    @Test
    void task_3_7_shouldIgnoreCase()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and - a List with Strings
        String[] list = new String[]{"Germany", "Japan", "Austria", "France", "Poland"};

        // when - we try to find an existing string
        int result = main.findLastInArray(list, "francE");

        // then - the result should be the index position of this string
        assertEquals(3, result,
                "The 'findLastInArray' does not work correct for inputs " + Arrays.asList(list) + " and 'francE'");
    }

    @Test
    void task_3_7_shouldWorkWithEmptyArrays()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and - a List with Strings
        String[] list = new String[]{};

        // when - we try to find an existing string
        int result = main.findLastInArray(list, "a");

        // then - the result should be the index position of this string
        assertEquals(-1, result,
                "The 'findLastInArray' does not work correct for inputs " + Arrays.asList(list) + " and 'a'");
    }
}
