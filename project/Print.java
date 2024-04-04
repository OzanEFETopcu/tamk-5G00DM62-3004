import java.util.Scanner;

/**
 * A class providing methods for printing messages and interacting with the user.
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
     */
    public void directUserToClass() {
        @SuppressWarnings("resource")
        Scanner classChoice = new Scanner(System.in);
        String number = classChoice.nextLine();
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
     */
    public String repeatCheck() {
        System.out.println("If you want to continue press 1\nElse press something else");
        @SuppressWarnings("resource")
        Scanner repeatChoice = new Scanner(System.in);
        String number = repeatChoice.nextLine();
        return number;
    }
}

// End of fie
