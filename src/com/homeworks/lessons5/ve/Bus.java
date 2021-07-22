package com.homeworks.lessons5.ve;

public class Bus extends Vehicle implements Wheel {
    public Bus(String nameCar, int numberCar, Color color) {
        super(nameCar, numberCar, color);
    }

    @Override
    public void numberOfWheel() {
        int numberOfWheel = 4;
        System.out.println(numberOfWheel);

    }

    @Override
    public void move() {

        System.out.println("Move");

    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void fuelForVehicle() {
        System.out.println("diesel");
    }
}
