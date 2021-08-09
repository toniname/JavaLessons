package com.homeworks.lessons7;
/*2) Create a generic class ArrayWorker with generic array field for working Integer and Double
Add code to counts the number of elements in each of arrays that are greater
than a specified element.*/
public class ArrayWorker<T extends Number> {
    private final T [] array;
    private final T value;

    public ArrayWorker(T[] array, T value) {
        this.array = array;
        this.value = value;
    }

    public T[] getArray() {
        return array;
    }

    public T getValue() {
        return value;
    }

    public void countElement(T[] array, T value){
        int i = 0;
        for ( T arr:  array){
            if ( arr.intValue() > value.intValue()){
                System.out.println(arr.intValue());
            }
            System.out.println("less than a specified element");
            }

        }


}
