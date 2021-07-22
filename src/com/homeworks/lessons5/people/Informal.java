package com.homeworks.lessons5.people;

//2 (Неформалы) Со всеми здороваются: «Привет, <имя>!»
public class Informal extends Person {

    @Override
    public String greetings(Person person) {
        return getName() + " say: "+" Hello " + person.getName();
    }

    @Override
    public String showInformation() {
        return super.showInformation() + ". I'm а informal";
    }

}
