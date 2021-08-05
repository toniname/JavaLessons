package com.homeworks.lessons7;

import javax.swing.text.TabExpander;

/*1) Create class MyTestMethod with generic static method calcNum (with two parameters: an array T[] and
variable maxElem of type T) that counts the number of elements in
an array T[] that are greater than a specified element maxElem.
2) Create a generic class ArrayWorker with generic array field for working Integer and Double
Add code to counts the number of elements in each of arrays that are greater
than a specified element. */
public class MyTestMethod<T> {
    private final T[] array;
    private final T maxElem;

    public MyTestMethod(T[] array, T maxElem) {
        this.array = array;
        this.maxElem = maxElem;
    }

    public static <T> void calcNum(T[] array, T maxElem) {
        int i = 0;
        for (T arr : array){
            System.out.println(arr);


        }

    }
}
