package com.homeworks.lessons8;

public class Client implements Action {
    private long id;
    private String name;
    private String product;
    private double price;

    public Client(long id, String name, String product, double price) {
        this.id = id;
        this.name = name;
        this.product = product;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public void addProductInBasket() {

    }

    @Override
    public void deleteProductInBasket() {

    }

    @Override
    public void addSimilarInBasket() {

    }

    @Override
    public void findProduct() {

    }
}
