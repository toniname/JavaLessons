package com.homeworks.lessons8;

import java.util.List;

public class Client extends Shop implements Action{
    private final long clientId;
    private String name;
    private double price;

    public Client(List<Object> product, long clientId, String name, double price) {
        super(product);
        this.clientId = clientId;
        this.name = name;
        this.price = price;
    }

    public long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }

    @Override
    public void addProductInBasket() {

    }

    @Override
    public void deleteProductInBasket() {

    }

    @Override
    public void addSimilarProductInBasket() {

    }

    @Override
    public void findProduct() {

    }
}
