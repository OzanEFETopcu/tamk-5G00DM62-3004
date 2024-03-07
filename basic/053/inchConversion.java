/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0307
 * @since 17.0
 */
class inchConversion {

    /**
     * Returns a array of values in centimeters.
     *
     * @param int[] the inch values array.
     * @return The sorted measurement array.
     */
    public static String conversion(double[] array) {
        String output = "";
        double centimeters[] = new double [3];
        for (int i = 0; i < array.length; i++) {
            centimeters[i] = array[i] * 2.54;
            output += array[i] + " in = " + centimeters[i] + "cm\n";
        }
        return output;
    }

    /**
     * Implements Exercise: 5.3
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double[] inches = { 1, 2, 3 };
        String output = conversion(inches);
        System.out.print(output);
    }
}

// End of file
