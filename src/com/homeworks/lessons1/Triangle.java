package com.homeworks.lessons1;

public class Triangle extends Figure implements Calculatable {
    protected Triangle(int side, int height) {
        super(side, height);
    }

    @Override
    public float calculateSquare() {
        return (float) (0.5 * getSide() * getWeight());
    }

    @Override
    public void print() {

    }
}
