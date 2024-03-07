/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0307
 * @since 17.0
 */
class RangeFilter {

    /**
     * Searches for values within the specified range in the given array.
     *
     * @param array The array to search values from.
     * @param min   The minimum value of the range (inclusive).
     * @param max   The maximum value of the range (inclusive).
     * @return A string containing the values within the specified range.
     */
    public static String searchRange(int[] array, int min, int max) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= min && array[i] <= max) {
                result.append(array[i]);
                if (i < array.length - 1) {
                    result.append(", ");
                }
            }
        }
        return result.toString();
    }

    /**
     * Implements Exercise: 5.4
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = { -3, -2, -1, 0, 1, 2, 3 };
        int min = -1;
        int max = 2;
        String result = searchRange(array, min, max);
        System.out.println(result);
    }
}

// End of file
