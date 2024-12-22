package week5.day10;

import week5.day10.cat.Cat;

public class Day10Method {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "고영희";
        cat.age = 5;

        String catName = cat.getName();
        System.out.println("고양이 이름은 = " + catName);

        int sum = add(1, 2);
        System.out.println("두 수의 합은: " + sum);

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
