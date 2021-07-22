package com.homeworks.lessons5.ve;

public class SuvCar extends Car{
    public SuvCar(String nameCar, int numberCar, Color color) {
        super(nameCar, numberCar, color);
    }

    @Override
    public void numberOfWheel() {
        super.numberOfWheel();
        System.out.println();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void fuelForVehicle() {
        super.fuelForVehicle();
    }
}
