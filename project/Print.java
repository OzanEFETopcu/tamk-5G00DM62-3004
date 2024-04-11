import java.util.Scanner;

/**
 * A class providing methods for printing messages and interacting with the
 * user.
 */
public class Print {

    /**
     * Returns a greeting message for the user.
     *
     * @return a greeting message
     */
    public String hello() {
        return "\nHello User, this is the testing project "
                + "there will be 9 separate classes\n"
                + "each with separate functionalities\n"
                + "there will be 9 separate classes\n"
                + "each with separate functionalities\n";
    }

    /**
     * Returns a message prompting the user to choose a class for testing.
     *
     * @return a message prompting class choice
     */
    public String classChoiceMessage() {
        return "Please choose a class to test with numbers from 1-9";
    }

    /**
     * Directs the user to input a choice.
     *
     * @throws NumberFormatException if the input is not a number
     */
    public void directUserToClass() {
        Scanner classChoice = new Scanner(System.in);
        String number = classChoice.nextLine();
        try {
            Integer.parseInt(number); // Try parsing the input as an integer
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Input must be a number");
        }
        System.out.println("Username is: " + number);
    }

    /**
     * Returns a thank you message.
     *
     * @return a thank you message
     */
    public String thankYouMessage() {
        return "Thank you for testing this application";
    }

    /**
     * Checks if the user wants to continue testing.
     *
     * @return "1" if the user wants to continue, otherwise something else
     * @throws IllegalArgumentException if the input is not "1" or something else
     */
    public String repeatCheck() {
        System.out.println("If you want to continue press 1\nElse press something else");
        Scanner repeatChoice = new Scanner(System.in);
        String number = repeatChoice.nextLine();
        if (!number.equals("1") && !number.equals("0")) {
            throw new IllegalArgumentException("Input must be '1' or '0'");
        }
        return number;
    }

    /**
     * Simulates a network connection by waiting for a specified duration.
     *
     * @param durationInSeconds the duration to wait in seconds
     * @throws InterruptedException if the thread is interrupted while waiting
     */
    public void simulateNetworkConnection(int durationInSeconds) throws InterruptedException {
        System.out.println("Simulating network connection...");
        Thread.sleep(durationInSeconds * 1000);
        System.out.println("Network connection established.");
    }
}

// End of fie
