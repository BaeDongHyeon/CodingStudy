package cote.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toLowerCase();

        int count = text.length();
        StringBuilder sb = new StringBuilder();

        while (count > 0) {
            String word = String.valueOf(text.charAt(0));
            sb.append(word);
            text = text.replace(word, "");
            count = text.length();
        }
        System.out.println(sb);
    }
}
