package cote.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String[] students = br.readLine().split(" ");

        int max = 0;
        int count = 0;
        for (int i = 0; i < number; i++) {
            int student = Integer.parseInt(students[i]);
            if (max < student) {
                max = student;
                count++;
            }
        }
        System.out.println(count);
    }
}
