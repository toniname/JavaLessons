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
    private String producer; // производитель
    private Category category;
    private SubCategory subCategory;
    private int count;


    public Item(String name, float price, long id, String producer, Category category, SubCategory subCategory) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.producer = producer;
        this.category = category;
        this.subCategory = subCategory;
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

    public void setPrice(float price) {
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
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", produktName='" + producer + '\'' +
                '}';
    }
}

