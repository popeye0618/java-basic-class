package week8.day15;

import week8.day15.employee.Artist;
import week8.day15.employee.Chef;
import week8.day15.employee.Developer;
import week8.day15.employee.Doctor;
import week8.day15.employee.Employee;

public class Day15AbstractClass {
	public static void main(String[] args) {
		// 구체 클래스의 객체 생성
		Employee doctor = new Doctor("김의사");
		Employee developer = new Developer("박개발자");

		// 공통 동작과 개별 동작 확인
		doctor.startWork();
		doctor.performDuties();

		developer.startWork();
		developer.performDuties();

	}
}
