package week5.day9;

import week5.day9.dog.Dog;

public class Day9ClassObject {

    // 프로그램 실행 시 main 메소드 안에 있는 코드가 실행된다.
    public static void main(String[] args) {

        // Dog 클래스를 이용해 객체 (인스턴스) 만들기
        Dog dog1 = new Dog();
        dog1.name = "김율";
        dog1.age = 2;

        System.out.println("강아지 이름 = " + dog1.name);
        System.out.println("강아지 나이 = " + dog1.age);

        Dog dog2 = new Dog();
        dog2.name = "뽀삐";
        dog2.age = 4;

        System.out.println("강아지 이름 = " + dog2.name);
        System.out.println("강아지 나이 = " + dog2.age);
    }
}
