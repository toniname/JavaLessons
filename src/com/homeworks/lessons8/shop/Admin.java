package com.homeworks.lessons8.shop;

import java.util.LinkedList;

public class Admin {

    private LinkedList<Item> products = new LinkedList<>();
    private LinkedList<Client> blackClients = new LinkedList<>();

    //регистрация товара и добавление неплательщиков в черный список
    public void registerOrder(Client client) {
        if (client.getOrder().isPayment()) {
            client.getOrder().setRegister(true);
        } else {
            blackClients.add(client);
        }
    }

    //создание новых продуктов
    public void createNewProduct(String name, float price, long id, String producer, Category category, SubCategory subCategory) {
        products.add(new Item(name, price, id, producer, category, subCategory));
    }
}

