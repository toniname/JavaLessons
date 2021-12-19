package com.homeworks.lessons8;

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

    private String firstName;

    private String lastName;

    private String productName;

    private String phone;

    private String email;

    public Shop() {
    }

    public Shop(String firstName, String lastName, String productName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.productName = productName;
        this.phone = phone;
        this.email = email;
    }

    public Shop(Long id, String firstName, String lastName, String productName, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.productName = productName;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", productName='" + productName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
