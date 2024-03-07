/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0307
 * @since 17.0
 */
class temperatureArray {

    /**
     * Returns a sorting of temperature array.
     *
     * @param int[] the array that needs to be sorted.
     * @return The sorted temperature array.
     */
    public static String temperatureSort(int[] array) {
        int maxTemp = array[0];
        int minTemp = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minTemp) {
                minTemp = array[i];
            }
            if (array[i] > maxTemp) {
                maxTemp = array[i];
            }
            sum += array[i];
        }
        String output = "Temperature:\nMin: "+ minTemp +"\nMax: "+ maxTemp + "\nAvg: " + sum/array.length;
        return output;
    }

    /**
     * Implements Exercise: 5.2
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = { -20, 10, 15, -4, 8, 10, 3, -1, 0, -9 };
        String tempSorting = temperatureSort(array);
        System.out.print(tempSorting);
    }
}

// End of file
