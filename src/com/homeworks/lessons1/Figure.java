package com.homeworks.lessons1;

public abstract class Figure implements Calculatable {
    private int side;
    private int height;

    protected Figure(int side, int height) {
        this.side = side;
        this.height = height;
    }


    public int getSide() {
        return side;
    }

    public int getWeight() {
        return height;
    }


    @Override
    public String toString() {
        return "Figure{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }
}
