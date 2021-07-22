package com.homeworks.lessons5.student;

public class Demo {
    public static void main(String[] args) {
 
        Student student = new Student("Alex", "T.N.O.S", 3, 4, 300);
        ContractStudent contractStudent = new ContractStudent("Jack", "T.N.O.S", 4,
                3, 0, true);
        ContractStudent contractStudent1 =new ContractStudent("Vasia", "T.N.O.S", 2,
                4, 0, false);

        System.out.println(student.information());
        System.out.println(contractStudent.information());
        System.out.println(contractStudent1.information());

        System.out.println(contractStudent.transferToNextCourse());
        System.out.println(contractStudent1.transferToNextCourse());

        System.out.println(student.information());
        System.out.println(contractStudent.information());
        System.out.println(contractStudent1.information());




    }

}
