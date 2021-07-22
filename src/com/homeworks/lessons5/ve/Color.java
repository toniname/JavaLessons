package com.homeworks.lessons5.ve;

public enum Color {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00"), DARK("#0000");
    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
