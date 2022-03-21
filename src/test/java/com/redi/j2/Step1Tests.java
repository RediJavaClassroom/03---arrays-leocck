package com.redi.j2;

import com.redi.j2.fixtures.Fixtures;
import com.redi.j2.proxies.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Step1Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStream() {
        System.setOut(originalOut);
    }

    @Test
    void task_1_1_shouldDefineprintReversedArrayMethod()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // then - the method exists
        assertTrue(main.hasMethod("printReversedArray", int[].class),
                "Could not find the method 'printReversedArray', which receives a int[] as parameter");

        // and - the method is public
        assertTrue(main.isMethodPublic("printReversedArray", int[].class),
                "Method 'printReversedArray' must be public");

        // and - the method is static
        assertTrue(main.isMethodStatic("printReversedArray", int[].class),
                "Method 'printReversedArray' must be static");

        // and - the method should return 'void'
        assertTrue(main.isMethodReturnType(void.class, "printReversedArray", int[].class),
                "Method 'printReversedArray' should return void");
    }

    @Test
    void task_1_2_shouldPrintReversedArray()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and a list of numbers
        int[] numbers = new int[]{0, 1, 2, 3, 4};

        // and - the console output set
        setUpStream();

        // when - you run the 'printReversedArray' method
        main.printReversedArray(numbers);

        // then - the reversed list should be printed in the default system output
        String reversed = "[4, 3, 2, 1, 0]";
        assertTrue(outContent.toString().contains(reversed),
                "The 'printReversedArray' does not work correct for input [0, 1, 2, 3, 4]. It should print [4, 3, 2, 1, 0] in the default output.");
    }

    @Test
    void task_1_2_shouldWorkWithOneSingleElement()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and a list of numbers
        int[] numbers = new int[] {7};

        // and - the console output set
        setUpStream();

        // when - you run the 'printReversedArray' method
        main.printReversedArray(numbers);

        // then - the reversed list should be the same as the original list
        assertTrue(outContent.toString().contains("[7]"),
                "The 'printReversedArray' does not work correct for one single element [7]. It should print [7] in the default output.");
    }

    @Test
    void task_1_2_shouldWorkWithEmptyArray()
    {
        // given - the Main class
        Main main = Fixtures.createMain();

        // and a list of numbers
        int[] numbers = new int[]{};

        // and - the console output set
        setUpStream();

        // when - you run the 'printReversedArray' method
        main.printReversedArray(numbers);

        // then - the reversed list should be printed in the default system output
        assertTrue(outContent.toString().contains("[]"),
                "The 'printReversedArray' does not work correct for an empty array as input. It should print [] in the default output.");
    }
}
