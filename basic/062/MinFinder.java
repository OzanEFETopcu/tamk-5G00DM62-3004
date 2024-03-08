/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0308
 * @since 17.0
 */
class MinFinder {

    /**
     * Returns a min of an array.
     *
     * @param int[] array to be searched.
     * @return The min element in an array.
     */
    public static int arrayMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min =  array[i];
            }
        }
        return min;
    }

    /**
     * Implements Exercise: 6.2
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array= {8, -10, 8};
        int sum = arrayMin(array);
        System.out.print(sum);
    }
}

// End of file
