/**
* @author Ozan Topcu <ozan.topcu@tuni.fi>
* @version 2024.0130
* @since 17.0
*/
public class Choices {

    /**
    * Returnx user name line.
    *
    * @param int value a.
    * @param int value b.
    * @param int value c.
    * @return sorter order of those 3 values in a sentence format.
    */
    public static String sort(int a, int b, int c) {
        int highest_value = a;
        int middle_value = b;
        int lowest_value = c;

        if (a > b && a > c) {
            highest_value = a;
            if (b > c) {
                middle_value = b;
                lowest_value = c;
            } else {
                middle_value = c;
                lowest_value = b;
            }
        } else if (b > a && b > c) {
            highest_value = b;
            if (a > c) {
                middle_value = a;
                lowest_value = c;
            } else {
                middle_value = c;
                lowest_value = a;
            }
        } else { // c is the highest value
            if (a > b) {
                middle_value = a;
                lowest_value = b;
            } else {
                middle_value = b;
                lowest_value = a;
            }
        }

        return highest_value + " is the biggest value\n" + middle_value + " is in the middle\n" + lowest_value + " is the smallest";
    }

    /**
    * Exercise: 2.1
    *
    * Writes the Choices program.
    *
    * @param args Command line arguments. Not used.
    */
    public static void main(String[] args) {
        String answer = sort(4, 5, 3);
        System.out.println(answer);
    }
}

// End of file
