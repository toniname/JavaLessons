package com.homeworks.lessons2;

import java.util.Objects;


public class Search implements System {
    private Flight[] flights;

    public Search() {
        this.flights = new Flight[10];//создать метод для увеличения массива в 2 раза
    }

    /* Организовать "умный поиск". Пользователь вводит требования(город отправления, город прибытия,
    время в полете, количество мест)
и выводить рейс, который соответствует требованиям.*/
    @Override
    public void findFlight(City cityFrom, City cityTo, int time, int seats) {//передавать объект и не вовзращать массив, просто печать

        for (Flight flight : flights) {
            if (Objects.isNull(flight) && flight.getCityTo() == cityTo) {

            }

        }

    }

    /* Просматривать все рейсы. */
    @Override
    public void findFlightAll() {

        for (Flight flight : flights) {
            if (flight != null) {
                //  System.out.println(flight);
            }
        }
    }

    /*После ввода страны прибытия и/или страны отправления выводить список подходящих рейсов. */
    @Override
    public void findFlightByEnum() {

        for (int i = 0; i < flights.length; i++) {
            if (Objects.isNull(flights[i])) {
//                flights[i] = flight;
            }

        }
    }

    /*Создавать рейс.*/
    @Override//rewrite
    public void addFlight(Flight flight) {

        for (int i = 0; i < flights.length; i++) {
            if (Objects.isNull(flights[i])) {
                flights[i] = flight;
            }

        }
    }


    //4) Просматривать информацию о конкретном рейсе.
    @Override
    public void findFlightByName(String name) {

        for (int i = 0; i < flights.length; i++) {
            if (Objects.nonNull(flights[i]) && flights[i].getFlightName().equals(name)) {
                // System.out.println(flights[i]);
                break;
            }
        }

    }


}



