package project;

public class SimpleStringManipulation {
    String inputString;

    public SimpleStringManipulation(String input) {
        inputString = input;
    }

    public int countVowels() {
        int count = 0;
        for (char c : inputString.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public String reverseString() {
        StringBuilder reversed = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        return reversed.toString();
    }

    public String capitalizeFirstLetter() {
        if (inputString.isEmpty()) {
            return inputString;
        }
        return inputString.substring(0, 1).toUpperCase() + inputString.substring(1);
    }

    public boolean containsSubstring(String substring) {
        return inputString.contains(substring);
    }

    public String concatenateString(String otherString) {
        return inputString.concat(otherString);
    }
}

