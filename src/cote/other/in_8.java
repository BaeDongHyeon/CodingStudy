package cote.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i)) || text.charAt(i) == ' ') {
                sb.append(text.charAt(i));
            }
        }

        StringBuilder reverseText = new StringBuilder();
        reverseText.append(sb);
        reverseText.reverse();

        System.out.println((sb.compareTo(reverseText) == 0) ? "YES" : "NO");
    }
}
