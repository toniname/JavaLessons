package com.homeworks.lessons7;

public class Array<T>  {
    private final T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public T get(int index){
        return array[index];
    }

    public int length(){
        return array.length;
    }
}
