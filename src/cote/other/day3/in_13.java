package cote.other.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class in_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(br.readLine());
        String[] text = br.readLine().split(" ");

        Queue<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < number; i++) {
            numbers.add(Integer.parseInt(text[i]));
            if (i == 0) {
                System.out.print(numbers.peek() + " ");
            } else {
                if (numbers.poll() < numbers.peek()) {
                    System.out.print(numbers.peek() + " ");
                }
            }
        }
    }
}
