package cote.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class in_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] text = br.readLine().split(" ");
        int[] distanceA = new int[text[0].length()];
        int[] distanceB = new int[text[0].length()];

        StringBuilder sb = new StringBuilder();
        sb.append(text[0]);
        for (int i = 0; i < text[0].length(); i++) {
            distanceA[i] = Math.abs(i - sb.indexOf(text[1], i));
        }
        sb.reverse();
        for (int i = 0; i < text[0].length(); i++) {
            distanceB[text[0].length()-1-i] = Math.abs(i - sb.indexOf(text[1], i));
        }

        for (int i = 0; i < text[0].length(); i++) {
            if (distanceA[i] >= distanceB[i]) {
                System.out.print(distanceB[i] + " ");
            } else {
                System.out.print(distanceA[i] + " ");
            }
        }
    }
}
