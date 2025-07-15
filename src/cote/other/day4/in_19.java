package cote.other.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        int sum = 0;
        int total = 0;
        int cnt = 1;
        for (int i = 0; i < number; i++) {
            int num = Integer.parseInt(numbers[i]);
            if (num == 0) {
                total += sum;
                cnt = 1;
                sum = 0;
            } else {
                sum += cnt++;
            }
        }
        if (sum != 0) {
            total += sum;
        }
        System.out.println(total);
    }
}
