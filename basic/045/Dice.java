import java.util.Random;

/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Dice{

    /**
     * Returns a random dice value.
     *
     * @return The side of a dice.
     */
    public static int dice() {
        Random random = new Random();
        return random.nextInt(6 - 1 + 1) + 1;
    }

    /**
     * Implements Exercise: 4.5
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int value = dice();
        System.out.printf("%d", value);
    }
}

// End of file
