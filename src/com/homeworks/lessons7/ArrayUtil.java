package com.homeworks.lessons7;

public class ArrayUtil {

    public static <T extends Number> int averageValue(T[] array) {
        int average = 0;
        for (T arr : array) {
            return average = arr.intValue() / array.length;

        }

        return average;
    }


}
