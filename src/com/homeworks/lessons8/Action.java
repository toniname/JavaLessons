package com.homeworks.lessons8;

import java.util.List;

public interface Action {

    //Добавление
    public Shop addProductInBasket(Shop shop);

    //Удаление
    void deleteProductInBasket(Long id);

    //Добавление SimilarProduct
    void addSimilarProductInBasket(Shop shop);

    //поиск или получение товаров
    void findProduct(Shop shop, String productName);

    //поиск по его ID
    void findProductById(Long id);

}
