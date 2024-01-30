/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0130
 * @since 17.0
 */
public class Gender {
    /**
     * Exercise: 2.3
     * Write the Gender program.
     *
     * @param args Command line arguments. Not used.
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

    public static void main(String[] args) {
        String answer = sort();
        System.out.println(answer);
    }
}

// End of file
