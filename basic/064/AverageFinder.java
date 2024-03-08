/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0308
 * @since 17.0
 */
class AverageFinder {

    /**
     * Returns a average of an array.
     *
     * @param double[] array to be searched.
     * @return The average of an array.
     */
    public static double arrayAverage(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum =+ array[i];
        }
        return sum/array.length;
    }

    /**
     * Implements Exercise: 6.4
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double[] array= {8, -10, 8};
        double average = arrayAverage(array);
        System.out.print(average);
    }
}

// End of file
