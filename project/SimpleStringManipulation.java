/**
 * A class for performing simple string manipulation operations.
 */
public class SimpleStringManipulation {
    String inputString;

    /**
     * Constructs a SimpleStringManipulation object with the specified input string.
     *
     * @param input the input string for manipulation
     */
    public SimpleStringManipulation(String input) {
        inputString = input;
    }

    /**
     * Counts the number of vowels in the input string.
     *
     * @return the number of vowels in the input string
     */
    public int countVowels() {
        int count = 0;
        for (char c : inputString.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    /**
     * Reverses the input string.
     *
     * @return the reversed input string
     */
    public String reverseString() {
        StringBuilder reversed = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        return reversed.toString();
    }

    /**
     * Capitalizes the first letter of the input string.
     *
     * @return the input string with the first letter capitalized
     */
    public String capitalizeFirstLetter() {
        if (inputString.isEmpty()) {
            return inputString;
        }
        return inputString.substring(0, 1).toUpperCase() + inputString.substring(1);
    }

    /**
     * Checks if the input string contains the specified substring.
     *
     * @param substring the substring to check for
     * @return true if the input string contains the substring, false otherwise
     */
    public boolean containsSubstring(String substring) {
        return inputString.contains(substring);
    }

    /**
     * Concatenates the input string with another string.
     *
     * @param otherString the string to concatenate with the input string
     * @return the concatenated string
     */
    public String concatenateString(String otherString) {
        return inputString.concat(otherString);
    }
}

// End of file
