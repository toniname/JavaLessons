package com.homeworks.lessons8;

import com.homeworks.lessons7.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");


        ArrayList<String> solarSystem = new ArrayList<>();

        solarSystem.add(mars);
        solarSystem.add(venus);
        solarSystem.add(jupiter);
        solarSystem.add(null);
        solarSystem.add(4,null);
        for (Object ms : solarSystem){
            if (ms!=null){
                System.out.println("boom");
            }else{
                System.out.println("bam");
            }

        }

        System.out.println(solarSystem);

        Object neptune1 = new Object[3];
        Object uranus1 = new Object[3];
        Object saturn1 = new Object[3];
        ArrayList<Object> solarSystem1 = new ArrayList<>();
        solarSystem1.add(neptune1);
        solarSystem1.add(uranus1);
        solarSystem1.add(saturn1);


    }
}
