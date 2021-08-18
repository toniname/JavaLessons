package com.homeworks.lessons7;

import java.util.Arrays;

public class ArrayUtil extends Array {


    public ArrayUtil(Object[] array) {
        super((Integer[]) array);
    }

    protected static <T extends Number> double averageValue(T[] array) {
        double sum = 0;
        for (T arr : array) {
             sum += arr.doubleValue();
            System.out.println(sum);
            return  sum / array.length;

        }

        return  0;
    }

}



