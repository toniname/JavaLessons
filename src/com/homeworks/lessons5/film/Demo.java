package com.homeworks.lessons5.film;

public class Demo {
    public static void main(String[] args) {
        Film film = new Film("filmName", "Steven Spielberg", 60, 50);
        Film film2 = new Film("filmName", "Ежи Гофман", 60, 50);
        // Cartoon cartoon = Cartoon("Cartoon", );
        System.out.println(film.cost());
        System.out.println(film2.cost());
        System.out.println(film.information(film.cost()));
        System.out.println(film2.information(film2.cost()));


    }
}
