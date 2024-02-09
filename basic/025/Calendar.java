/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0130
 * @since 17.0
 */
public class Calendar {

    /**
    * Return user name line.
    *
    * @param void The values are set inside the function.
    * @return Schedule according to time.
    */
    public static String sort() {
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        Day weekDay = Day.SATURDAY;
        int hour = 10;
        int minute = 31;

        if (weekDay == Day.MONDAY && ((hour==19)||(hour==20 && minute <=30))) {
            return "Mon 19:00-20:30 volleyball";
        }else if (weekDay == Day.WEDNESDAY && ((hour==20  && minute >=30)||(hour==21 && minute <=30))) {
            return "Wed 20:30-21:30 badminton";
        }else if (weekDay == Day.SATURDAY && ((hour==10)||(hour==11))) {
            return "Sat 10:00-11:00 gym";
        }else {
            return "No events for " + weekDay + " " + hour + ":" + minute;
        }
    }

    /**
    * Exercise: 2.5
    * Write the Calendar program.
    *
    * @param args Command line arguments. Not used.
    */
    public static void main(String[] args) {
        String answer = sort();
        System.out.println(answer);
    }
}

// End of file
