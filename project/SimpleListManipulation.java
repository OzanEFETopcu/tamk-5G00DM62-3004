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
}

// End of file
