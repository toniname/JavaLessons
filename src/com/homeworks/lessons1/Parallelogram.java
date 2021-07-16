package com.homeworks.lessons1;

public class Parallelogram extends Figure implements Calculatable {

    protected Parallelogram(int side, int height) {
        super(side, height);
    }

    @Override
    public float calculateSquare() {
        return getSide() * getWeight();
    }

    @Override
    public void print() {

    }
}
