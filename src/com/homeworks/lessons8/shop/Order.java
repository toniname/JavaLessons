package com.homeworks.lessons8.shop;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> orderlist = new ArrayList<Item>();    //продукты в заказе
    private boolean payment = false;    //оплачен ли заказ
    private boolean register = false;   //обработан ли заказ Администратором


    public void addProdToOrder(ArrayList<Item> orderlist) {//добавить группу товаров к Заказу
        this.orderlist = orderlist;
    }


    public void addProdToOrder(Item product) {//добавить товар к Заказу
        orderlist.add(product);
    }


    public void showOrder() {//показать Заказ
        for (Item it : orderlist) {
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
