package com.homeworks.lessons7;

public class Demo {
    public static void main(String[] args) {


        Integer[] array = {4, 2, 4, 6, 1, 9, 1, 3};
        MyTestMethod myTestMethod = new MyTestMethod();
        MyTestMethod.calcNum(array, 7);


        ArrayWorker<Integer> arrayWorker = new ArrayWorker<>(array, 6);
        arrayWorker.countElement(array, 6);

        ArrayUtil arrayUtil = new ArrayUtil(array);


    }


}
