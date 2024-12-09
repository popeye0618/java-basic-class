package week2.day3;

import java.util.Scanner;

public class Day3Operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        // 산술 연산
        System.out.println("덧셈: " + (num1 + num2));
        System.out.println("뺄셈: " + (num1 - num2));
        System.out.println("곱셈: " + (num1 * num2));
        System.out.println("나눗셈: " + (num1 / num2));
        System.out.println("나머지: " + (num1 % num2));

        // 비교 연산
        System.out.println("두 값이 같은가요? " + (num1 == num2));
        System.out.println("두 값이 다른가요? " + (num1 != num2));
        System.out.println("첫 번째 값이 두 번째 값보다 큰가요? " + (num1 > num2));
        System.out.println("첫 번째 값이 두 번째 값보다 작은가요? " + (num1 < num2));
        System.out.println("첫 번째 값이 두 번째 값보다 크거나 같은가요? " + (num1 >= num2));
        System.out.println("첫 번째 값이 두 번째 값보다 작거나 같은가요? " + (num1 <= num2));

        // 논리 연산
        System.out.println("첫 번째 값이 10보다 크고 두 번째 값이 20보다 작은가요? " + (num1 > 10 && num2 < 20));
        System.out.println("첫 번째 값이 10보다 크거나 두 번째 값이 20보다 작은가요? " + (num1 > 10 || num2 < 20));
        System.out.println("첫 번째 값이 10보다 크지 않나요? " + !(num1 > 10));


        // 대입 연산자
        System.out.print("초기 숫자를 입력하세요: ");
        int num = sc.nextInt();

        num += 5; // num = num + 5
        System.out.println("num += 5 -> " + num);

        num -= 3; // num = num - 3
        System.out.println("num -= 3 -> " + num);

        num *= 2; // num = num * 2
        System.out.println("num *= 2 -> " + num);

        num /= 4; // num = num / 4
        System.out.println("num /= 4 -> " + num);

        num %= 3; // num = num % 3
        System.out.println("num %= 3 -> " + num);

        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();

        // 증감 연산
        System.out.println("n++ (후위 증가): " + n++);
        System.out.println("n (증가 후): " + n);
        System.out.println("++n (선위 증가): " + ++n);
        System.out.println("n-- (후위 감소): " + n--);
        System.out.println("n (감소 후): " + n);
        System.out.println("--n (선위 감소): " + --n);

        // 연산자 우선순위
        int a = 5, b = 10, c = 20;

        // 우선순위에 따른 결과
        int result1 = a + b * c;  // 곱셈 먼저 계산
        System.out.println("a + b * c = " + result1); // 5 + (10 * 20) = 205

        // 괄호로 우선순위 변경
        int result2 = (a + b) * c; // 덧셈 먼저 계산
        System.out.println("(a + b) * c = " + result2); // (5 + 10) * 20 = 300

        // 여러 연산자 혼합
        boolean result3 = a < b && b < c;
        System.out.println("a < b && b < c = " + result3); // true && true = true

        // 우선순위와 논리 연산
        boolean result4 = a < b || b > c && a > c;
        System.out.println("a < b || b > c && a > c = " + result4); // true || (false && false) = true
    }
}
