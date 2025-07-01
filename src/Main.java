import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 숫자 개수
        Scanner numberCountInput = new Scanner(System.in);
        int numberCount = numberCountInput.nextInt();

        // 숫자 리스트
        Scanner numbersInput = new Scanner(System.in);
        String line = numbersInput.nextLine();
        String[] numbers = line.split("");

        // 합산
        int sum = 0;
        for (int i = 0; i < numberCount; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println(sum);
    }
}