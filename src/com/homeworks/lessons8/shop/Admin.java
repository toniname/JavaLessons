package com.homeworks.lessons8.shop;

import java.util.LinkedList;

public class Admin {

    private LinkedList<Item> products = new LinkedList<Item>();
    private LinkedList<Client> blackclients = new LinkedList<Client>();

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

