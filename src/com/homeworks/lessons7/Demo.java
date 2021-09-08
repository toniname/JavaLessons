package com.homeworks.lessons7;

public class Demo {
    public static void main(String[] args) {

        Integer[] array = {4, 2, 4, 6, 1, 9, 1, 3};
        MyTestMethod.calcNum(array, 7);

        ArrayWorker<Integer> arrayWorker = new ArrayWorker<>(array, 6);
        arrayWorker.countElement(array, 6);

        Array<Integer> set1 = new Array<>(new Integer[]{1,2,3,4,5,});
        double averageValue1 = ArrayUtil.averageValue(set1);
        System.out.println(averageValue1);

        Array<Integer> set2 = new Array(new Double[]{1.0 ,3.0 ,5.0});
        double averageValue2 = ArrayUtil.averageValue(set2);
        System.out.println(averageValue2);

    }


}
