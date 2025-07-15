package cote.other.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        for (int i = 0; i < number; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(numbers[i]);
            int reverseNumber = Integer.parseInt(sb.reverse().toString());
            if (isPrime(reverseNumber)) System.out.print(reverseNumber + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
