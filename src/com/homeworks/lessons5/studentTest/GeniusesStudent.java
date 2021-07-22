package com.homeworks.lessons5.studentTest;

public class GeniusesStudent extends Student {
    String name;

    public GeniusesStudent(String name, int numberOfLessons, boolean pass) {
        super(name, numberOfLessons, pass);
    }

    public boolean passExam() {
        return getName() != null && getName().equals(name) && getNumberOfLessons() == 1;
    }
}
