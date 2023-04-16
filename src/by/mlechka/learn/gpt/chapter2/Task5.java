package by.mlechka.learn.gpt.chapter2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество чисел n
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        // Проверяем, что n > 0
        if (n <= 0) {
            throw new IllegalArgumentException("Количество чисел должно быть больше нуля");
        }

        // Создаем массив для хранения чисел
        int[] numbers = new int[n];

        // Считываем числа с консоли и сохраняем их в массив
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int evenOnlyCount = 0; // количество чисел, содержащих только четные цифры
        int evenOddCount = 0; // количество чисел с равным числом четных и нечетных цифр


        for (int number : numbers) {
            boolean evenOnly = true; // флаг, показывающий, содержит ли число только четные цифры
            int evenDigitsCount = 0; // количество четных цифр в числе
            int oddDigitsCount = 0; // количество нечетных цифр в числе

            if (number < 0) {
                number = Math.abs(number);
            }

            if (number > 0) {
                // Разбиваем число на цифры и проверяем, являются ли все цифры четными
                while (number > 0) {
                    int digit = number % 10;
                    if (digit % 2 != 0) {
                        evenOnly = false;
                        oddDigitsCount++;
                    } else {
                        evenDigitsCount++;
                    }
                    number /= 10;
                }
            } else {
                evenDigitsCount++;
            }

            // Если число содержит только четные цифры, увеличиваем счетчик evenOnlyCount
            if (evenOnly) {
                evenOnlyCount++;
            }

            // Если число содержит равное количество четных и нечетных цифр, увеличиваем счетчик evenOddCount
            if (evenDigitsCount == oddDigitsCount) {
                evenOddCount++;
            }
        }

        // Выводим результаты на экран
        System.out.println("Количество чисел, содержащих только четные цифры: " + evenOnlyCount);
        System.out.println("Количество чисел с равным числом четных и нечетных цифр: " + evenOddCount);
    }
}