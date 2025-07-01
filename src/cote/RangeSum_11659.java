package cote;

import java.util.Scanner;

public class RangeSum_11659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = scanner.nextInt();
        int sumCount = scanner.nextInt();

        // 숫자들 저장
        int[] numbers = new int[numberCount + 1];
        for (int i = 1; i <= numberCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 더한 수 배열
        int[] sum = new int[numberCount + 1];
        for (int i = 1; i <= numberCount; i++) {
            sum[i] = sum[i - 1] + numbers[i];
        }

        // 구간별 계산
        int[] total = new int[numberCount + 1];
        for (int t = 0; t < sumCount; t++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            total[t] = sum[j] - sum[i - 1];
        }

        for (int i = 0; i < sumCount; i++) {
            System.out.println(total[i]);
        }
    }
}
