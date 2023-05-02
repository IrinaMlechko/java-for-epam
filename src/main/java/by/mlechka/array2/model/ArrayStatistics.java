package by.mlechka.array2.model;

public class ArrayStatistics {

    Integer min;
    Integer max;
    Integer sum;
    Double average;
    Integer amountOfPositiveElements;
    Integer amountOfNegativeElements;

    public ArrayStatistics(){}

    public ArrayStatistics (Integer min, Integer max, Integer sum, Double average,Integer amountOfPositiveElements, Integer amountOfNegativeElements){
        this.min = min;
        this.max = max;
        this.sum = sum;
        this.average = average;
        this.amountOfPositiveElements = amountOfPositiveElements;
        this.amountOfNegativeElements = amountOfNegativeElements;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayStatistics{");
        sb.append("min=").append(min);
        sb.append(", max=").append(max);
        sb.append(", sum=").append(sum);
        sb.append(", average=").append(average);
        sb.append(", amountOfPositiveElements=").append(amountOfPositiveElements);
        sb.append(", amountOfNegativeElements=").append(amountOfNegativeElements);
        sb.append('}');
        return sb.toString();
    }
}
