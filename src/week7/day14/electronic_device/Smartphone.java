package week7.day14.electronic_device;

// 자식 클래스: 스마트폰
public class Smartphone extends ElectronicDevice {
	@Override
	public void turnOn() {
		System.out.println("스마트폰이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰이 꺼졌습니다.");
	}

	public void hello() {
		System.out.println("hi");
	}
}