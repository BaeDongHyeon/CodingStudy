package cote.other.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toLowerCase();

        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.reverse();

        System.out.println(sb.toString().equals(text) ? "YES" : "NO");
    }
}
