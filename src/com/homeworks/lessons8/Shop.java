package com.homeworks.lessons8;

import java.util.Date;

/*Создать приложение интернет - магазина(консольное). Приложение должен выполнять следующие операции:
1) добавление товара(название, производитель, дата производства и т.д.).
2) добавление сопутствующих товаров.
3) удаление товара с сопутствующими товарами.
4) создание корзины для каждого юзера.
5) выбор товара по определенным критериям и после выводить сопутствующие товары.
Учесть, что каждого товара определенное количество в магазине.
Примеры товаров: мобильные телефоны, телевизоры и т.д.*/
public class Shop {

    private Long id;

    private String clientName;

    private String fabricatorName;

    private String productName;

    private String phone;

    private Date dateOfProduct;

    private String email;

    public Shop() {

    }

    public Shop(String clientName, String fabricatorName, String productName, String phone, Date dateOfProduct, String email) {
        this.clientName = clientName;
        this.fabricatorName = fabricatorName;
        this.productName = productName;
        this.phone = phone;
        this.dateOfProduct = dateOfProduct;
        this.email = email;
    }

    public Shop(Long id, String clientName, String fabricatorName, String productName, String phone, Date dateOfProduct, String email) {
        this.id = id;
        this.clientName = clientName;
        this.fabricatorName = fabricatorName;
        this.productName = productName;
        this.phone = phone;
        this.dateOfProduct = dateOfProduct;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getFabricatorName() {
        return fabricatorName;
    }

    public void setFabricatorName(String fabricatorName) {
        this.fabricatorName = fabricatorName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfProduct() {
        return dateOfProduct;
    }

    public void setDateOfProduct(Date dateOfProduct) {
        this.dateOfProduct = dateOfProduct;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", fabricatorName='" + fabricatorName + '\'' +
                ", productName='" + productName + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfProduct=" + dateOfProduct +
                ", email='" + email + '\'' +
                '}';
    }
}
