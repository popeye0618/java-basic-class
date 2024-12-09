package week3.day5;

import java.util.Scanner;

public class Day5Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 구구단 출력
        System.out.print("출력할 단을 입력하세요 (2~9): ");
        int num = sc.nextInt();

        if (num < 2 || num > 9) {
            System.out.print("2에서 9 사이의 숫자를 입력하세요: ");
        } else {
            for (int i = 1; i <= 9; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        // 구구단 거꾸로 출력
        if (num < 2 || num > 9) {
            System.out.print("2에서 9 사이의 숫자를 입력하세요: ");
        } else {
            for (int i = 9; i >= 1; i--) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}
