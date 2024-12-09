package week5.day9;

import week5.day9.dog.Dog;

public class Day9ClassObject {

    // 프로그램 실행 시 main 메소드 안에 있는 코드가 실행된다.
    public static void main(String[] args) {

        // Dog 클래스를 이용해 객체 (인스턴스) 만들기
        Dog dog = new Dog();
        dog.name = "poppy";
        dog.age = 4;

        System.out.println("강아지 이름 = " + dog.name);
        System.out.println("강아지 나이 = " + dog.age);
    }
}
