package by.mlechka.array2.repository.impl;

import by.mlechka.array2.model.DataArray;
import by.mlechka.array2.repository.Specification;

import java.util.Arrays;

public class MinElementSpecification implements Specification {

    private int minElement;

    public MinElementSpecification(int minElement) {
        this.minElement = minElement;
    }

    @Override
    public boolean specify(DataArray dataArray) {
        int minInArray = Arrays.stream(dataArray.getNumbers()).min().orElseThrow();
        boolean result = false;
        if (minInArray >= minElement){
            result = true;
        }
        return result;
    }
}
