package com.for_test;

import java.util.Random;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public void print() {
        System.out.println("Hello world");
    }

    public int sumRandom(int a) {
//        print();
        return a + getRandom();
    }

    public int sumRandomStatic(int a) {
        return a + getRandomStatic();
    }

    public int sumRandomPrivate(int a) {
        return a + getRandomPrivate();
    }

    public int sumRandomPrivateWithParam(int a) {
        return a + getRandomPrivateWithParam(6);
    }

    public int getRandom() {
        return new Random().nextInt(50);
    }

    private int getRandomPrivate() {
        return new Random().nextInt(50);
    }

    private int getRandomPrivateWithParam(int value) {
        return new Random().nextInt(value);
    }

    public static int getRandomStatic() {
        return new Random().nextInt(50);
    }

}