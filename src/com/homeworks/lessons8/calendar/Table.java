package com.homeworks.lessons8.calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Table {
    private String month;
    private float price;

    public Table(String month, float price) {
        this.month = month;
        this.price = price;
    }


    public Table(String month, float price1, float price2, float price3) {
    }

    public static void main(final String[] args) {
        List<Table> produkts = new ArrayList<>();
        String serchMonth = "Jan";
        float serchPrice1 = 34666;
        float serchPrice2 = 235521;
        float serchPrice3 = 103565;


        produkts.add(new Table("Jan", 34666, 235521, 103565));
        produkts.add(new Table("Feb", 546757, 90532, 199546));
        produkts.add(new Table("Mar", 3242, 53703111, 24355));
        produkts.add(new Table("Apr", 13311, 2443111, 45657));
        produkts.add(new Table("May", 1341444, 64432, 67676));
        produkts.add(new Table("Jun", 12322222, 32467, 8575));
        produkts.add(new Table("Jul", 6567333, 43219, 98999));
        produkts.add(new Table("Aug", 8784444, 367890, 8888));
        produkts.add(new Table("Sep", 98555555, 32121, 5555));
        produkts.add(new Table("Oct", 37732, 234687, 555444));
        produkts.add(new Table("Nov", 522101, 200099, 33333));
        produkts.add(new Table("Dec", 14334, 300332, 222622));


        for (Table prod : produkts) {
            if (Objects.equals(prod.month, serchMonth) && ((prod.price == serchPrice1)
                    || (prod.price == serchPrice2) || (prod.price == serchPrice3))) {
                System.out.println(prod);
            }
        }

    }

}
