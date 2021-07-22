package com.homeworks.lessons5.polymorphism;

public abstract class Shape {

     private ShareType shareType;

    //other fields


    public Shape(ShareType shareType) {
        this.shareType = shareType;
    }

    public ShareType getShareType() {
        return shareType;
    }

    public void drawSquare() {
        //Code for drawing square
    }

    public void drawCircle() {
        //Code for drawing square
    }

    public void drawShape() {
        if (getShareType() == ShareType.SQUARE) {
            drawSquare();
        } else {
            drawCircle();
        }
    }

    //others methods
}

