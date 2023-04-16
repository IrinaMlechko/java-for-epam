package by.mlechka.learn.gpt.chapter2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            throw new IllegalArgumentException("Количество чисел должно быть больше 0");
        }

        int minDiffDigitsNumber = 0;
        int minDiffDigits = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число #" + (i + 1) + ": ");
            int number = scanner.nextInt();
            int diffDigits = countDiffDigits(Math.abs(number));

            if (diffDigits < minDiffDigits) {
                minDiffDigits = diffDigits;
                minDiffDigitsNumber = number;
            }
        }

        System.out.println("Число с минимальным количеством различных цифр: " + minDiffDigitsNumber);
    }

    private static int countDiffDigits(int number) {
        boolean[] digits = new boolean[10];
        int count = 0;
        if(number==0){
            return 1;
        }
        while (number > 0) {
            int digit = number % 10;

            if (!digits[digit]) {
                digits[digit] = true;
                count++;
            }

            number /= 10;
        }
        System.out.println(count);
        return count;
    }
}