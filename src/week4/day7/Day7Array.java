package week4.day7;

public class Day7Array {
    public static void main(String[] args) {

        // 정수 배열 선언과 초기화
        int[] ints = {85, 90, 78, 92, 88};

        System.out.println("ints[0] : " + ints[0]);
        System.out.println("ints[1] : " + ints[1]);
        System.out.println("ints[2] : " + ints[2]);
        System.out.println("ints[3] : " + ints[3]);
        System.out.println("ints[4] : " + ints[4]);
        System.out.println("배열의 크기는 : " + ints.length);

        // 배열 값 출력
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + ints[i]);
        }

        // 문자 배열
        char[] chars = {'c', 'h', 'a', 'r'};
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + chars[i]);
        }

        // 문자열 배열
        String[] strings = {"Hello", "World", "!!"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        // 향상된 for 문
        for (String s : strings) {
            System.out.println(s);
        }

    }
}
