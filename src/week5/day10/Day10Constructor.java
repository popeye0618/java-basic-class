package week5.day10;

import week5.day10.cat.Cat;

public class Day10Constructor {
    public static void main(String[] args) {

        Cat cat1 = new Cat();

        Cat cat2 = new Cat("고영희");

        Cat cat3 = new Cat("밍키", 3);

        cat3.introduce();

        String catName = cat3.getName();
        System.out.println("고양이 이름: " + catName);
    }
}
