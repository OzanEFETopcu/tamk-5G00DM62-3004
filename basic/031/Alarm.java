/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Alarm {

    /**
     * Returns a countdown.
     *
     * @param int The value for the countdown.
     * @return Clock output.
     */
    public static String alarm(int max) {
        String clock_output = "";
        for (int i = max; i >= 0; i--) {
            if (i != 0) {
                clock_output = clock_output + i + ", ";
            }else{
                clock_output = clock_output + "ALARM!";
            }

        }
        return clock_output;
    }

    /**
     * Implements Exercise: 3.1
     *
     * Calls the alarm function to start countdown.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int max = 13;
        String clock_output = alarm(max);
        System.out.println(clock_output);
    }
}

// End of file
