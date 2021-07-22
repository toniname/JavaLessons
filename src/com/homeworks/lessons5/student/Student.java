package com.homeworks.lessons5.student;

/*Создать класс Студент со свойствами: ФИО, факультет, курс, минимальная оценка по экзаменам за последнюю сессию (по 5-ти бальной
системе). Определить методы: «Перевести на следующий курс», увеличивающий курс на 1, если минимальная оценка не менее 3,
иначе не делающий ничего, а также «Стипендия», возвращающий стипендию (в грн): 0 грн, если минимальная оценка не выше 3, 200 грн,
если минимальная оценка равна 4 и 300 грн, если минимальная оценка равна 5. Определить также метод «Информация», который возвращает
строку, содержащую информацию о студенте: ФИО, факультет, курс, минимальная оценка по экзаменам и начисленную стипендию.
Создать также класс наследник Студент-контрактник, в котором будет дополнительный логический параметр – уплачен ли контракт
и переопределены методы «Перевести на следующий курс», увеличивающий курс на 1, если минимальная оценка не менее 3 и за контракт
уплачено, а также «Стипендия» возвращающий всегда 0 грн. В главной программе создать объект
класса Студент и 2 объекта класса Студент-контрактник (один из которых уплатил за контракт, а другой нет). Выдать информацию о
студентах, затем применить к ним метод «Перевести на следующий курс» и снова выдать информацию о них.*/
public class Student {

    private final String name;
    private final String faculty;
    private int course;
    private final int minimumExamScore;
    private int scholarship;

    public Student(String name, String faculty, int course, int minimumExamScore, int scholarship) {
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.minimumExamScore = minimumExamScore;
        this.scholarship = scholarship;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMinimumExamScore() {
        return minimumExamScore;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public int transferToNextCourse() {
        if (getMinimumExamScore() >= 3) {
            setCourse(getCourse() + 1);
        } else {
            return getCourse();
        }
        return getCourse();
    }

    public int scholarship() {

        if (getMinimumExamScore() <= 3) {
            setScholarship(0);
        } else if (getMinimumExamScore() == 4) {
            setScholarship(200);
        } else if (getMinimumExamScore() == 5) {
            setScholarship(300);
        }
        return getScholarship();
    }

    public String information() {
        String info = "Name student" + " " + getName() + " " + "faculty" + " " + getFaculty() + " " + "course" + " "
                + getCourse() + " " + "MinimumExamScore" + " " + getMinimumExamScore();

        return info;
    }


}
