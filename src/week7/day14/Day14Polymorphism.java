package week7.day14;

import week7.animal.Lion;
import week7.animal.Penguin;

public class Day14Polymorphism {
	public static void main(String[] args) {

		Lion lion = new Lion("사자");
		lion.makeSound();

		Penguin penguin = new Penguin("펭귄");
		penguin.makeSound();
	}
}
