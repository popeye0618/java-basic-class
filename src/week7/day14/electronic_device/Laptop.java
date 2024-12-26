package week7.day14.electronic_device;

// 자식 클래스: 노트북
public class Laptop extends ElectronicDevice {
	@Override
	public void turnOn() {
		System.out.println("노트북이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북이 꺼졌습니다.");
	}
}