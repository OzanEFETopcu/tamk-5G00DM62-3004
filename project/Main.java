package project;

/**
 * The main class to run the project.
 */
public class Main {

    /**
     * The main method to execute the project.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Print output = new Print(); // Create an instance of Print class
        String repeatCheck = "1"; // Initialize repeatCheck to "1"

        // Repeat the following block as long as repeatCheck is "1"
        while (repeatCheck == "1") {

            // Display a hello message
            String text1 = output.hello();
            System.out.println(text1);

            // Display a class choice message
            String text2 = output.classChoiceMessage();
            System.out.println(text2);

            // Direct the user to a class
            output.directUserToClass();

            // Display a thank you message
            String text3 = output.thankYouMessage();
            System.out.println(text3);

            // Ask the user if they want to repeat and get their response
            String text4 = output.repeatCheck();
            repeatCheck = text4;
        }
    }
}

// End of file
