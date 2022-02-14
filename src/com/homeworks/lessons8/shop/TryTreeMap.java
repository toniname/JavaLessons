package com.homeworks.lessons8.shop;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TryTreeMap {

    public static void main(String[] args) {

        TreeMap<String, TreeMap<String, Integer>> clients = new TreeMap<>();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine();

            if (s.equals("exit")) {
                break;
            }

            String[] parts = s.split(" ");

            String name = parts[0];
            String productName = parts[1];
            Integer count = Integer.parseInt(parts[2]);

            if (!clients.containsKey(name))
                clients.put(name, new TreeMap<String, Integer>());

            TreeMap<String, Integer> temp = clients.get(name);

            if (!temp.containsKey(productName))
                temp.put(productName, 0);

            Integer oldCount = temp.get(productName);

            temp.put(productName, oldCount + count);
        }

        for (Map.Entry<String, TreeMap<String, Integer>> entry : clients.entrySet()) {
            String key = entry.getKey();
            TreeMap<String, Integer> value = entry.getValue();

            System.out.println(key + ":");

            for (Map.Entry<String, Integer> product : value.entrySet()) {
                String keyProduct = product.getKey();
                Integer valueProduct = product.getValue();

                System.out.println(keyProduct + " " + valueProduct);

            }

        }

    }

}
