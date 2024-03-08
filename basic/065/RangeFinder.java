/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0308
 * @since 17.0
 */
public class RangeFinder {

    /**
     * Returns a average of an array.
     *
     * @param int[] array to be searched.
     * @param int from.
     * @param int to.
     * @param int notFound.
     * @return The average of an array.
     */
    public static int findFirstInRange(int[] array, int from, int to, int notFound) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= from && array[i] <= to) {
                return array[i];
            }
        }
        return notFound;
    }

    /**
     * Implements Exercise: 6.5
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = {3, 1, 2};
        int from = 2;
        int to = 10;
        final int NOT_FOUND = -1;
        int value = findFirstInRange(array, from, to, NOT_FOUND);
        System.out.println("First value in range [" + from + ", " + to + "]: " + value);
    }
}
