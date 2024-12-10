package week1.day2;

public class Day2Variable {
    public static void main(String[] args) {

        // 다양한 데이터 타입 사용 예시
        byte number1 = 127;
        short number2 = 32767;
        int number3 = 2147483647;
        long number4 = 9223372036854775807L;
        float number5 = 4.5F;
        double number6 = 5.5;

        System.out.println("byte = " + number1);
        System.out.println("short = " + number2);
        System.out.println("int = " + number3);
        System.out.println("long = " + number4);
        System.out.println("float = " + number5);
        System.out.println("double = " + number6);

        // 문자와 문자열 사용 예시
        char character = 'a';
        String s = "안녕하세요";

        System.out.println("character = " + character);
        System.out.println("string = " + s);

        // 논리형 변수 예시
        boolean flag = true;
        System.out.println("boolean = " + flag);

        // 변수를 선언하고 초기화하는 방법
        int var;
        var = 2;
        System.out.println("var = " + var);
    }
}
