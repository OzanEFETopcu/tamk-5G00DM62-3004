/**
 * A class for performing simple string manipulation operations.
 */
public class SimpleStringManipulation {
    String inputString;

    /**
     * Constructs a SimpleStringManipulation object with the specified input string.
     *
     * @param input the input string for manipulation
     * @throws IllegalArgumentException if the input string is null
     */
    public SimpleStringManipulation(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
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
     * @throws IllegalStateException if the input string is empty
     * @return the reversed input string
     */
    public String reverseString() {
        if (inputString.isEmpty()) {
            throw new IllegalStateException("Cannot reverse an empty string");
        }
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

    /**
     * Finds the index of the first occurrence of a substring in the input string.
     *
     * @param substring the substring to search for
     * @throws IllegalArgumentException if the substring is null
     * @throws IllegalStateException if the substring is not found
     * @return the index of the first occurrence of the substring
     */
    public int indexOfSubstring(String substring) {
        if (substring == null) {
            throw new IllegalArgumentException("Substring cannot be null");
        }
        int index = inputString.indexOf(substring);
        if (index == -1) {
            throw new IllegalStateException("Substring not found in input string");
        }
        return index;
    }

    /**
     * Replaces all occurrences of a substring with another string.
     *
     * @param oldSubstring the substring to replace
     * @param newSubstring the replacement string
     * @throws IllegalArgumentException if the old substring is null
     */
    public void replaceSubstring(String oldSubstring, String newSubstring) {
        if (oldSubstring == null) {
            throw new IllegalArgumentException("Old substring cannot be null");
        }
        inputString = inputString.replace(oldSubstring, newSubstring);
    }
}

// End of file
