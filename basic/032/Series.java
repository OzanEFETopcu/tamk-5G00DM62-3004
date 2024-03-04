/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Series {

    /**
     * Returns a divided string of an input.
     *
     * @param int The length of the input.
     * @return Divided string.
     */
    public static String serie(int length) {
        String dividedSerie = "";
        while (length >= 10) {
            dividedSerie = dividedSerie + "123456789 ";
            length = length - 10;
        }
        if (length > 0) {
            for (int i = 1; i <= length; i++) {
                dividedSerie = dividedSerie + i;
            }
        }
        return dividedSerie;
    }

    /**
     * Implements Exercise: 3.2
     *
     * Calls the sequence divider for printing.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int length = 30;
        String dividedSerie = serie(length);
        System.out.println(dividedSerie);
    }
}

// End of file
