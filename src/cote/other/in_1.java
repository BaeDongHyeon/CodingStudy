package cote.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine().toLowerCase();

        String word = br.readLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == word.charAt(0)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
