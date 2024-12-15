package week3.day5;

public class Day5Loop {
    public static void main(String[] args) {

        // for 반복문
        System.out.println("for 반복문 예제:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("i = " + i);
        }

        // while 반복문
        System.out.println("\nwhile 반복문 예제:");

        int count = 1;
        while (count <= 5) {
            System.out.println("count = " + count);
            count++;
        }

        int countt = 5;
        while (countt >= 1) {
            System.out.println("countt = " + countt);
            countt--;
        }

        // do-while 반복문
        System.out.println("\ndo-while 반복문 예제:");

        int number = 1;
        do {
            System.out.println("number = " + number);
            number++;
        } while (number <= 5);
    }
}
