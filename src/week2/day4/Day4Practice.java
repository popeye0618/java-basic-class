package week2.day4;

import java.util.Scanner;

public class Day4Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 수 크기 비교 프로그램
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("세 번째 숫자를 입력하세요: ");
        int num3 = sc.nextInt();

        int max;

        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else {
            if (num2 > num3) {
                max = num2;
            } else {
                max = num3;
            }
        }

        System.out.println("세 수 중 가장 큰 값은: " + max);


        // 계절 판별기
        System.out.print("월을 입력하세요 (1~12): ");
        int month = sc.nextInt();

        String season;

        int weather = (month % 12) / 3;
        switch (weather) {
            case 0:
                season = "겨울";
                break;
            case 1:
                season = "봄";
                break;
            case 2:
                season = "여름";
                break;
            case 3:
                season = "가을";
                break;
            default:
                season = "잘못된 입력입니다. 1~12 사이의 숫자를 입력하세요.";
        }

        System.out.println("입력하신 월에 해당하는 계절은: " + season);

        //계산기 프로그램
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double number1 = sc.nextDouble();

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        double number2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("결과: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("결과: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("결과: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("결과: " + result);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다. +, -, *, / 중 하나를 입력하세요.");
        }
    }
}
