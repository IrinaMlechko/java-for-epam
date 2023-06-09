package by.mlechka.array2.service.impl;

import by.mlechka.array2.model.DataArray;
import by.mlechka.array2.service.DataArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class DataArrayServiceImpl implements DataArrayService {

    private static final Logger logger = LogManager.getLogger(DataArrayServiceImpl.class);

    @Override
    public int findMinValue(DataArray numbersArray) {
        return Arrays.stream(numbersArray.getNumbers()).min().orElseThrow();
    }

    @Override
    public int findMaxValue(DataArray numbersArray) {
        return Arrays.stream(numbersArray.getNumbers()).max().orElseThrow();
    }

    @Override
    public void replaceValues(DataArray numbersArray, int oldValue, int newValue) {
        int[] numbers = numbersArray.getNumbers();
        int[] newNumbers = Arrays.stream(numbers)
                .map(num -> num == oldValue ? newValue : num)
                .toArray();
        numbersArray.setNumbers(newNumbers);
    }

    @Override
    public double findAverageValue(DataArray numbersArray) {
        return Arrays.stream(numbersArray.getNumbers()).average().orElseThrow();
    }

    @Override
    public int calculateSum(DataArray numbersArray) {
        return Arrays.stream(numbersArray.getNumbers()).sum();
    }

    @Override
    public int countPositiveValues(DataArray numbersArray) {
        return (int) Arrays.stream(numbersArray.getNumbers()).filter(num -> num > 0).count();
    }

    @Override
    public int countNegativeValues(DataArray numbersArray) {
        return (int) Arrays.stream(numbersArray.getNumbers()).filter(num -> num < 0).count();
    }
    @Override
    public void sortArray(DataArray numbersArray) {
        int[] numbers = numbersArray.getNumbers();
        Arrays.stream(numbers)
                .sorted();
    }
}

