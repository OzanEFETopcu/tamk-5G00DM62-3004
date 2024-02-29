import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0129
 * @since 17.0
 */
public class DatePersonalInfo {

    /**
     * Returns user name line.
     *
     * @return Formatted date in a sentence format.
     */
    public static String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
        Date date = new Date();
        return "The date is " + formatter.format(date) + "\n";
    }

    /**
     * Returns user name line.
     *
     * @param String first name.
     * @param String last name.
     * @param String height.
     * @return Personal information in a sentence format.
     */
    public static String setPersonalInfo(String first, String last, String height) {

        return "Hello, I'm "+first+" "+last+"\nI'm "+height+" cm tall";
    }

    /**
     * Implements Exercise: 1.2
     *
     * Write the Date program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String currentDate = getDate();
        String personalInfo = setPersonalInfo("Ozan", "Topcu", "176");
        System.out.println(currentDate + personalInfo);
    }
}

// End of file
