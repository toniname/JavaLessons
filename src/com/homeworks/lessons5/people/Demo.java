package com.homeworks.lessons5.people;

public class Demo {

    public static void main(String[] args) {
        Formalist formalist = new Formalist();
        Informal informal = new Informal();
        Realist realist = new Realist();

        Person[] peoples = {formalist, informal, realist};

        for (int i = 0; i < peoples.length; i++) {
            Person person1 = peoples[i];

            for (int j = i + 1; j < peoples.length; j++) {
                Person person2 = peoples[j];

                System.out.println(" \t"  + person1.greetings(person2) + "\n" +
                         " \t" + person2.greetings(person1));
            }
        }

        /*System.out.println(formalist.showInformation());
        System.out.println(formalist.greetings(informals));
        System.out.println(formalist.greetings(realist));

        System.out.println(informals.showInformation());
        System.out.println(informals.greetings(formalist));
        System.out.println(informals.greetings(realist));

        System.out.println(realist.showInformation());
        if (realist.getAge()>= formalist.getAge()+5) {
            System.out.println(realist.greetings(formalist));
        }else {
            System.out.println(realist.greetings2(formalist));
        }
        if (realist.getAge()>= informals.getAge()+5) {
            System.out.println(realist.greetings(informals));
        }else {
            System.out.println(realist.greetings2(informals));
        }*/
    }
}
