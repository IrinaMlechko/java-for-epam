package by.mlechka.array2.model;

public class ArrayStatistics {

    Integer min;
    Integer max;
    Integer sum;
    Double average;

    public ArrayStatistics(){}

    public ArrayStatistics (Integer min, Integer max, Integer sum, Double average){
        this.min = min;
        this.max = max;
        this.sum = sum;
        this.average = average;
    }
}
