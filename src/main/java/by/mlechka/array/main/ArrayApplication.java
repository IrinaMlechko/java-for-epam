package by.mlechka.array.main;

import by.mlechka.array.exception.InvalidDataException;
import by.mlechka.array.model.NumbersArray;
import by.mlechka.array.service.NumbersArrayService;
import by.mlechka.array.service.impl.NumbersArrayServiceImpl;
import by.mlechka.array.validator.FileValidator;

import java.io.FileNotFoundException;

public class ArrayApplication {

    public static void main(String[] args) {
        String fileName = "numbers.txt";
        FileValidator validator = new FileValidator();
        try {
            validator.validateFileStreams(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        } catch (InvalidDataException e) {
            System.out.println("Invalid data in file: " + e.getMessage());
            return;
        }

        try {
            NumbersArrayService service = new NumbersArrayServiceImpl();
            int[] numbers = service.createArrayFromFileStreams(fileName).getNumbers();
            NumbersArray numbersArray = new NumbersArray(numbers);


            System.out.println("Original array: " + numbersArray.toString());

            int minValue = service.findMinValue(numbersArray);
            System.out.println("Minimum value in array: " + minValue);

            int maxValue = service.findMaxValue(numbersArray);
            System.out.println("Maximum value in array: " + maxValue);

            service.replaceValues(numbersArray, minValue, maxValue);
            System.out.println("Array after replacement: " + numbersArray.toString());

            double averageValue = service.findAverageValue(numbersArray);
            System.out.println("Average value in array: " + averageValue);

            int sum = service.calculateSum(numbersArray);
            System.out.println("Sum of values in array: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (InvalidDataException e) {
            System.out.println("Invalid data in file: " + e.getMessage());
        }
    }
}
