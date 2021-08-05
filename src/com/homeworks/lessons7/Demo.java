package com.homeworks.lessons7;

public class Demo {
    public static void main(String[] args) {
        Integer[] array = {4, 2, 4, 6, 1, 9, 1, 3};
        MyTestMethod<Integer> myTestMethod  = new MyTestMethod<>(array, 6);
        MyTestMethod.calcNum(array, 6);

    }
}
