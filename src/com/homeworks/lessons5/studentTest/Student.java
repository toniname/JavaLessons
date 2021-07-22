package com.homeworks.lessons5.studentTest;

public class Student {
    private String name;
    private int numberOfLessons;
    final int numberOfGeneralLessons = 20;
    private boolean pass;

    public Student(String name, int numberOfLessons, boolean pass) {
        this.name = name;
        this.numberOfLessons = numberOfLessons;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }

    public int getNumberOfGeneralLessons() {
        return numberOfGeneralLessons;
    }


    public boolean isPass() {
        return pass;
    }

    public boolean setPass(boolean pass) {
        this.pass = pass;
        return pass;
    }

    public boolean passExam() {

        if (getName() != null && getName().equals(name) && getNumberOfLessons() == getNumberOfGeneralLessons()) {
            return true;
        } else
            return getName() != null && getName().equals(name) && getNumberOfLessons() > getNumberOfGeneralLessons() / 2
                    && randomGenerator() > 5;

    }

    public int randomGenerator() {
        int a = (int) (Math.random() * 10);
        return a;

    }


}
