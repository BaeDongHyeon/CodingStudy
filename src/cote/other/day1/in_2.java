package cote.other.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length(); i++) {
            if (Character.isLowerCase(words.charAt(i))) {
                sb.append(Character.toUpperCase(words.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(words.charAt(i)));
            }
        }

        System.out.println(sb);
    }
}
