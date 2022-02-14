package com.homeworks.lessons8.shop;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private List<Item> orderList = new LinkedList<>();    //продукты в заказе
    private boolean payment/* = false*/;    //оплачен ли заказ
    private boolean register/* = false*/;   //обработан ли заказ Администратором

    //constructor
    public Order(List<Item> orderList, boolean payment, boolean register) {
        this.orderList = orderList;
        this.payment = payment;
        this.register = register;
    }

    public void addProductsToOrder(Item item) {//добавить группу товаров к Заказу
        this.orderList.add(item);
    }

    public void showOrder() {//показать Заказ
        for (Item it : orderList) {
            System.out.println(it);
        }
    }

    public void setPayment(boolean pay) {//оплачен (да/нет)
        payment = pay;
    }

    public boolean isPayment() {//оплачен или нет
        return payment;
    }

    public boolean isRegister() {//регистрация
        return register;
    }

    public void setRegister(boolean reg) {
        register = reg;
    }

}
