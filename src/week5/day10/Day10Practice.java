package week5.day10;

import java.util.Scanner;

import week5.day10.student.Student;

public class Day10Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = {
                new Student("승환", 25),
                new Student("민수", 18),
                new Student("영희", 15)
        };

        Student[] students1 = new Student[3];
        for (int i = 0; i < students1.length; i++) {
            String name = "";
            int age = 0;

            System.out.print("학생 " + (i + 1) + "의 이름을 입력하세요: ");
            name = sc.next();
            System.out.print("학생 " + (i + 1) + "의 나이를 입력하세요: ");
            age = sc.nextInt();

            students1[i] = new Student(name, age);
        }

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
