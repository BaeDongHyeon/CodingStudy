package cote.other.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) + 2;

        int[][] grid = new int[n][n];
        for (int i = 1; i < n - 1; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 1; j < n - 1; j++) {
                grid[i][j] = Integer.parseInt(line[j - 1]);
            }
        }

        int cnt = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int target = grid[i][j];
                if (target > grid[i - 1][j] && target > grid[i + 1][j] && target > grid[i][j - 1] && target > grid[i][j + 1]) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
