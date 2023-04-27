package by.mlechka.array2.observer.impl;

import by.mlechka.array2.model.ArrayStatistics;
import by.mlechka.array2.model.DataArray;
import by.mlechka.array2.model.Warehouse;
import by.mlechka.array2.observer.ArrayEvent;
import by.mlechka.array2.observer.Observer;
import by.mlechka.array2.service.DataArrayService;
import by.mlechka.array2.service.impl.DataArrayServiceImpl;

import java.util.UUID;

public class ArrayObserver implements Observer {

    private static final DataArrayService dataArrayService = new DataArrayServiceImpl();

    @Override
    public void parameterChanged (ArrayEvent arrayEvent){
        DataArray array = arrayEvent.getSource();

        Integer min = dataArrayService.findMinValue(array);
        Integer max = dataArrayService.findMaxValue(array);
        Integer sum = dataArrayService.calculateSum(array);
        Double average = dataArrayService.findAverageValue(array);
        ArrayStatistics statistics = new ArrayStatistics(min, max, sum, average);

        UUID id = array.getId();

        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, statistics);
    }
}
