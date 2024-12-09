package week1.day2;

import java.util.Scanner;

public class Day2Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 나이 계산기 (출생연도 입력받아 나이 출력)
        System.out.print("출생 연도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.println("당신의 나이는 " + (2024 - year + 1) + "입니다.");

        // 사각형 넓이 계산기
        System.out.print("사각형의 가로 길이를 입력하세요: ");
        double ver = sc.nextDouble();
        System.out.print("사각형의 세로 길이를 입력하세요: ");
        double hor = sc.nextDouble();
        System.out.println("사각형의 넓이는 " + (ver * hor) + " 입니다.");

        // 두 수를 입력받고 산술연산 결과 출력하기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));



        // 자기소개 입력하고 출력하기
        System.out.println("자기소개를 시작합니다! 정보를 입력해주세요.");
        System.out.print("이름을 입력해주세요: ");
        String name = sc.next();

        System.out.print("나이를 입력해주세요: ");
        int age = sc.nextInt();

        System.out.print("성별을 입력해주세요: ");
        String gender = sc.next();

        System.out.println("자기 소개를 시작합니다.");
        System.out.println("제 이름은 " + name + "이고 " + age + "살 " + gender + "입니다!");

    }
}
