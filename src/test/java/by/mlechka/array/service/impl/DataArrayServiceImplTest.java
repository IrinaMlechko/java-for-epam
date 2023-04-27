package by.mlechka.array.service.impl;

import by.mlechka.array.exception.InvalidDataException;
import by.mlechka.array.model.NumbersArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class DataArrayServiceImplTest {

    private NumbersArrayServiceImpl numbersArrayService;

    @BeforeEach
    void setUp() {
        numbersArrayService = new NumbersArrayServiceImpl();
    }

    @Test
    void testFindMinValue() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, -4, 5, 6});
        int actualResult = numbersArrayService.findMinValue(numbersArray);
        Assertions.assertEquals(-4, actualResult);
    }

    @Test
    void testFindMaxValue() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, -4, 5, 6});
        int actualResult = numbersArrayService.findMaxValue(numbersArray);
        Assertions.assertEquals(6, actualResult);
    }

    @Test
    void testReplaceValuesIf() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, 4, 5, 6});
        int oldValue = 4;
        int newValue = 0;
        numbersArrayService.replaceValues(numbersArray, oldValue, newValue);
        int[] expectedArray = new int[]{1, 2, 3, 0, 5, 6};
        Assertions.assertArrayEquals(expectedArray, numbersArray.getNumbers());
    }

    @Test
    void testFindAverageValue() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, 4, 5, 6});
        double actualResult = numbersArrayService.findAverageValue(numbersArray);
        Assertions.assertEquals(3.5, actualResult);
    }

    @Test
    void testCalculateSum() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, 4, 5, 6});
        int actualResult = numbersArrayService.calculateSum(numbersArray);
        Assertions.assertEquals(21, actualResult);
    }

    @Test
    void testCountPositiveValues() {
        NumbersArray numbersArray = new NumbersArray(new int[]{-1, 2, -3, 4, -5, 6});
        int actualResult = numbersArrayService.countPositiveValues(numbersArray);
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    void testCountNegativeValues() {
        NumbersArray numbersArray = new NumbersArray(new int[]{-1, 2, -3, 4, -5, 6});
        int actualResult = numbersArrayService.countNegativeValues(numbersArray);
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    void testBubbleSort() {
        NumbersArray numbersArray = new NumbersArray(new int[]{5, 2, 8, 1, 4});
        numbersArrayService.bubbleSort(numbersArray);
        int[] expectedArray = new int[]{1, 2, 4, 5, 8};
        Assertions.assertArrayEquals(expectedArray, numbersArray.getNumbers());
    }

    @Test
    void testInsertionSort() {
        NumbersArray numbersArray = new NumbersArray(new int[]{5, 2, 6, 1, 3, 4});
        numbersArrayService.insertionSort(numbersArray);
        int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expectedArray, numbersArray.getNumbers());
    }

    @Test
    void testSelectionSort() {
        NumbersArray numbersArray = new NumbersArray(new int[]{5, 2, 8, 1, 4});
        numbersArrayService.selectionSort(numbersArray);
        int[] expectedArray = new int[]{1, 2, 4, 5, 8};
        Assertions.assertArrayEquals(expectedArray, numbersArray.getNumbers());
    }

        @Test
        public void testCreateArrayFromFile() throws InvalidDataException, FileNotFoundException {
            NumbersArrayServiceImpl service = new NumbersArrayServiceImpl();
            NumbersArray array = service.createArrayFromFile("src/main/resources/data.txt");
            Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array.getNumbers());
        }

        @Test
        public void testCreateArrayFromFileWithInvalidData() throws FileNotFoundException {
            NumbersArrayServiceImpl service = new NumbersArrayServiceImpl();
            Assertions.assertThrows(InvalidDataException.class, () -> service.createArrayFromFile("src/main/resources/invalid_data.txt"));
        }

    @Test
    void testFindMinValueStreams() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, -4, 5, 6});
        int actualResult = numbersArrayService.findMinValueStreams(numbersArray);
        Assertions.assertEquals(-4, actualResult);
    }

    @Test
    void testFindMaxValueStreams() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, -4, 5, 6});
        int actualResult = numbersArrayService.findMaxValueStreams(numbersArray);
        Assertions.assertEquals(6, actualResult);
    }

    @Test
    void testReplaceValuesStreams() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, 4, 5, 6});
        int oldValue = 4;
        int newValue = 0;
        numbersArrayService.replaceValuesStreams(numbersArray, oldValue, newValue);
        int[] expectedArray = new int[]{1, 2, 3, 0, 5, 6};
        Assertions.assertArrayEquals(expectedArray, numbersArray.getNumbers());
    }

    @Test
    void testFindAverageValueStreams() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, 4, 5, 6});
        double actualResult = numbersArrayService.findAverageValueStreams(numbersArray);
        Assertions.assertEquals(3.5, actualResult);
    }

    @Test
    void testCalculateSumStreams() {
        NumbersArray numbersArray = new NumbersArray(new int[]{1, 2, 3, 4, 5, 6});
        int actualResult = numbersArrayService.calculateSumStreams(numbersArray);
        Assertions.assertEquals(21, actualResult);
    }

    @Test
    void testCountPositiveValuesStreams() {
        NumbersArray numbersArray = new NumbersArray(new int[]{-1, 2, -3, 4, -5, 6});
        int actualResult = numbersArrayService.countPositiveValuesStreams(numbersArray);
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    void testCountNegativeValuesStreams() {
        NumbersArray numbersArray = new NumbersArray(new int[]{-1, 2, -3, 4, -5, 6});
        int actualResult = numbersArrayService.countNegativeValuesStreams(numbersArray);
        Assertions.assertEquals(3, actualResult);
    }
}

