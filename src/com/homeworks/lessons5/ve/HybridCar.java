package com.homeworks.lessons5.ve;

public class HybridCar extends Vehicle implements Wheel{
    public HybridCar(String nameCar, int numberCar, Color color) {
        super(nameCar, numberCar, color);
    }

    @Override
    public void numberOfWheel() {

    }

    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void fuelForVehicle() {

        if (getFuel()!= null || getFuel().equals("electric") || getFuel().equals("diesel")){
            System.out.println(getFuel());
        }
        else {
            System.out.println("fuel is not suitable");
        }

    }
}
