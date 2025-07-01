package cote;

import java.util.Scanner;

public class Average_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력할 개수
        int count = Integer.parseInt(scanner.next());
        scanner.nextLine();
        // 입력할 숫자
        String[] numbers = scanner.nextLine().split(" ");

        // 최대값
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (max < Integer.parseInt(numbers[i])) max = Integer.parseInt(numbers[i]);
        }

        // 반복
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += avg(numbers[i], max);
        }

        System.out.println(total / count);
    }

    private static double avg(String number, int maxNumber) {
        double num = Double.parseDouble(number);

        return (num / maxNumber * 100);
    }
}
