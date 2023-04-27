package by.mlechka.array.service.impl;

import by.mlechka.array.exception.InvalidDataException;
import by.mlechka.array.service.NumbersArrayService;
import by.mlechka.array.model.NumbersArray;

import by.mlechka.array.validator.FileValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class NumbersArrayServiceImpl implements NumbersArrayService {

    private static final Logger logger = LogManager.getLogger(NumbersArrayServiceImpl.class);

    @Override
    public int findMinValue(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        logger.info("Minimum value in array: {}", minValue);
        return minValue;
    }

    @Override
    public int findMaxValue(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        logger.info("Maximum value in array: {}", maxValue);
        return maxValue;
    }

    @Override
    public void replaceValues(NumbersArray numbersArray, int oldValue, int newValue) {
        int[] numbers = numbersArray.getNumbers();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == oldValue) {
                numbers[i] = newValue;
            }
        }
        logger.info("Array after replacement: {}", numbersArray);
    }

    @Override
    public double findAverageValue(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        logger.info("Average value in array: {}", average);
        return average;
    }

    @Override
    public int calculateSum(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        logger.info("Sum of values in array: {}", sum);
        return sum;
    }

    @Override
    public int countPositiveValues(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        int count = 0;
        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }
        logger.info("Number of positive values in array: {}", count);
        return count;
    }

    @Override
    public int countNegativeValues(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        int count = 0;
        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }
        logger.info("Number of negative values in array: {}", count);
        return count;
    }

    @Override
    public void bubbleSort(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        logger.info("Array after bubble sort: {}", numbersArray);
    }

    @Override
    public void selectionSort(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        logger.info("Array after selection sort: {}", numbersArray);
    }

    @Override
    public void insertionSort(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        int n = numbers.length;
        for (int i = 1; i < n; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
        logger.info("Array after insertion sort: {}", numbersArray);
    }
    @Override
    public NumbersArray createArrayFromFile(String fileName) throws InvalidDataException, FileNotFoundException {
        FileValidator.validateFile(fileName);
        int[] numbers = readNumbersFromFile(fileName);
        return new NumbersArray(numbers);
    }
    @Override
    public int[] readNumbersFromFile(String fileName) throws FileNotFoundException, InvalidDataException {
        Scanner scanner = new Scanner(new File(fileName));
        String line = scanner.nextLine();
        String[] numberStrings = line.split(" ");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            } catch (NumberFormatException e) {
                throw new InvalidDataException("Invalid number format: " + numberStrings[i]);
            }
        }
        scanner.close();
        return numbers;
    }

    @Override
    public int findMinValueStreams(NumbersArray numbersArray) {
        return Arrays.stream(numbersArray.getNumbers()).min().orElseThrow();
    }

    @Override
    public int findMaxValueStreams(NumbersArray numbersArray) {
        return Arrays.stream(numbersArray.getNumbers()).max().orElseThrow();
    }

    @Override
    public void replaceValuesStreams(NumbersArray numbersArray, int oldValue, int newValue) {
        int[] numbers = numbersArray.getNumbers();
        int[] newNumbers = Arrays.stream(numbers)
                .map(num -> num == oldValue ? newValue : num)
                .toArray();
        numbersArray.setNumbers(newNumbers);
    }

    @Override
    public double findAverageValueStreams(NumbersArray numbersArray) {
        return Arrays.stream(numbersArray.getNumbers()).average().orElseThrow();
    }

    @Override
    public int calculateSumStreams(NumbersArray numbersArray) {
        return Arrays.stream(numbersArray.getNumbers()).sum();
    }

    @Override
    public int countPositiveValuesStreams(NumbersArray numbersArray) {
        return (int) Arrays.stream(numbersArray.getNumbers()).filter(num -> num > 0).count();
    }

    @Override
    public int countNegativeValuesStreams(NumbersArray numbersArray) {
        return (int) Arrays.stream(numbersArray.getNumbers()).filter(num -> num < 0).count();
    }
    @Override
    public void sortArrayStreams(NumbersArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        Arrays.stream(numbers)
                .sorted();
    }
    @Override
    public NumbersArray createArrayFromFileStreams(String fileName) throws InvalidDataException, FileNotFoundException {
        FileValidator fileValidator = new FileValidator();
        fileValidator.validateFileStreams(fileName);
        int[] numbers = Arrays.stream(readLineFromFileStreams(fileName).split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();
        return new NumbersArray(numbers);
    }
    @Override
    public String readLineFromFileStreams(String fileName) throws FileNotFoundException {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            return stream.findFirst().orElseThrow(FileNotFoundException::new);
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
    }

    private void validateNumbersStreams(int[] numbers) throws InvalidDataException {
        boolean invalidNumberExists = Arrays.stream(numbers).anyMatch(number -> number < 1 || number > 10);
        if (invalidNumberExists) {
            throw new InvalidDataException("Invalid number found");
        }
    }
}

