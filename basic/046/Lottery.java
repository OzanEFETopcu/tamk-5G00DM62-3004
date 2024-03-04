import java.util.Arrays;
import java.util.Random;

/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Lottery {

    /**
     * Returns a random dice value.
     *
     * @return The side of a dice.
     */
    public static int dice() {
        Random random = new Random();
        return random.nextInt(40 - 1 + 1) + 1;
    }

    /**
     * Returns a array of random values.
     *
     * @return The lottery numbers.
     */
    public static int[] lottery() {
        int[] lotteryNumbers = new int[7];
        for (int i = 0; i < lotteryNumbers.length; i++) {
            boolean unique = true;
            lotteryNumbers[i] = dice();
            // Check uniqueness against all previously generated numbers
            for (int j = 0; j < i; j++) {
                if (lotteryNumbers[j] == lotteryNumbers[i]) {
                    unique = false;
                    break; // No need to continue checking if a duplicate is found
                }
            }
            if (!unique) {
                // If not unique, generate a new number until a unique one is found
                i--; // Repeat the current iteration to generate a new number
            }
        }
        return lotteryNumbers;
    }

    /**
     * Implements Exercise: 4.6
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] lotteryNumbers = lottery();
        System.out.print("Lottery: ");
        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.printf("%d, ", lotteryNumbers[i]);
        }
    }
}

// End of file
