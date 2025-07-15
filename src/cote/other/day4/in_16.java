package cote.other.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(br.readLine());
        fibo(number);
    }
    public static void fibo(int n) {
        int a = 1, b = 1;

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
