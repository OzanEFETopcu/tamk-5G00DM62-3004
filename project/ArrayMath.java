package project;

public class ArrayMath {
    int[] numbers;

    public ArrayMath(int size) {
        numbers = new int[size];
    }

    public void setNumber(int index, int value) {
        if (index >= 0 && index < numbers.length) {
            numbers[index] = value;
        }
    }

    public int getNumber(int index) {
        if (index >= 0 && index < numbers.length) {
            return numbers[index];
        } else {
            return -1; // Indicate invalid index with -1
        }
    }

    public int sumAllNumbers() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int multiplyAllNumbers() {
        int result = 1; // Initialize to 1 to handle multiplication
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    public int findMaxNumber() {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
