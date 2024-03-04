/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Sum{

    /**
     * Returns a sum of all the integers from 0 to the input value.
     *
     * @param int last value in the sum.
     * @return Sum value.
     */
    public static int sum(int value) {
        int total = 0;
        for (int i = 0; i <= value; i++) {
            total += i;
        }
        return total;
    }

    /**
     * Implements Exercise: 4.1
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int value = 5;
        int total = sum(value);
        System.out.println(total);
    }
}

// End of file
