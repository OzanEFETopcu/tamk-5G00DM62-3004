/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0130
 * @since 17.0
 */
public class Grade {

    static int part1_ECTS = 2;
    static int part2_ECTS = 1;
    static int part3_ECTS = 3;
    /**
    * Return user name line.
    *
    * @param int grade of each part of course.
    * @return The final calculated value.
    */
    public static String calculate(int part1_grade, int part2_grade, int part3_grade) {
        double weighted_values = ((part1_grade * part1_ECTS) + (part2_grade * part2_ECTS) + (part3_grade * part3_ECTS));
        double total_credits = ((part1_ECTS + part2_ECTS + part3_ECTS));
        double final_grade = weighted_values/total_credits;
        return "Final Grade: " + final_grade;
    }

    /**
    * Exercise: 1.6
    * Write the Grade calculator program.
    *
    * @param args Command line arguments. Not used.
    */
    public static void main(String[] args) {
        String answer = calculate(2, 4, 4);
        System.out.println(answer);
    }
}

// End of file
