package by.mlechka.array.service;

import by.mlechka.array.model.NumbersArray;

import java.util.function.IntPredicate;

/**
 * A service interface for performing operations on an array of numbers.
 */
public interface NumbersArrayService {

    /**
     * Finds the minimum value in the given array.
     *
     * @param numbers the array of numbers to search
     * @return the minimum value in the array
     */
    int findMinValue(NumbersArray numbers);

    /**
     * Finds the maximum value in the given array.
     *
     * @param numbers the array of numbers to search
     * @return the maximum value in the array
     */
    int findMaxValue(NumbersArray numbers);

    /**
     * Replaces all elements in the given array that satisfy the given condition with the specified value.
     *
     * @param numbers    the array of numbers to update
     * @param oldValue  the value to be replaced
     * @param newValue the value with which to replace the matching elements
     */
    void replaceValuesIf(NumbersArray numbers, int oldValue, int newValue);

    /**
     * Calculates the average value of the elements in the given array.
     *
     * @param numbers the array of numbers to calculate the average of
     * @return the average value of the elements in the array
     */
    double findAverageValue(NumbersArray numbers);

    /**
     * Calculates the sum of the elements in the given array.
     *
     * @param numbers the array of numbers to sum
     * @return the sum of the elements in the array
     */
    int calculateSum(NumbersArray numbers);

    /**
     * Calculates the number of positive elements in the given array.
     *
     * @param numbers the array of numbers to search
     * @return the number of positive elements in the array
     */
    int countPositiveValues(NumbersArray numbers);

    /**
     * Calculates the number of negative elements in the given array.
     *
     * @param numbers the array of numbers to search
     * @return the number of negative elements in the array
     */
    int countNegativeValues(NumbersArray numbers);

    /**
     * Sorts the given array of numbers using the bubble sort algorithm.
     *
     * @param numbersArray the array of numbers to be sorted
     */
    void bubbleSort(NumbersArray numbersArray);
    /**
     * Sorts the given array of numbers using the selection sort algorithm.
     *
     * @param numbersArray the array of numbers to be sorted
     */
    void selectionSort(NumbersArray numbersArray);
    /**
     * Sorts the given array of numbers using the insertion sort algorithm.
     *
     * @param numbersArray the array of numbers to be sorted
     */

    void insertionSort(NumbersArray numbersArray);

    int findMinValueStreams(NumbersArray numbersArray);

    int findMaxValueStreams(NumbersArray numbersArray);

    void replaceValuesIfStreams(NumbersArray numbersArray, int oldValue, int newValue);

    double findAverageValueStreams(NumbersArray numbersArray);

    int calculateSumStreams(NumbersArray numbersArray);

    int countPositiveValuesStreams(NumbersArray numbersArray);

    int countNegativeValuesStreams(NumbersArray numbersArray);
}
