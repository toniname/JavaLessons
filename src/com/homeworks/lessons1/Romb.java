package com.homeworks.lessons1;

public class Romb extends Figure implements Calculatable {
    protected Romb(int side, int height) {
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
