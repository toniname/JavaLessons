package com.homeworks.lessons3;

public class Demo {
    public static void main(String[] args) {
       ImitationArrayList imitationArrayList = new ImitationArrayList(10);
        int [] arr = {12,22,33};
        imitationArrayList.addElement(44);   //1) добавление элементов.
        imitationArrayList.deleteElementByIndex(2 );
        imitationArrayList.changeElementByIndex(4, 6);
        imitationArrayList.increaseArray(5);
        imitationArrayList.decreaseElement(2);
        imitationArrayList.sortDescending();
        imitationArrayList.sortAscending();
        imitationArrayList.concat(arr);
        imitationArrayList.deleteDuplicate();
        imitationArrayList.shuffle();
        imitationArrayList.findFirstElement(3);
        System.out.println();


    }
}
