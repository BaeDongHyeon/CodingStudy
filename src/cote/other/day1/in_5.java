package cote.other.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        StringBuilder sb = new StringBuilder();

        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (isAlphabet(c)) {
                chars[i] = ' ';
                sb.append(c);
            }
        }
        sb.reverse();
        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                result.append(sb.charAt(index++));
            } else {
                result.append(chars[i]);
            }
        }

        System.out.println(result);
    }
    private static boolean isAlphabet(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;
    }
}
