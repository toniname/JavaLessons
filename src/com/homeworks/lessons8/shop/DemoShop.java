package com.homeworks.lessons8.shop;

public class DemoShop {
    public static void main(String[] args) {

        Item item = new Item("adsad", 45355, 346677777, "produktName");
        System.out.println(item.getName());



        Client client = new Client();



        Order order = new Order();

        order.setPayment(true);
        order.setRegister(true);
        order.isPayment();
        order.showOrder();
    }
}
