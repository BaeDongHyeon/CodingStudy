package cote.other.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) count++;
        }

        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
