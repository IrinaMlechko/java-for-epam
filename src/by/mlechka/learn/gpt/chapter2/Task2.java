package by.mlechka.learn.gpt.chapter2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int n = input.nextInt();

        if (n <= 0) {
            throw new IllegalArgumentException("Количество элементов должно быть больше 0");
        }

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент #" + (i + 1) + ": ");
            arr[i] = input.next();
        }

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        System.out.println("Отсортированный массив:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
