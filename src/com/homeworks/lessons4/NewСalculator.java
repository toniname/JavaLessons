package com.homeworks.lessons4;

import java.util.Random;

/*Метод класса возвращает значение для операции. Создать методы под действия *, /, -, +, %.
   Создать два public метода, возвращающих случайные числа.
   Каждый метод класса вызывает один из методов(возвращают случайные числа),
   чтобы получить значения для операций.
   Протестировать методы, выполняющие мат. действия.
   Для каждой операции в тесте возвращать разные значения используя Mockito.*/
public class NewСalculator {

    public static final Random RANDOM = new Random();

    public int getRandomOne() {
        int secondNumber = RANDOM.nextInt(50);
        // System.out.println(secondNumber);
        return secondNumber;

    }

    public int getRandomTwo() {
        int firstNumber = RANDOM.nextInt(50);
        // System.out.println(firstNumber);
        return firstNumber;
    }


    public int minus() {
        return getRandomOne() - getRandomTwo();

    }

    public int plus() {
        return getRandomOne() + getRandomTwo();
    }


    public int division() {
        return getRandomOne() / getRandomTwo();

    }


    public int subtraction() {
        return getRandomOne() * getRandomTwo();

    }

    public int modulDivision() {
        return getRandomOne() % getRandomTwo();

    }
   // ----------------------статик методы--------------------------------------------------
    public static int getStaticRandomOne() {

        return RANDOM.nextInt(50);

    }

    public static int getStaticRandomTwo() {

        return RANDOM.nextInt(50);
    }


    public static int minusStatic() {
        return getStaticRandomOne() - getStaticRandomTwo();

    }

    public static int plusStatic() {
        return getStaticRandomOne() + getStaticRandomTwo();
    }


    public int divisionStatic() {
        return getStaticRandomOne() / getStaticRandomTwo();

    }


    public int subtractionStatic() {
        return getStaticRandomOne() * getStaticRandomTwo();

    }

    public int modulDivisionStatic() {
        return getStaticRandomOne() % getStaticRandomTwo();

    }
    //---------------------прайвед методы--------------------------------------------------
    private  int getPrivateRandomOne() {

        return RANDOM.nextInt(50);

    }

    private  int getPrivateRandomTwo() {

        return RANDOM.nextInt(50);
    }


    public int minusPrivate() {
        return getPrivateRandomOne() - getPrivateRandomTwo();

    }

    public   int plusPrivate() {
        return getPrivateRandomOne() + getPrivateRandomTwo();
    }
    public int divisionPrivate() {
        return getPrivateRandomOne() / getPrivateRandomTwo();

    }


    public int subtractionPrivate() {
        return getPrivateRandomOne() * getPrivateRandomTwo();

    }

    public int modulDivisionPrivate() {
        return getPrivateRandomOne() % getPrivateRandomTwo();

    }
    //----------------------------прайвед без параметров---------------------------------------------------------------
    private  int getPrivateRandomOneWithParam(int value) {

        return RANDOM.nextInt(value);

    }

    private  int getPrivateRandomTwoWithParam(int value) {

        return RANDOM.nextInt(value);
    }


    public int minusPrivateWithParam(int value) {
        return getPrivateRandomOneWithParam(value) - getPrivateRandomTwoWithParam(value);

    }

    public   int plusPrivateWithParam(int value) {
        return getPrivateRandomOneWithParam(value) + getPrivateRandomTwoWithParam(value);
    }
    public int divisionPrivateWithParam(int value) {
        return getPrivateRandomOneWithParam(value) / getPrivateRandomTwoWithParam(value);

    }


    public int subtractionPrivateWithParam(int value) {
        return getPrivateRandomOneWithParam(value) * getPrivateRandomTwoWithParam(value);

    }

    public int modulDivisionPrivateWithParam(int value) {
        return getPrivateRandomOneWithParam(value) % getPrivateRandomTwoWithParam(value);

    }
}
