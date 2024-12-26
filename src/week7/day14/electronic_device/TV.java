package week7.day14.electronic_device;

// 자식 클래스: TV
public class TV extends ElectronicDevice {
	@Override
	public void turnOn() {
		System.out.println("TV가 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV가 꺼졌습니다.");
	}
}