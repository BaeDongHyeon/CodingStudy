package cote.other.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toLowerCase();

        StringBuilder number = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                number.append(text.charAt(i));
            }
        }

        System.out.println(Integer.parseInt(number.toString()));
    }
}
