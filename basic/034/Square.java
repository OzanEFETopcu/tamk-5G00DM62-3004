/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Square {

    /**
     * Returns a square with the size of input.
     *
     * @param int length of a side of square.
     * @return The square in text.
     */
    public static String square(int size) {
        String squareDrawing = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squareDrawing += "x";
            }
            squareDrawing += "\n";
        }
        return squareDrawing;
    }

    /**
     * Implements Exercise: 3.4
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int size = 4;
        String squareDrawing = square(size);
        System.out.println(squareDrawing);
    }
}

// End of file
