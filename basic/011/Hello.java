/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0126
 * @since 17.0
 */
class HelloWorld {

    /**
     * Returns user name line.
     *
     * @param String The first name of the user.
     * @param String The last name of the user.
     * @return Greet the user.
     */
    public static String hello(String name, String surname) {
        String text_message = " Hello, I'm " + name + surname + " ";
        return text_message;
    }

    /**
     * Implements Exercise: 1.1
     *
     * Writes the Hello World program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String text_message = hello("Ozan", " Topcu");
        System.out.println("*************************\n*" + text_message + "*\n*************************");
    }
}

// End of file
