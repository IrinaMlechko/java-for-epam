package by.mlechka.array2.model;

import by.mlechka.array2.observer.ArrayEvent;
import by.mlechka.array2.observer.Observable;
import by.mlechka.array2.observer.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class DataArray implements Observable {

    private UUID id;
    private int[] numbers;
    private List<Observer> observers;

    public DataArray() {
        observers = new ArrayList<>();
    }

    public DataArray(int[] numbers) {
        this.id = UUID.randomUUID();
        this.numbers = numbers;
        observers = new ArrayList<>();
    }

    public DataArray(UUID id, int[] numbers) {
        this.id = id;
        this.numbers = numbers;
        observers = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
        notifyObserver();
    }

    @Override
    public String toString() {
        return "DataArray{" +
                "id=" + id +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataArray dataArray = (DataArray) o;
        return Arrays.equals(numbers, dataArray.numbers) && id.equals(dataArray.id);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + Arrays.hashCode(numbers);
        return result;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        ArrayEvent event = new ArrayEvent(this);

        for (Observer observer : observers) {
            observer.parameterChanged(event);
        }
    }
}
