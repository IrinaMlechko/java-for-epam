package by.mlechka.array2.repository.impl;

import by.mlechka.array2.model.DataArray;
import by.mlechka.array2.repository.Specification;

import java.util.UUID;

public class IdSpecification implements Specification {

    private UUID id;

    public IdSpecification(UUID id) {
        this.id = id;
    }

    @Override
    public boolean specify(DataArray dataArray) {
        boolean result = dataArray.getId().equals(id);
        return result;
    }
}
