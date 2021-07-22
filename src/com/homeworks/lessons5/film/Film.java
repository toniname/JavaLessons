package com.homeworks.lessons5.film;
/*Создать класс Фильм со свойствами: Название, Режиссер, длительность
(в минутах), количество актеров. Определить метод: «Стоимость», возвращающую примерную расчетную стоимость фильма
(в тыс. $), рассчитываемую по формуле длительность*20 + количество актеров*30, но если режиссер = «Стивен Спилберг» или «Джеймс
Кэмерон», то стоимость в два раза выше (по сравнению с вышеуказанной формулой). Определить также метод «Информация», который
возвращает строку, содержащую информацию о фильме: Название, режиссера, длительность, количество актеров и стоимость.
Создать также класс наследник Мультфильм, в котором переопределить метод «Стоимость» по формуле длительность*25 + количество
актеров*10 (вне зависимости от режиссера). В главной программе (либо по нажатию на кнопку) создать 2 фильма с
режиссерами: «Стивен Спилберг» и «Ежи Гофман», а также мультфильм и вывести информацию о них.*/

public class Film {
    private String filmName;
    private String producer;
    private int lasting;
    private int numberOfActors;

    public Film(String filmName, String producer, int lasting, int numberOfActors) {
        this.filmName = filmName;
        this.producer = producer;
        this.lasting = lasting;
        this.numberOfActors = numberOfActors;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getProducer() {
        return producer;
    }

    public int getLasting() {
        return lasting;
    }

    public int getNumberOfActors() {
        return numberOfActors;
    }

    public double cost() {
        double price = lasting * 20 + numberOfActors * 30;

        if (getProducer().equals("Steven Spielberg") || getProducer().equals("James Cameron")) {
            price *= 2;
        }
        return price;
    }

    public String information(double prise) {
        String info = "FilmName:" + " " + getFilmName() + " " + "Producer:" + " " + getProducer() + " " + "Number of actors:"
                + " " + getNumberOfActors() + " " + "cost:" + " " + prise;

        return info;
    }
}
