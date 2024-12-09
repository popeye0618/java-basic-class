package week4.day8;

import java.util.Arrays;

public class Day8DeepeningArray {
    public static void main(String[] args) {

        // 배열 응용 (조건 검색)
        int[] scores = {45, 67, 89, 72, 50};
        System.out.print("50점 이상인 점수: ");
        for (int score : scores) {
            if (score >= 50) {
                System.out.print(score + " ");
            }
        }

        System.out.println();

        // 배열 정렬
        Arrays.sort(scores);
        System.out.println("정렬된 점수: " + Arrays.toString(scores));

        // 다차원 배열
        int[][] studentScores = {
                {85, 90, 92}, // 학생 1
                {78, 88, 80}, // 학생 2
                {90, 94, 99}  // 학생 3
        };

        // 학생 점수 출력
        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("학생 " + (i + 1) + " 점수: ");
            for (int score : studentScores[i]) {
                System.out.print(score + " ");
            }
            System.out.println();
        }
    }
}
