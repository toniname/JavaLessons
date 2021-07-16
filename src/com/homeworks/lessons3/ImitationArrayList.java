package com.homeworks.lessons3;


import java.util.Arrays;
import java.util.Random;


/*Создать имитацию коллекции(с помощью массива) ArrayList для работы с типом int.

Создать класс с полем типа одномерный массив.

Класс должен выполнять следующие операции:

1) добавление элементов.
2) изменение/удаление элементов по индексу.
3) увеличение длины массива на заданное количество элементов.
4) уменьшение длины массива до заданного количество элементов.
5) вывод элементов в консоль в прямом и обратном порядке.
6) сортировка массива методом пузырька(http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/).
7) добавление массива в массив(контактенация).
8) удалять дубликаты.
9) Поиск индекса первого вхождения элемента методом линейного поиска.
10) Перемешивание элементов листа в случайном порядке.

При удалении элемента не обнулять его, а удалять физически.
Начальную размерность листа юзер вводит с консоли.
Условие добавления: перезаписывать если элемент равен 0;
В задаче не использовать методы класса Arrays, System и коллекции.*/
public class ImitationArrayList {
    private int[] array;
//    int[] array = {10, 5, 34, 34, 7};


    public ImitationArrayList(int size) {
        array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void addElement(int value) {
        if (value == 0) {
            System.out.println();
            return;
        }

        resize();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = value;
                break;
            }
        }
//        System.out.println( (array));
    }

    public void addElement1(int a) {
        int[] array2 = new int[array.length + 1];
        int count = 0;

        for (int arr : array) { //перебор
            //System.out.println(arr);
            array2[count] = arr;//присвоение ячейки arr,  ячейке(сount) нулевого массива array2
            //System.out.println(array2[count]);
            count++;
        }

        array2[count++] = a; //присвоение последней 0 ячейки а
        //System.out.println(count); //число пробегов т.е последний индекс
        // System.out.println(Arrays.toString(array2)); //проверка конечного массива

        System.out.println(Arrays.toString(array2));
    }

    private void resize() {
        if (array[array.length - 1] != 0) {
            int[] temp = new int[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }

            array = temp;
        }
//        System.out.println(Arrays.toString(array));
    }

    /*
      0 1 2 3 4 5
    * 4 5 6 8 9 0 -> 4 5 8 9 0
    * */

    public void deleteElementByIndex(int index) {
        int[] temp = new int[array.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = array[i];
        }

        for (int i = index; i < array.length - 1; i++) {
            temp[i] = array[i + 1];
        }

        array = temp;
        System.out.println(Arrays.toString(array));
    }

    public void changeElementByIndex(int index, int value) {

        //System.out.println(Arrays.toString(array));

        if (index < 0 || index > array.length) {
            System.out.println("Incorrect index");
            return;
        }

        if (value == 0) {
            System.out.println("Incorrect value");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[index] = value;
        }
    }

    public void deleteElementByIndex1(int index, int a) {
        if (a != 0) {
            for (int i = 0; i < array.length; i++) {
                array[index] = a;
            }
            System.out.println(Arrays.toString(array));

        } else if (index == array.length) {
            array[index] = a;
            int count = 0;
            int[] array2 = new int[array.length - 1];
            for (int arr : array2) {
                if (arr == 0)
                    array2[count] = array[count];

                else
                    break;
                count++;
            }
            System.out.println(Arrays.toString(array2));
        } else if (index < array.length) { //блок для перекидывания нулей в конец

            int count = 0;
            for (int arr : array) {
                if (arr == 0)
                    array[count] = array[count++];
                count++;
            }
            System.out.println(Arrays.toString(array));
        }
        //блок для удаления 0
        int[] array2 = new int[array.length - 1];
        //System.out.println(Arrays.toString(array));
        int count = 0;
        for (int arr : array2) {
            if (arr == 0) {
                array2[count] = array[count];

            } else {
                break;
            }
            count++;
        }


        System.out.println(Arrays.toString(array2));
    }

    public void increaseArray(int value) {// using fori

        int[] temp = new int[array.length + value];

        for (int i = 0; i < array.length; i++) { //перебор

            temp[i] = array[i];

        }

        array = temp;


    }

    public void decreaseElement(int value) {

        int[] temp = new int[array.length - value];//0

        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[i];
        }

        array = temp;
    }

//


    public void sortDescending() {
        int buf;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {

                buf = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buf;
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public void sortAscending() { //6) сортировка массива методом пузырька
        int buf;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {

                buf = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buf;
            }

        }
        System.out.println(Arrays.toString(array));

    }

    /*
     * 4 5 6 7 0 0 0  + 1 2 3
     * */

    public void concat(int[] arr) {

        int counter = 0;

        for (int e : array) {
            if (e == 0) {
                counter++;
            }

        }

        int positionZero = array.length - counter;

        if (counter < arr.length) {
            increaseArray(arr.length - counter + 1);
        }

        for (int i = positionZero, j = 0; j < arr.length; i++, ++j) {
            array[i] = arr[j];
        }
        System.out.println(Arrays.toString(array));
    }

    public void concat1(int[] arr) {
        int[] array2 = new int[array.length + arr.length];
        //System.out.println(array2.length);
        int count = 0;
        for (int ar : array) { //перебор
            //System.out.println(ar);
            array2[count] = ar;//присвоение ячейки ar,  ячейке(сount) нулевого массива array2
            count++;
        }
        count = 0;
        int i = 0;
        for (int ar : array2) {
            if (count >= array.length) {
                array2[count] = arr[i++];
            }
            count++;
        }
    }

    /*
     * 1 9 2 3 2 5 4
     * */

    public void deleteDuplicate() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    deleteElementByIndex(j);
                    --j;
                }
            }
        }
    }

    public void deleteDuplicate1() {
        int[] array = {10, 5, 34, 34, 7};
        int nElements = array.length;
        int[] array2 = new int[array.length - 1];
        int j;
        //System.out.println(Arrays.toString(array));
        int count = 0;
        for (int ar : array) {
            if (ar == array[count + 1]) {
                array[count + 1] = 0;
                break;
            }
            count++;
        }

        for (j = 0; j < nElements; j++)         //поиск удаляемого элемента
            if (array[j] == 0)
                break;

        for (int k = j; k < nElements - 1; k++) //сдвиг последующих элементов
            array[k] = array[k + 1];
        count = 0;
        for (int arr : array2) {                 //уменьшение размера
            if (arr == 0)
                array2[count] = array[count];
            else
                break;
            count++;
        }
        System.out.println(Arrays.toString(array2));
    }

    public void shuffle() {
        Random random = new Random();

        for (int i = array.length - 1; i > 1; i--) {
            int j = random.nextInt(i);//0-i

            int temp = array[i];

            array[i] = array[j];

            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public void findFirstElement(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println(i);
                break;
            }
        }
    }

}
