/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0130
 * @since 17.0
 */
public class Temperature {

    /**
     * Returns user name line.
     *
     * @return Weather updates.
     */
    public static String sort() {
        final int TORONTO = 0;
        final int MONTREAL = 1;
        final int VANCOUVER = 2;
        int city = TORONTO;
        int temperature = -25;

        if (city == 0) {
            if (temperature < -20) {
                return "Freezing";
            } else {
                return "Moderate Winter";
            }
        } else {
            if (temperature < -20) {
                return "Ice Freezing";
            } else if (temperature <= 10 && temperature >= -20) {
                return "Ice Cold";
            } else {
                return "Normal Weather";
            }
        }
    }

    /**
     * Implements Exercise: 2.4
     *
     * Writes the Temperature program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String answer = sort();
        System.out.println(answer);
    }
}

// End of file
