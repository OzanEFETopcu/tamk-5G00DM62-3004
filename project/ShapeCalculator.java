/**
 * A utility class for calculating properties of geometric shapes.
 */
public class ShapeCalculator {

    /**
     * Calculates the area of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     * @return the area of the rectangle
     */
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    /**
     * Calculates the area of a circle.
     *
     * @param radius the radius of the circle
     * @throws IllegalArgumentException if the radius is negative
     * @return the area of the circle
     */
    public double calculateCircleArea(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     * @throws IllegalArgumentException if either length or width is negative
     * @return the perimeter of the rectangle
     */
    public double calculateRectanglePerimeter(double length, double width) throws IllegalArgumentException {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width cannot be negative");
        }
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
     * @param base   the base of the triangle
     * @param height the height of the triangle
     * @throws IllegalArgumentException if either base or height is negative or zero
     * @return the area of the triangle
     */
    public double calculateTriangleArea(double base, double height) throws IllegalArgumentException {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive values");
        }
        return 0.5 * base * height;
    }

    /**
     * Calculates the length of the hypotenuse of a right triangle.
     *
     * @param side1 the length of one side of the triangle
     * @param side2 the length of the other side of the triangle
     * @throws IllegalArgumentException if either side length is negative or zero
     * @return the length of the hypotenuse
     */
    public double calculateHypotenuse(double side1, double side2) throws IllegalArgumentException {
        if (side1 <= 0 || side2 <= 0) {
            throw new IllegalArgumentException("Side lengths must be positive values");
        }
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

    /**
     * Calculates the volume of a sphere.
     *
     * @param radius the radius of the sphere
     * @throws IllegalArgumentException if the radius is negative
     * @return the volume of the sphere
     */
    public double calculateSphereVolume(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

}

// End of file
