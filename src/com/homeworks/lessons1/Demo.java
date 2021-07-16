package com.homeworks.lessons1;

public class Demo {
    public static void main(String[] args) {
        Calculatable calculatable = new Calculatable() {
            @Override
            public float calculateSquare() {
                return 0;
            }
        };
        calculatable.print();
        Parallelogram parallelogram = new Parallelogram(40, 60);
        Romb romb = new Romb(45, 90);
        Triangle triangle = new Triangle(32, 78);

        System.out.println(parallelogram.calculateSquare());
        System.out.println(romb.calculateSquare());
        System.out.println(triangle.calculateSquare());


    }
}
