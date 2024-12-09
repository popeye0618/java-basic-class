package week2.day4;

import java.util.Scanner;

public class Day4Condition {
    public static void main(String[] args) {

        // if 조건문
        boolean flag = true;

        if (flag) {
            // 조건이 참일 때 실행할 코드
        }

        //if - else 조건문
        if (flag) {
            // 조건이 참일 때 실행할 코드
        } else {
            // 조건이 거짓일 때 실행할 코드
        }

        // 중첩 조건문
        if (flag) {
            if (true) {

            }
        } else {

        }

        // switch 조건문

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("num = 1");
                break;
            case 2:
                System.out.println("num = 2");
                break;
            case 3:
                // break문 없을 때
                System.out.println("num = 3");

            case 4:
                System.out.println("num = 4");
                break;
            default:
                System.out.println("num은 1, 2, 3, 4 중 하나가 아닙니다.");
        }

        // 삼항 연산자
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        int maxNum = num1 > num2 ? num1 : num2;
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
