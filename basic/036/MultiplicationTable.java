/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0126
 * @since 17.0
 */
class MultiplicationTable {

    /**
     * Returns a multiplication table of a given size.
     *
     * @param int The size of the table.
     */
    public static void printMultiplicationTable(int size) {
        System.out.print(" * |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n");

        // Print the separator line
        printSeparatorLine(size);
        for (int i = 1; i <= size; i++) {
            System.out.printf("%s%d%s|", " ", i, " ");
            for (int j = 1; j <= size; j++) {
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }

    /**
     * Returns a seperator line for the table.
     *
     * @param int The size of the table.
     */
    public static void printSeparatorLine(int size) {
        System.out.print("---+");
        for (int i = 1; i <= size; i++) {
            System.out.print("---");
        }
        System.out.println();
    }

    /**
     * Implements Exercise: 3.6
     *
     * Prints out multiplication table
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int size = 9;
        printMultiplicationTable(size);
    }
}

// End of file
