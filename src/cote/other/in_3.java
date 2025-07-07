package cote.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] text = br.readLine().split(" ");

        int index = 0;
        int max = 0;
        for (int i = 0; i < text.length; i++) {
            if (max < text[i].length()) {
                max = text[i].length();
                index = i;
            }
        }

        System.out.println(text[index]);
    }
}
