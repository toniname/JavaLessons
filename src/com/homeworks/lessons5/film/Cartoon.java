package com.homeworks.lessons5.film;

//Создать также класс наследник Мультфильм, в котором переопределить метод «Стоимость» по формуле длительность*25 + количество
// актеров*10 (вне зависимости от режиссера). В главной программе (либо по нажатию на кнопку) создать 2 фильма с
//режиссерами: «Стивен Спилберг» и «Ежи Гофман», а также мультфильм и вывести информацию о них.
public class Cartoon extends Film {

    public Cartoon(String filmName, String producer, int lasting, int numberOfActors) {
        super(filmName, producer, lasting, numberOfActors);
    }

    @Override
    public double cost() {
        return getLasting() * 25 + getNumberOfActors() * 10;
    }
}
