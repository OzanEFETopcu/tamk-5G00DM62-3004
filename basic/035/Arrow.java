/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Arrow{

    /**
     * Returns an arrow with the size of input.
     *
     * @param double length of the arrow.
     * @param String type of char to be printed.
     * @return The arrow shape in text.
     */
    public static String arrow(double size, String ch) {
        String arrowDrawing = "";
        String gap = "  ";
        int gapAmount = 0;
        for (int i = 0; i < size; i++) {
            if (i<Math.ceil(size/2)) {
                for (int j = 0; j < gapAmount; j++) {
                    arrowDrawing += gap;
                }
                for (int j = 0; j < size-1; j++) {
                    arrowDrawing += ch + " ";
                }
                arrowDrawing += "\n";
                ++gapAmount;
                if (i == Math.ceil(size/2)-1) {
                    --gapAmount;
                }
            }else{
                --gapAmount;
                for (int j = 0; j < gapAmount; j++) {
                    arrowDrawing += gap;
                }
                for (int j = 0; j < size-1; j++) {
                    arrowDrawing += ch + " ";
                }
                arrowDrawing += "\n";
            }
        }
        return arrowDrawing;
    }

    /**
     * Implements Exercise: 3.5
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double size = 3;
        String ch = "*";
        String arrowDrawing = arrow(size, ch);
        System.out.println(arrowDrawing);
    }
}

// End of file
