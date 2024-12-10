package week2.day3;

import java.util.Scanner;

public class Day3Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("세 번째 숫자를 입력하세요: ");
        int num3 = sc.nextInt();

        // 세 수의 평균 구하기
        int average1 = (num1 + num2 + num3) / 3;
        System.out.println("average = " + average1);

        // 형변환
        double average2 = (double) (num1 + num2 + num3) / 3;
        double average3 =  (num1 + num2 + num3) / 3.0;
        System.out.println("average = " + average2);
        System.out.println("average3 = " + average3);

        // 소수점 첫 번째 자리 반올림
        double average4 = Math.round(average2);
        System.out.println("average3 = " + average4);

        // 자동 형변환
        int a = 2;
        double dd = a;
        System.out.println("dd = " + dd); // dd == 2.0

        // 명시적 형변환
        double d = 3.5;
        int t = (int) d;
        System.out.println("t = " + t); // t == 3


        // 문자열 -> 숫자 형변환
        String s = "100";
        int i = Integer.parseInt(s) - 10;
        System.out.println("i = " + i);
    }
}
