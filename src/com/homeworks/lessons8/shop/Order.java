package com.homeworks.lessons8.shop;

import java.util.ArrayList;
import java.util.LinkedList;

public class Order {
    private LinkedList<Item> orderList = new LinkedList<Item>();    //продукты в заказе
    private LinkedList<Item>similarOrderListPhone = new LinkedList<Item>();// сопутствующие товары
    private boolean payment = false;    //оплачен ли заказ
    private boolean register = false;   //обработан ли заказ Администратором


    public void addProdToOrder(LinkedList<Item> orderlist) {//добавить группу товаров к Заказу
        this.orderList = orderlist;
    }

    public void addSimilarToOrder(LinkedList<Item>similarOrderListPhone){ //добавить сопутствующие товары
        this.similarOrderListPhone = similarOrderListPhone;
    }


    public void addProdToOrder(Item product) {//добавить товар к Заказу
        orderList.add(product);
    }


    public void showOrder() {//показать Заказ
        for (Item it : orderList) {
            System.out.println(it);
        }
    }


    public boolean isPayment() {//оплачен или нет
        return payment;
    }


    public void setPayment(boolean pay) {//оплачен (да/нет)
        payment = pay;
    }

    public boolean isRegister() {//регистрация
        return register;
    }

    public void setRegister(boolean reg) {
        register = reg;
    }

}
