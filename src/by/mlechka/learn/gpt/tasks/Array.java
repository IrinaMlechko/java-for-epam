package by.mlechka.learn.gpt.tasks;

import java.util.Random;

public class Array {

    private final int[] numbers;

    public Array(int size) {
        Random random = new Random();
        numbers = new int[size];
        for(int number : numbers) {
            number = random.nextInt(21)-10;
        }
    }

    void printArray() {
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    void findMinMax() {

        int min = numbers[0];
        int max = numbers[0];

        for(int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }

    double findAverage() {
        double sum = 0;
        sum = findSum();
        double average = sum / numbers.length;
        System.out.println(average);
        return average;
    }

    int findSum() {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        return sum;
    }

    int[] countPositiveNegativeZero() {
        int[] result = new int[3];
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for(int number : numbers) {
            if (number > 0) {
                posCount++;
            } else if (number < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }

        // Заполнение результата
        result[0] = posCount;
        result[1] = negCount;
        result[2] = zeroCount;

        System.out.println("Number of positive numbers: " + posCount + " Number of negative numbers: " + negCount + " Number of zero numbers: " + zeroCount);
        return result;
    }

}
