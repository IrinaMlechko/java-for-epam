package by.mlechka.array2.repository.impl;

import by.mlechka.array2.model.DataArray;
import by.mlechka.array2.repository.Specification;

import java.util.Arrays;

public class SumOfElementsSpecification implements Specification {

    private int sum;

    public SumOfElementsSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(DataArray dataArray) {
        boolean result = Arrays.stream(dataArray.getNumbers()).sum() == sum;
        return result;
    }
}
