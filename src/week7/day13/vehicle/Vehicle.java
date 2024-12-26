package week7.day13.vehicle;

// 부모 클래스: Vehicle
public class Vehicle {
	private int speed;

	public void move() {
		System.out.println("교통수단이 움직입니다. 속도: " + speed + "km/h");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
