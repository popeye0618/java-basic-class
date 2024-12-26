package week6.day12;

import week6.day12.book.Book;
import week6.day12.calculator.ShapeCalculator;
import week6.day12.payment.Payment;

public class Day12Practice {
	public static void main(String[] args) {

		// todo: 더 동적인 프로그램을 만들기 위해 Scanner을 활욯해보자!

		// 1. 쇼핑몰 결제 계산기
		Payment payment = new Payment();

		// 정수 상품 가격 합계 계산
		System.out.println("두 상품 총액: " + payment.calculate(10000, 15000) + "원");
		System.out.println("세 상품 총액: " + payment.calculate(10000, 15000, 20000) + "원");

		// 실수 상품 가격 합계 계산
		System.out.println("두 상품 총액(실수): " + Math.round(payment.calculate(12.5, 8.49) * 100) / 100.0 + "원");


		// 2. 도형 면적 계산기
		ShapeCalculator calculator = new ShapeCalculator();

		// 각 도형의 면적 계산
		System.out.println("정사각형 면적: " + calculator.calculateArea(4));
		System.out.println("직사각형 면적: " + calculator.calculateArea(4, 5));
		System.out.println("원의 면적: " + Math.round(calculator.calculateArea(3.0) * 100) / 100.0);


		// 3. 도서 대여 시스템
		// 도서 배열 생성 및 초기화
		Book[] books = {
			new Book("해리포터", "J.K. 롤링"),
			new Book("반지의 제왕", "J.R.R. 톨킨"),
			new Book("어벤져스", "마블")
		};

		// 첫 번째 책 대여
		books[0].rentBook();
		// 이미 대여된 책을 한 번 더 대여할 경우
		books[0].rentBook();

		// 모든 도서의 상태 출력
		for (Book book : books) {
			book.printStatus();
		}
	}
}
