package week1.day2;

import java.util.Scanner;

public class Day2Scanner {
    public static void main(String[] args) {

        // Scanner를 사용하여 값 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.print("byte를 입력하세요: ");
        byte b = sc.nextByte();
        System.out.println("b = " + b);

        System.out.print("short를 입력하세요: ");
        short sh = sc.nextShort();
        System.out.println("sh = " + sh);

        System.out.print("int를 입력하세요: ");
        int i = sc.nextInt();
        System.out.println("i = " + i);

        System.out.print("long을 입력하세요: ");
        long l = sc.nextLong();
        System.out.println("l = " + l);

        System.out.print("float를 입력하세요: ");
        float f = sc.nextFloat();
        System.out.println("f = " + f);

        System.out.print("double을 입력하세요: ");
        double d = sc.nextDouble();
        System.out.println("d = " + d);

        System.out.print("문자열을 입력하세요: ");
        String s = sc.next();
        System.out.println("s = " + s);

        System.out.println("첫 번째 문자 추출하기");
        char c = s.charAt(0);
        System.out.println("c = " + c);

    }
}
