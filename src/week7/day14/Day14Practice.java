package week7.day14;

import week7.day14.electronic_device.ElectronicDevice;
import week7.day14.electronic_device.Laptop;
import week7.day14.electronic_device.Smartphone;
import week7.day14.electronic_device.TV;

public class Day14Practice {
	public static void main(String[] args) {
		// ElectronicDevice 배열 생성
		ElectronicDevice[] devices = { new Smartphone(), new Laptop(), new TV() };

		// 모든 기기를 켜기
		System.out.println("모든 기기를 켭니다:");
		for (ElectronicDevice device : devices) {
			device.turnOn();
		}

		System.out.println("\n모든 기기를 끕니다:");
		// 모든 기기를 끄기
		for (ElectronicDevice device : devices) {
			device.turnOff();
		}

		// 업 캐스팅
		ElectronicDevice device = new Smartphone();

		// 다운 캐스팅
		Smartphone smartphone = (Smartphone) device;

	}
}
