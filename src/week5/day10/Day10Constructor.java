package week5.day10;

import week5.day10.cat.Cat;

public class Day10Constructor {
    public static void main(String[] args) {

        Cat cat = new Cat("밍키", 3);
        cat.introduce();

        String catName = cat.getName();
        System.out.println("고양이 이름: " + catName);
    }
}
