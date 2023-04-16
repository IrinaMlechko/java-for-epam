package by.mlechka.learn.gpt.chapter2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = input.nextInt();

        if (n <= 0) {
            throw new IllegalArgumentException("Количество чисел должно быть больше 0");
        }

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число #" + (i + 1) + ": ");
            arr[i] = input.next();
        }

        String shortestNumber = arr[0];
        String longestNumber = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i].length() < shortestNumber.length()) {
                shortestNumber = arr[i];
            }
            if (arr[i].length() > longestNumber.length()) {
                longestNumber = arr[i];
            }
        }

        System.out.println("Самое короткое число: " + shortestNumber + ", длина: " + shortestNumber.length());
        System.out.println("Самое длинное число: " + longestNumber + ", длина: " + longestNumber.length());
    }
}