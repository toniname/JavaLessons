package com.homeworks.lessons5.people;

//3 (Реалисты) Если возраст собеседника меньше или равен или больше не более чем на 5 лет, говорит «Привет, <имя>!»,
//  иначе «Здравствуй, <имя>».
public class Realist extends Person {

    @Override
    public String greetings(Person person) {
            return getName() + " say: " + " Hi " + person.getName();

    }
    public String greetings2(Person person){
        return getName() + " say: "+" Hello " + person.getName();
    }

    @Override
    public String showInformation() {
        return super.showInformation() + ". I'm а realist";
    }
}
