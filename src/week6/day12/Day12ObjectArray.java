package week6.day12;

import week5.day10.student.Student;

public class Day12ObjectArray {
	public static void main(String[] args) {
		// 학생 객체 배열 생성 (크기 3)
		Student[] students = new Student[3];

		// 배열 초기화: 각 인덱스에 학생 객체 생성
		students[0] = new Student("철수", 15);
		students[1] = new Student("영희", 14);
		students[2] = new Student("민수", 16);

		// 모든 학생의 자기소개 출력
		for (Student student : students) {
			student.introduce();
		}
	}
}
