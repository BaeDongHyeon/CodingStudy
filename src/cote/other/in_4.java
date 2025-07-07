package cote.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(br.readLine());
            words[i] = sb.reverse().toString();
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
