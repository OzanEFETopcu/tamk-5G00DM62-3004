/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0130
 * @since 17.0
 */
public class Gender {

    /**
     * Returns user name line.
     *
     * @return comment on the persons height and gender.
     */
    public static String sort() {
        final int MALE = 0;
        final int FEMALE = 1;
        int gender = FEMALE;
        int height = 175;

        if (gender == 0) {
            if (height<180) {
                return "Short male";
            }else if (height<=187 && height>=180) {
                return "Normal male";
            }else{
                return "Tall male";
            }
        }else{
            if (height<175) {
                return "Short female";
            }else if (height<=182 && height>=175) {
                return "Normal female";
            }else{
                return "Tall female";
            }
        }
    }

    /**
     * Implements Exercise: 2.3
     *
     * Writes the Gender program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String answer = sort();
        System.out.println(answer);
    }
}

// End of file
