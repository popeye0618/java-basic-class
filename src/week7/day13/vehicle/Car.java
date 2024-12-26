package week7.day13.vehicle;

// 자식 클래스: Car
public class Car extends Vehicle {
	int fuel;

	public void refuel() {
		System.out.println("자동차가 연료를 충전합니다. 남은 연료: " + fuel + "L");
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
}

