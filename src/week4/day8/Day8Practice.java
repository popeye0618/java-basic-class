package week4.day8;

import java.util.Scanner;

public class Day8Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 학생별 총점과 평균 계산 후 출력 -> 입력받는 방식으로 바꿔보자.
        int[][] studentScores = {
                {85, 90, 92},
                {78, 88, 80},
                {90, 94, 99}
        };

        // 학생 점수 입력받는 방식으로 변경
        int[][] scores = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String subject = "";
                switch (j){
                    case 0:
                        subject = "국어";
                        break;
                    case 1:
                        subject = "수학";
                        break;
                    case 2:
                        subject = "영어";
                        break;
                }

                System.out.print("학생 " + (i + 1) + "의 " + subject + "점수를 입력하세요: ");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int score : scores[i]) {
                total += score;
            }
            double average = (double) total / scores[i].length;
            System.out.println("학생 " + (i + 1) + " 총점: " + total + ", 평균: " + average);
        }

        // 각 학생의 최고점과 최저점 찾기
        for (int i = 0; i < scores.length; i++) {
            int max = scores[i][0];
            int min = scores[i][0];
            for (int score : scores[i]) {
                if (score > max) max = score;
                if (score < min) min = score;
            }
            System.out.println("학생 " + (i + 1) + " 최고점: " + max + ", 최저점: " + min);
        }
    }
}
