/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0306
 * @since 17.0
 */
class arrayPrint {

    /**
     * Returns string version of the array in reverse order.
     *
     * @param int the array that needs to be reversed.
     * @return The reverse array.
     */
    public static String _arrayPrint(int[] array) {
        StringBuilder reverseArray = new StringBuilder();
        for (int index = array.length - 1; index >= 0; index--) {
            reverseArray.append(array[index]);
            if (index != 0) {
                reverseArray.append(", ");
            }
        }
        return reverseArray.toString();
    }

    /**
     * Implements Exercise: 5.1
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3, 4, 5 };
        String reverseArray = _arrayPrint(array);
        System.out.print(reverseArray);
    }
}

// End of file
