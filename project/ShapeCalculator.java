/**
 * A utility class for calculating properties of geometric shapes.
 */
public class ShapeCalculator {

    /**
     * Calculates the area of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area of the rectangle
     */
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    /**
     * Calculates the area of a circle.
     *
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the perimeter of the rectangle
     */
    public double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    /**
     * Calculates the circumference of a circle.
     *
     * @param radius the radius of the circle
     * @return the circumference of the circle
     */
    public double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates the area of a triangle.
     *
     * @param base the base of the triangle
     * @param height the height of the triangle
     * @return the area of the triangle
     */
    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}

// End of file
