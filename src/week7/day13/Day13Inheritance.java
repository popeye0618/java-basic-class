package week7.day13;

import week7.animal.Animal;
import week7.animal.Tiger;

public class Day13Inheritance {
	public static void main(String[] args) {

		// 부모 클래스의 기능 사용
		Animal animal = new Animal("일반 동물");
		animal.makeSound();

		// 자식 클래스의 기능 사용
		Tiger tiger = new Tiger("호랭이");
		tiger.makeSound();
		tiger.hunt();

	}
}
