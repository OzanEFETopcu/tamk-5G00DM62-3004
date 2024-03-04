/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Underline {

    /**
     * Returns a underline for input string.
     *
     * @param String The input text.
     * @return Text with an underline.
     */
    public static String underline(String text) {
        String updatedText = "";
        String underlineText = "";
        for (int i = 0; i < text.length(); i++) {
            underlineText += "-";
        }
        updatedText = text+"\n"+underlineText;
        return updatedText;
    }

    /**
     * Implements Exercise: 3.3
     *
     * Adds a underline to certain text.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String text = "Helllooooo";
        String updatedText = underline(text);
        System.out.println(updatedText);
    }
}

// End of file
