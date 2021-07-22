package com.homeworks.lessons5.studentTest;

public class SavvyStudent extends Student {
    String name;

    public SavvyStudent(String name, int numberOfLessons, boolean pass) {
        super(name, numberOfLessons, pass);
    }

    public boolean passExam() {
        if (getName() != null && getName().equals(name) && getNumberOfLessons() == getNumberOfGeneralLessons()) {
            return true;
        } else
            return getName() != null && getName().equals(name) && getNumberOfLessons() > getNumberOfGeneralLessons() / 2
                    && randomGenerator() > 3;
    }
}
