/**
 * @author Ozan Topcu <ozan.topcu@tuni.fi>
 * @version 2024.0304
 * @since 17.0
 */
class Circle{

    /**
     * Returns area of a circle.
     *
     * @param double radius.
     * @return The area of circle.
     */
    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Implements Exercise: 4.4
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double radius = 3.5;
        double area = area(radius);
        System.out.printf("%.1f", area);
    }
}

// End of file
