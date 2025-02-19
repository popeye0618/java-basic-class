package week8.day15;

import week8.day15.teacher.EnglishTeacher;
import week8.day15.teacher.MathTeacher;
import week8.day15.teacher.ScienceTeacher;
import week8.day15.teacher.Teacher;

public class Day15Practice2 {
	public static void main(String[] args) {
		// Teacher 객체 생성
		Teacher mathTeacher = new MathTeacher("김수학");
		Teacher englishTeacher = new EnglishTeacher("이영어");
		Teacher scienceTeacher = new ScienceTeacher("박과학");

		// 각 선생님 소개와 수업 확인
		mathTeacher.introduce();
		mathTeacher.teachSubject();

		englishTeacher.introduce();
		englishTeacher.teachSubject();

		scienceTeacher.introduce();
		scienceTeacher.teachSubject();

		// 객체 배열로 관리
		Teacher[] teachers = {
			new MathTeacher("김수학"),
			new EnglishTeacher("이영어"),
			new ScienceTeacher("박과학"),
		};

		for (Teacher teacher : teachers) {
			teacher.introduce();
			teacher.teachSubject();
		}
	}
}
