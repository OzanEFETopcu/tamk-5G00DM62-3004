/**
* @author Ozan Topcu <ozan.topcu@tuni.fi>
* @version 2024.0130
* @since 17.0
*/
public class bmi {

    /**
    * Returns user name line.
    *
    * @param int weight.
    * @param double height.
    * @return Weight, height, and BMI in a sentence format.
    */
    public static String calculate(int weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        return "Weight (kg): "+weight+"\nheight (m) : "+height+"\nBMI\t   : "+bmi;
    }

    /**
    * Exercise: 1.3
    *
    * Writes the BMI calculator program.
    *
    * @param args Command line arguments. Not used.
    */
    public static void main(String[] args) {
        String answer = calculate(80, 1.76);
        System.out.println(answer);
    }
}

// End of file
