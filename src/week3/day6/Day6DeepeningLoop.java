package week3.day6;

import java.util.Scanner;

public class Day6DeepeningLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 무한 반복문
        System.out.println("무한 반복문 시작");
        int counter = 0;
        while (true) {
            System.out.println("반복 횟수: " + counter);
            counter++;
            if (counter >= 5) { // 일정 조건에서 break
                System.out.println("무한 반복문 종료");
                break;
            }
        }

        // break문 사용
        System.out.println("\n숫자 입력(10을 입력하면 종료):");
        while (true) {
            int number = sc.nextInt();
            if (number == 10) {
                System.out.println("반복 종료");
                break;
            }
            System.out.println("입력한 숫자: " + number);
        }

        // continue문 사용
        System.out.println("\n1부터 10까지 짝수 출력:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // 홀수는 스킵
                continue;
            }
            System.out.println(i);
        }

        // 중첩 반복문 예제: 2단부터 9단까지 구구단 출력
        System.out.println("구구단 표:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
