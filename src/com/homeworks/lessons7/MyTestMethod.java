package com.homeworks.lessons7;

/*
1) Create class MyTestMethod with generic static method calcNum (with two parameters: an array T[] and
variable maxElem of type T) that counts the number of elements in
an array T[] that are greater than a specified element maxElem.
 */
public class MyTestMethod {

    public static <T extends Integer> void calcNum(T[] array, T maxElem) {

        for (T arr : array) {
            if (arr.intValue() > maxElem.intValue()) {
                System.out.println(arr.intValue());
            } else {
                System.out.println("less than a specified element");
            }

        }
    }

}
