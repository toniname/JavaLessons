package com.homeworks.lessons8.shop;
/*1) добавление товара(название, производитель, дата производства и т.д.).
2) добавление сопутствующих товаров.
3) удаление товара с сопутствующими товарами.
4) создание корзины для каждого юзера.
5) выбор товара по определенным критериям и после выводить сопутствующие товары.

Учесть, что каждого товара определенное количество в магазине.

Примеры товаров: мобильные телефоны, телевизоры и т.д.*/
public class Item {
    private String name; //Название товара
    private float price;  // Цена
    private long id; //Айдишник
    private String produktName; // производитель


    public Item(String name, int price, long id, String produktName) {
        this.name = name;
        this.price = price;
        this.id = price;
        this.produktName = produktName;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice (float price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Название = "+name+" Стоимость = "+price;
    }
}

