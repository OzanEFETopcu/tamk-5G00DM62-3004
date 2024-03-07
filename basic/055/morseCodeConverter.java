/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0307
 * @since 17.0
 */
class morseCodeConverter {

    /**
     * Returns a morse code of input.
     *
     * @param String the line of string to be converted.
     * @return The morse code of numbers.
     */
    public static String numToMorse(String numberLine) {
        String[] morseCode = {"- - - - -", ". - - - -", ". . - - -", ". . . - -", ". . . . -", ". . . . .", "- . . . .", "- - . . .", "- - - . .", "- - - - ."};
        String output = "";
        for (int i = 0; i < numberLine.length(); i++) {
            output += morseCode[Character.getNumericValue(numberLine.charAt(i))] + "\n";
        }
        return output;
    }

    /**
     * Implements Exercise: 5.5
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String numberString = "050123456";
        String output = numToMorse(numberString);
        System.out.print(output);
    }
}

// End of file
