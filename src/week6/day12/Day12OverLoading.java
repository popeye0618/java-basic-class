package week6.day12;

import week6.day12.calculator.Calculator;

public class Day12OverLoading {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// 두 정수를 더하는 메서드 호출
		System.out.println("두 정수의 합: " + calc.add(3, 5));
		// 세 정수를 더하는 메서드 호출
		System.out.println("세 정수의 합: " + calc.add(3, 5, 7));
		// 두 실수를 더하는 메서드 호출
		System.out.println("두 실수의 합: " + calc.add(3.5, 5.2));
	}
}
