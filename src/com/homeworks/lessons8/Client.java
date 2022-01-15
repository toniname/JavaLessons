package com.homeworks.lessons8;
        /*1)добавление товара(название, производитель, дата производства и т.д.).
        2) добавление сопутствующих товаров.
        3) удаление товара с сопутствующими товарами.
        4) создание корзины для каждого юзера.
        5) выбор товара по определенным критериям и после выводить сопутствующие товары.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client implements Action {

    private final List<Shop> products = new ArrayList<Shop>();

    @Override
    public Shop addProductInBasket(Shop shop) {
        for (Object prod : products) {
            if (prod == null){
                products.add(shop);
            }
        }
        return null;
    }

    @Override
    public void deleteProductInBasket(Long id) {
       /* for(Iterator<Shop> it = products.iterator(); it.hasNext();) {
            Shop prod = it.next();
            if(prod.getId().equals(id)) {
                it.remove();
            }
        }*/
        products.removeIf(prod -> prod.getId().equals(id));
    }

    @Override
    public void addSimilarProductInBasket(Shop shop) {


    }

    @Override
    public void findProduct(Shop shop, String productName) {
        for (Object next : products) {
            if (next == null || next == productName){
                System.out.println(next);
            }
        }



    }

    @Override
    public void findProductById(Long id) {
        for (Object next : products) {
            if (next != null || next == id){
                System.out.println(next);
            }
        }



    }
}
