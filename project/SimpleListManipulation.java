import java.util.ArrayList;
import java.util.List;

/**
 * A class for performing simple manipulation operations on a list of integers.
 */
public class SimpleListManipulation {
    private List<Integer> numbers; // List to hold integers

    /**
     * Constructs a SimpleListManipulation object with an empty list.
     */
    public SimpleListManipulation() {
        this.numbers = new ArrayList<>();
    }

    /**
     * Adds a number to the list.
     *
     * @param number the number to add
     */
    public void addNumber(int number) {
        numbers.add(number);
    }

    /**
     * Removes a number from the list.
     *
     * @param number the number to remove
     * @return true if the number was removed, false otherwise
     */
    public boolean removeNumber(int number) {
        return numbers.remove(Integer.valueOf(number));
    }

    /**
     * Calculates the sum of all numbers in the list.
     *
     * @return the sum of all numbers in the list
     */
    public int sumAllNumbers() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Finds the maximum number in the list.
     *
     * @return the maximum number in the list
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

    /**
     * Checks if the list contains a specific number.
     *
     * @param number the number to check for
     * @return true if the list contains the number, false otherwise
     */
    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }

    /**
     * Gets the number at a specific index in the list.
     *
     * @param index the index of the number to retrieve (0-based)
     * @throws IndexOutOfBoundsException if the index is outside the list bounds
     * @return the number at the specified index
     */
    public int getNumber(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= numbers.size()) {
            throw new IndexOutOfBoundsException("Index is out of list bounds");
        }
        return numbers.get(index);
    }

    /**
     * Removes the number at a specific index from the list.
     *
     * @param index the index of the number to remove (0-based)
     * @throws IndexOutOfBoundsException if the index is outside the list bounds
     * @return the number that was removed, or -1 if the index was invalid
     */
    public int removeNumberByIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= numbers.size()) {
            throw new IndexOutOfBoundsException("Index is out of list bounds");
        }
        return numbers.remove(index);
    }

    /**
     * Calculates the average of all numbers in the list.
     *
     * @throws ArithmeticException if the list is empty
     * @return the average of all numbers in the list
     */
    public double getAverage() throws ArithmeticException {
        if (numbers.isEmpty()) {
            throw new ArithmeticException("Cannot calculate average of an empty list");
        }
        int sum = sumAllNumbers();
        return (double) sum / numbers.size();
    }

    /**
     * Divides the sum of all numbers in the list by the count of numbers.
     *
     * @throws ArithmeticException if the list is empty
     * @return the result of dividing the sum by the count of numbers
     */
    public double divideAllNumbers() throws ArithmeticException {
        int sum = sumAllNumbers();
        if (numbers.isEmpty()) {
            throw new ArithmeticException("Cannot divide by zero (empty list)");
        }
        return (double) sum / numbers.size();
    }

}

// End of file
