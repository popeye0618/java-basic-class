package week7.day13;

import week7.animal.Lion;
import week7.animal.Penguin;
import week7.day13.vehicle.Bicycle;
import week7.day13.vehicle.Car;
import week7.day13.vehicle.Vehicle;

public class Day13Practice {
	public static void main(String[] args) {

		// 1. 교통수단 클래스 설계하기
		// Vehicle 객체
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(50);
		vehicle.move();

		// Car 객체
		Car car = new Car();
		car.setSpeed(80);
		car.setFuel(10);
		car.move();
		car.refuel();

		// Bicycle 객체
		Bicycle bicycle = new Bicycle();
		bicycle.setSpeed(20);
		bicycle.move();
		bicycle.pedal();


		// 2. 동물 클래스 확장하기
		// Lion 객체
		Lion lion = new Lion("사자");
		lion.eat();
		lion.roar();

		// Penguin 객체
		Penguin penguin = new Penguin("펭귄");
		penguin.eat();
		penguin.swim();
	}
}
