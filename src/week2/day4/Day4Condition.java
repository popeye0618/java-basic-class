package week2.day4;

import java.util.Scanner;

public class Day4Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if - else 문
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("양수입니다.");
        } else if (number < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("0입니다.");
        }

        // switch 조건문
        int day = 3; // 월요일: 1, 화요일: 2, ...
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("잘못된 값입니다.");
        }

        // 삼항 연산자
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        int maxNum = (num1 > num2) ? num1 : num2;
        System.out.println("더 큰 숫자는 " + maxNum + "입니다.");


        // 두 수 크기 비교 프로그램
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("첫 번째 숫자가 더 큽니다.");
        } else if (a < b) {
            System.out.println("두 번째 숫자가 더 큽니다.");
        } else {
            System.out.println("두 숫자가 같습니다.");
        }

    }
}
