package com.homeworks.lessons8.table;

import java.time.Month;

public class MonthAndPrice {
    private Month month;
    private float price;

    public MonthAndPrice(Month month, float price) {
        this.month = month;
        this.price = price;
    }

    public Month getMonth() {
        return month;
    }

    public float getPrice() {
        return price;
    }


}
