package week3.day6;

import java.util.Scanner;

public class Day6Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 특정 범위 내 숫자 합계 구하기
        System.out.print("숫자를 입력하세요: ");
        int max = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
            if (sum > 50) {
                System.out.println("합계가 50을 넘었습니다. 반복 종료!");
                break;
            }
            System.out.println("현재 합계: " + sum);
        }
        System.out.println("최종 합계: " + sum);

        // 홀수 출력하기
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();
        System.out.println("1부터 "+ num + "까지 홀수 출력:");

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                continue; // 짝수는 스킵
            }
            System.out.println(i);
        }


        // 별 찍기 (삼각형)
        System.out.print("삼각형의 높이를 입력하세요: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 별 찍기 (정삼각형)
        for (int i = 1; i <= height; i++) {
            // 공백 출력
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}