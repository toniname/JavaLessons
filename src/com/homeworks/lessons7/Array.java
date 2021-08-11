package com.homeworks.lessons7;

public class Array<T>  {
    private T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public int length(){
        return array.length;
    }
}
