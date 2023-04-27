package by.mlechka.array2.service;

import by.mlechka.array2.model.DataArray;

/**
 * A service interface for performing operations on an array of numbers.
 */
public interface DataArrayService {


    /**
     * Finds the minimum value in the given array using streams.
     *
     * @param dataArray the array of numbers to search
     * @return the minimum value in the array
     */
    int findMinValue(DataArray dataArray);

    /**
     * Finds the maximum value in the given array using streams.
     *
     * @param dataArray the array of numbers to search
     * @return the maximum value in the array
     */
    int findMaxValue(DataArray dataArray);

    /**
     * Replaces all elements with old value in the given array  with the specified value using streams.
     *
     * @param dataArray the array of numbers to update
     * @param oldValue     the value to be replaced
     * @param newValue     the value with which to replace the matching elements
     */
    void replaceValues(DataArray dataArray, int oldValue, int newValue);

    /**
     * Calculates the average value of the elements in the given array using streams.
     *
     * @param dataArray the array of numbers to calculate the average of
     * @return the average value of the elements in the array
     */
    double findAverageValue(DataArray dataArray);

    /**
     * Calculates the sum of the elements in the given array.
     *
     * @param dataArray the array of numbers to sum
     * @return the sum of the elements in the array
     */
    int calculateSum(DataArray dataArray);

    /**
     * Calculates the number of positive elements in the given array using streams.
     *
     * @param dataArray the array of numbers to search
     * @return the number of positive elements in the array
     */
    int countPositiveValues(DataArray dataArray);

    /**
     * Calculates the number of negative elements in the given array using streams.
     *
     * @param dataArray the array of numbers to search
     * @return the number of negative elements in the array
     */
    int countNegativeValues(DataArray dataArray);
    /**
     * Sorts elements in the given array using streams.
     *
     * @param dataArray the array of numbers to search
     * @return the number of negative elements in the array
     */
    void sortArray(DataArray dataArray);
    
}
