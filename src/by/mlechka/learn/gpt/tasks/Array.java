package by.mlechka.learn.gpt.tasks;

import java.util.Random;

public class Array {

    private static final int SIZE_OF_ARRAY = 10;

    private int[] numbers;

    public Array(int size) {
        Random random = new Random();
        numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(10);
        }
    }

    int[] getArray() {
        return numbers;
    }

    void printArray() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    void findMinMax() {

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }

    double findAverage() {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println(average);
        return average;
    }

    int findSum() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        return sum;
    }

    int[] countPositiveNegativeZero() {
        int[] result = new int[3];
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                posCount++;
            } else if (numbers[i] < 0) {
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
