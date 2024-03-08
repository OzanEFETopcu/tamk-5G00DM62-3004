/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0308
 * @since 17.0
 */
class Sum {

    /**
     * Returns a sum of an array.
     *
     * @param int[] array to be summed.
     * @return The sum of every element in an array.
     */
    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Implements Exercise: 6.1
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array= {1, 2, 3};
        int sum = arraySum(array);
        System.out.print(sum);
    }
}

// End of file
