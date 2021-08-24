package com.homeworks.lessons7;

public class ArrayUtil extends Array<Integer> {

    public ArrayUtil(Integer[] array) {
        super(array);
    }

    protected static <T extends Integer> double averageValue(Array<Integer> array) {
        double sum = 0;
        for (int i = 0; i < array.length(); i++) {
            sum += array.get(i);
            //System.out.println(sum);
        }
        double average = sum / array.length();
        System.out.println(average);

        return 0;
    }


}



