package week7.day14;

import java.util.Scanner;

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



		// 보너스 문제
		Scanner sc = new Scanner(System.in);

		System.out.print("높이를 입력하세요: ");
		int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<n-1-i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<n-2-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
