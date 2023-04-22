package by.mlechka.chapter2;

import java.util.Scanner;
/**
 * Chapter2, Task 3
 */
public class NumbersLongerAndShorterThanAverageLength {
    public static void main(String[] args) {

        PrintCredentials.printInformation();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            throw new IllegalArgumentException("Количество чисел должно быть больше 0!");
        }

        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            numbers[i] = scanner.nextInt();
            sum += String.valueOf(numbers[i]).length();
        }

        double averageLength = (double) sum / n;

        System.out.println("Средняя длина чисел: " + averageLength);

        for (int i = 0; i < n; i++) {
            int numberLength = String.valueOf(numbers[i]).length();
            if (numberLength > averageLength) {
                System.out.println("Число " + numbers[i] + " имеет длину " + numberLength);
            }
        }
    }
}






