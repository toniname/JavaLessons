package com.homeworks.lessons6;
/* 6) Входные данные должны быть загружены из файла 'part3.txt'
Файл содержит символы, целые числа и числа с плавающей запятой.
         Напишите класс, который имеет следующие функциональные возможности: в цикле пользователь вводит тип данных
         (один из них: char, int, double, String),в ответ приложение выводит на консоль все значения соответствующих типов,
         которые существуют в файле. Если пользователь вводит слово «стоп», приложение выходит из цикла.
         В остальных случаях следует распечатать «Неправильный ввод» Решите задачу с помощью регулярных выражений. Пример исходного файла:
     ————————————————————————-
     а bcd 43.43 432 и л фвыа 89.98 */
import java.io.IOException;

public class ScannerDemo {

    public static void main(String[] args) throws IOException {
        ScannerOne scannerOne = new ScannerOne();
        ScannerTwo scannerTwo = new ScannerTwo();
        scannerOne.setDigital(""); //numeral
        scannerOne.setLiteral("letter"); //letter
        scannerOne.getSymbol(""); //char
        scannerOne.setDigitalDouble(""); //double
        scannerTwo.homeRegexTwo(scannerOne.homeRegexOne());

    }




}
