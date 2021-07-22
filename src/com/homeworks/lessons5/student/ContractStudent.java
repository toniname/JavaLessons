package com.homeworks.lessons5.student;

class ContractStudent extends Student {
    private final boolean paidContract;

    public ContractStudent(String name, String faculty, int course, int minimumExamScore,
                           int scholarship, boolean paidContract) {
        super(name, faculty, course, minimumExamScore, scholarship);
        this.paidContract = paidContract;
    }

    public boolean isPaidContract() {
        return paidContract;
    }

    @Override
    public int transferToNextCourse() {
        if (getMinimumExamScore() >= 3 && isPaidContract()) {
            setCourse(getCourse() + 1);
        }

        return getCourse();
    }

    public String information() {
        String info = "Name student" + " " + getName() + " " + "faculty" + " " + getFaculty() + " " + "course" + " "
                + getCourse() + " " + "MinimumExamScore" + " " + getMinimumExamScore();

        return info;
    }
}
