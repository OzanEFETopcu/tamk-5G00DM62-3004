/**
 * A class for performing basic mathematical operations on an array of integers.
 */
public class ArrayMath {
    private int[] numbers; // Array to store numbers

    /**
     * Constructs an ArrayMath object with the specified size.
     *
     * @param size the size of the array
     */
    public ArrayMath(int size) {
        numbers = new int[size];
    }

    /**
     * Sets the value of a number at the specified index in the array.
     *
     * @param index the index of the number to be set
     * @param value the value to be set
     */
    public void setNumber(int index, int value) {
        if (index >= 0 && index < numbers.length) {
            numbers[index] = value;
        }
    }

    /**
     * Gets the value of the number at the specified index in the array.
     *
     * @param index the index of the number to be retrieved
     * @return the value of the number at the specified index, or -1 if the index is invalid
     */
    public int getNumber(int index) {
        if (index >= 0 && index < numbers.length) {
            return numbers[index];
        } else {
            return -1; // Indicate invalid index with -1
        }
    }

    /**
     * Calculates the sum of all numbers in the array.
     *
     * @return the sum of all numbers in the array
     */
    public int sumAllNumbers() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Multiplies all numbers in the array.
     *
     * @return the result of multiplying all numbers in the array
     */
    public int multiplyAllNumbers() {
        int result = 1; // Initialize to 1 to handle multiplication
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    /**
     * Finds the maximum number in the array.
     *
     * @return the maximum number in the array
     */
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

// End of file
