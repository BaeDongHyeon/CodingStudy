package cote;

import java.util.Scanner;

public class RangeSum_11659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.next());
        int sumCount = Integer.parseInt(scanner.next());
        scanner.nextLine();

        String[] numbers = scanner.nextLine().split(" ");

        int[] totals = new int[sumCount];
        for (int index = 0; index < sumCount; index++) {
            int total = 0;
            int i = Integer.parseInt(scanner.next());
            int j = Integer.parseInt(scanner.next());

            for (int k = i-1; k < j; k++) {
                total += Integer.parseInt(numbers[k]);
            }
            totals[index] = total;
        }

        for (int index = 0; index < sumCount; index++) {
            System.out.println(totals[index]);
        }
    }
}
