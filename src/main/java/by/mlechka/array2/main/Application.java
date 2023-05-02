package by.mlechka.array2.main;

import by.mlechka.array2.model.DataArray;
import by.mlechka.array2.model.Warehouse;
import by.mlechka.array2.observer.impl.ArrayObserver;
import by.mlechka.array2.repository.Repository;

public class Application {
    public static void main(String[] args) {
        DataArray firstArray = new DataArray();
        DataArray secondArray = new DataArray(new int[]{0, -10, 5, -100, 80, 4, 5, 98});
        Repository arrayRepository = new Repository();
        arrayRepository.add(firstArray);
        arrayRepository.add(secondArray);

        ArrayObserver observer = new ArrayObserver();

        //TODO: how to create observer? how to attach it?
        //TODO: when implemented, add tests
        for (DataArray array : arrayRepository.getDataArrays()) {
            array.attach(observer);
        }
        Warehouse warehouse = new Warehouse();
        firstArray.setNumbers(new int[]{1, 5, 9, -1, 8, 0});
//        System.out.println(warehouse);
    }
}
