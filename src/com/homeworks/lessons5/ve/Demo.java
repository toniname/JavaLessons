package com.homeworks.lessons5.ve;

public class Demo {
    public static void main(String[] args) {

        Car car = new Car("Lada", 423434, Color.RED);
        car.fuelForVehicle();
        car.numberOfWheel();

        Bus bus = new Bus("Ikarus", 97987, Color.BLUE);
        bus.numberOfWheel();

        CompactCar compactCar = new CompactCar("mini-cooper", 33098, Color.GREEN);
        compactCar.numberOfWheel();
        compactCar.fuelForVehicle();

        Truck truck = new Truck("Kamaz", 89567854, Color.DARK);
        truck.fuelForVehicle();
        truck.numberOfWheel();
    }
}
