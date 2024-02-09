/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0130
 * @since 17.0
 */
public class Day {

    final static int MONDAY= 1;
    final static int TUESDAY= 2;
    final static int WEDNESDAY= 3;
    final static int THURSDAY= 4;
    final static int FRIDAY= 5;
    final static int SATURDAY= 6;
    final static int SUNDAY= 7;
    /**
    * Return user name line.
    *
    * @param int the number value of today.
    * @return day according to today value.
    */
    public static String printDay(int today) {
        if (today == 1) {
            return "MONDAY";
        }else if (today == 2) {
            return "TUESDAY";
        }else if (today == 3) {
            return "WEDNESDAY";
        }else if (today == 4) {
            return "THURSDAY";
        }else if (today == 5) {
            return "FIRDAY";
        }else if (today == 6) {
            return "SATURDAY";
        }else if (today == 7) {
            return "SUNDAY";
        }else{
            return "Unknown date ("+today+")";
        }
    }

    /**
    * Exercise: 2.2
    * Write the Day program.
    *
    * @param args Command line arguments. Not used.
    */
    public static void main(String[] args) {
        int today = WEDNESDAY;
        String answer = printDay(today);
        System.out.println(answer);
    }
}

// End of file
