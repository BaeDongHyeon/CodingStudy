package cote.other.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(br.readLine());
        String text = br.readLine();

        for (int i = 0; i < number * 7; i+=7) {
            System.out.print(Character.toChars(numberConvert(text.substring(i, i+7))));
        }
    }
    private static int numberConvert(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '#') {
                result.append("1");
            } else {
                result.append("0");
            }
        }
        return Integer.parseInt(result.toString(), 2);
    }
}
