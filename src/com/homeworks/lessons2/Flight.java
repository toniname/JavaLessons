package com.homeworks.lessons2;

import java.util.Date;

public class Flight {
    private static long id;
    private int price;
    private int persons;
    private String flightName;
    private int flightTime;
    private Date dateAvailableFrom;
    private Date dateAvailableTo;
    private int numberOfSeats;
    private City city1;//use enum
    private City city2;


    public Flight(int price, int persons, String flightName, int flightTime, Date dateAvailableFrom,
                  Date dateAvailableTo, int numberOfSeats, City city1, City city2) {
        this.id = ++id;
        this.price = price;
        this.persons = persons;
        this.flightName = flightName;
        this.flightTime = flightTime;
        this.dateAvailableFrom = dateAvailableFrom;
        this.dateAvailableTo = dateAvailableTo;
        this.numberOfSeats = numberOfSeats;
        this.city1 = city1;
        this.city2 = city2;
    }

    public String getFlightName() {
        return flightName;
    }

    public int getPersons() {
        return persons;
    }

    public double getFlightTime() {
        return flightTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public City getCityTo() {
        return city1;
    }

    public City getCity2() {
        return city2;
    }

    public void view() {
        //print all fields
    }
}
