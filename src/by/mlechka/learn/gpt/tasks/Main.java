package by.mlechka.learn.gpt.tasks;

import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int arraySize = random.nextInt(10) + 1;

        Array array = new Array(arraySize);
        array.printArray();
        array.findMinMax();
        array.findAverage();
        array.findSum();
        array.countPositiveNegativeZero();


    }
}
