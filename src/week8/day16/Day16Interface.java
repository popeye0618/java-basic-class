package week8.day16;

import week8.day16.interfaces.Bird;
import week8.day16.interfaces.Duck;
import week8.day16.interfaces.Fish;
import week8.day16.interfaces.Flyable;
import week8.day16.interfaces.Swimmable;

public class Day16Interface {
	public static void main(String[] args) {
		Flyable bird = new Bird();
		Swimmable fish = new Fish();
		Duck duck = new Duck();

		bird.fly();
		fish.swim();
		duck.fly();
		duck.swim();
	}
}
