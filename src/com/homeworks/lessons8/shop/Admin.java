package com.homeworks.lessons8.shop;

import java.util.ArrayList;

public class Admin {

    private ArrayList<Item> products = new ArrayList<Item>();
    private ArrayList<Client> blackclients = new ArrayList<Client>();

    //регистрация товара и добавление неплательщиков в черный список
    public void registerOrder(Client client) {
        if (client.getOrder().isPayment() == true) {
            client.getOrder().setRegister(true);
        } else {
            blackclients.add(client);
        }
    }

    //создание новых продуктов
    public void createNewProduct(String name, int price, long id, String produktName) {
        products.add(new Item(name, price, id, produktName));
    }
}

