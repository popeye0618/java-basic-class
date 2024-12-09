package week4.day8;

public class Day8Practice {
    public static void main(String[] args) {

        // 학생별 총점과 평균 계산 후 출력 -> 입력받는 방식으로 바꿔보자.
        int[][] studentScores = {
                {85, 90, 92},
                {78, 88, 80},
                {90, 94, 99}
        };

        for (int i = 0; i < studentScores.length; i++) {
            int total = 0;
            for (int score : studentScores[i]) {
                total += score;
            }
            double average = (double) total / studentScores[i].length;
            System.out.println("학생 " + (i + 1) + " 총점: " + total + ", 평균: " + average);
        }

        // 각 학생의 최고점과 최저점 찾기
        for (int i = 0; i < studentScores.length; i++) {
            int max = studentScores[i][0];
            int min = studentScores[i][0];
            for (int score : studentScores[i]) {
                if (score > max) max = score;
                if (score < min) min = score;
            }
            System.out.println("학생 " + (i + 1) + " 최고점: " + max + ", 최저점: " + min);
        }
    }
}
