/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0130
 * @since 17.0
 */
public class Cone {

    /**
    * Return user name line.
    *
    * @param double radius and height.
    * @return The volume of the cone.
    */
    public static String calculate(double radius, double height) {
        double volume = (Math.PI * Math.pow(radius, 2) * height)/3;
        return "Volume: "+ volume;
    }

    /**
    * Exercise: 1.5
    * Write the Cone Volume calculator program.
    *
    * @param args Command line arguments. Not used.
    */
    public static void main(String[] args) {
        String answer = calculate(2, 4);
        System.out.println(answer);
    }
}

// End of file
