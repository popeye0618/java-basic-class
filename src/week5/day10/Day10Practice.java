package week5.day10;

import week5.day10.student.Student;

public class Day10Practice {
    public static void main(String[] args) {

        Student[] students = {
                new Student("승환", 25),
                new Student("민수", 18),
                new Student("영희", 15)
        };

        // for문 사용
        for (int i = 0; i < students.length; i++) {
            students[i].introduce();
        }

        // 향상된 for문 사용
        for (Student student : students) {
            student.introduce();
        }

    }
}
