/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0308
 * @since 17.0
 */
class MaxFinder {

    /**
     * Returns a max of an array.
     *
     * @param int[] array to be searched.
     * @return The max element in an array.
     */
    public static int arrayMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max =  array[i];
            }
        }
        return max;
    }

    /**
     * Implements Exercise: 6.2
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array= {8, -10, 8};
        int sum = arrayMax(array);
        System.out.print(sum);
    }
}

// End of file
