package com.homeworks.lessons5.people;

//1 (Формалисты) Здороваются со всеми так: «Здравствуй, <имя>», где <имя> – имя человека, с которым он здоровается.
public class Formalist extends Person {

    @Override
    public String greetings(Person person) {
        return getName() + " say: "+" Hello " + person.getName();
    }

    @Override
    public String showInformation() {
        return super.showInformation() + ". I'm а formalist";
    }
}
