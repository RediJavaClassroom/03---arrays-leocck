package com.redi.j2.proxies;

import com.redi.j2.utils.ReflectionProxy;

import java.util.List;

public class Main extends ReflectionProxy {

    @Override
    public String getTargetClassName() {
        return "com.redi.j2.Main";
    }

    public static void printReversedArray(int[] arrayToPrint){
        Main main = new Main();
        if(main.getTarget() == null) {
            return;
        }
        main.invokeMethod("printReversedArray", new Class[]{int[].class}, arrayToPrint);
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        Main main = new Main();
        if(main.getTarget() == null) {
            return null;
        }
        return main.invokeMethod("mergeArrays", new Class[]{int[].class, int[].class}, array1, array2);
    }

    public static int findFirstInArray(String[] array, String search) {
        Main main = new Main();
        if(main.getTarget() == null) {
            return -1;
        }
        return main.invokeMethod("findFirstInArray", new Class[]{String[].class, String.class}, array, search);
    }

    public int findLastInArray(String[] array, String search) {
        Main main = new Main();
        if(main.getTarget() == null) {
            return -1;
        }
        return main.invokeMethod("findLastInArray", new Class[]{String[].class, String.class}, array, search);
    }

    public static int secondSmallest(int[] array) {
        Main main = new Main();
        if(main.getTarget() == null) {
            return -1;
        }
        return main.invokeMethod("secondSmallest", new Class[]{int[].class}, array);
    }
}
