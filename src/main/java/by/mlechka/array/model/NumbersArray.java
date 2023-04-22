package by.mlechka.array.model;

public class NumbersArray {
    private int[] numbers;

    public NumbersArray() {

    }
    public NumbersArray(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]).append(" ");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumbersArray that = (NumbersArray) o;

        if (numbers.length != that.numbers.length) return false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != that.numbers[i]) return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

}
