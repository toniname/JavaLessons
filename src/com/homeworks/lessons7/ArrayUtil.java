package com.homeworks.lessons7;

public class ArrayUtil extends Array {

    public ArrayUtil(Object[] array) {
        super(array);
    }

    public static <T extends Number> void averageValue(T [] array) {

        for (T arr : array) {
            int average = arr.intValue() / array.length;
            System.out.println(average);
        }


    }


}
