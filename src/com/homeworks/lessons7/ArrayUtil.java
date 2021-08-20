package com.homeworks.lessons7;

public class ArrayUtil extends Array {


    public ArrayUtil(Object[] array) {
        super((Integer[]) array);
    }

    protected static <T extends Integer> double averageValue(Array<Integer> array) {
        double sum = 0;
        for (int i = 0; i <= array.length() - 1; i++) {
            sum += array.get(i);
            //System.out.println(sum);
            double average = sum / array.length();
            System.out.println(average);
        }

        return 0;
    }

   /* protected static <T extends Double> double averageValue1(Array<Integer> array) {
        double sum = 0;
        for (T arr: array) {
            sum += arr.doubleValue();
            System.out.println(sum);
            return sum / array.length();

        }

        return sum;
    }*/

}



