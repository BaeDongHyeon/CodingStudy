package cote.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        for (int i = 0; i < number; i++) {
            String winner = getWinner(Integer.parseInt(A[i]), Integer.parseInt(B[i]));
            System.out.println(winner);
        }
    }

    private static String getWinner(int A, int B) {
        int number = A - B;
        if (number == 1 || number == -2) {
            return "A";
        }
        if (number == -1 || number == 2) {
            return "B";
        }
        return "D";
    }
}
