package com.homeworks.lessons8;
/*Создать приложение интернет - магазина(консольное). Приложение должен выполнять следующие операции:
1) добавление товара(название, производитель, дата производства и т.д.).
2) добавление сопутствующих товаров.
3) удаление товара с сопутствующими товарами.
4) создание корзины для каждого юзера.
5) выбор товара по определенным критериям и после выводить сопутствующие товары.
Учесть, что каждого товара определенное количество в магазине.
Примеры товаров: мобильные телефоны, телевизоры и т.д.*/
public class Shop implements Action {
    private String product;
    private int numberProduct;

    public Shop(String product, int numberProduct) {
        this.product = product;
        this.numberProduct = numberProduct;
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
