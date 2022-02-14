package com.homeworks.lessons8.shop;

import java.util.List;

public class ShopService {
    private List<Client> clients;
    private List<Item> existsItems; //существующие в магазине

    public ShopService(List<Client> clients, List<Item> existsItems) {
        this.clients = clients;
        this.existsItems = existsItems;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Item> getExistsItems() {
        return existsItems;
    }


}
