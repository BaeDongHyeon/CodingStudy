package cote.other.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(row[j]);
            }
        }

        int maxSum = 0;

        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += grid[i][j];
                colSum += grid[j][i];
            }
            maxSum = Math.max(maxSum, Math.max(rowSum, colSum));
        }

        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < N; i++) {
            diagonal1 += grid[i][i];
            diagonal2 += grid[i][N - 1 - i];
        }

        maxSum = Math.max(maxSum, Math.max(diagonal1, diagonal2));

        System.out.println(maxSum);
    }
}
