/**
 * @author      Ozan Topcu <ozan.topcu@tuni.fi>
 * @version     2024.0126
 * @since       17.0
 */
public class Pythagoras {

    /**
     * Returns user name line.
     *
     * @param double side a.
     * @param double side b.
     * @return The length of the side across the 90 degree angle.
     */
    public static double calculate(double a, double b){
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    /**
     * Implements Exercise: 1.4
     *
     * Writes the Pythagoras program.
     *
     * @param  args  Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double answer = calculate(3,4);
        System.out.println(answer);
    }
}

// End of file
