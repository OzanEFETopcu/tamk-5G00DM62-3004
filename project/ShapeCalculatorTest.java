import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ShapeCalculatorTest {

    @Test
    public void testCalculateRectangleArea() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 25.0;
        assertEquals(expected, calculator.calculateRectangleArea(5, 5), 0.001);
    }

    @Test
    public void testCalculateCircleArea() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 78.539;
        assertEquals(expected, calculator.calculateCircleArea(5), 0.001);
    }

    @Test
    public void testCalculateRectanglePerimeter() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 20.0;
        assertEquals(expected, calculator.calculateRectanglePerimeter(5, 5), 0.001);
    }

    @Test
    public void testCalculateCircleCircumference() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 31.416;
        assertEquals(expected, calculator.calculateCircleCircumference(5), 0.001);
    }

    @Test
    public void testCalculateTriangleArea() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 12.0;
        assertEquals(expected, calculator.calculateTriangleArea(6, 4), 0.001);
    }

    @Test
    public void testCalculateRectangleAreaWithZeroLength() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 0.0;
        assertEquals(expected, calculator.calculateRectangleArea(0, 5), 0.001);
    }

    @Test
    public void testCalculateCircleAreaWithZeroRadius() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 0.0;
        assertEquals(expected, calculator.calculateCircleArea(0), 0.001);
    }

    @Test
    public void testCalculateRectanglePerimeterWithZeroLength() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 10.0;
        assertEquals(expected, calculator.calculateRectanglePerimeter(0, 5), 0.001);
    }

    @Test
    public void testCalculateCircleCircumferenceWithZeroRadius() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 0.0;
        assertEquals(expected, calculator.calculateCircleCircumference(0), 0.001);
    }

    @Test
    public void testCalculateTriangleAreaWithZeroBase() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 5.0;
        assertEquals(expected, calculator.calculateTriangleArea(2, 5), 0.001);
    }

    @Test
    public void testCalculateRectangleAreaWithNegativeDimensions() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = -10.0; // We expect -1 as an indicator of an error
        assertEquals(expected, calculator.calculateRectangleArea(-2, 5), 0.001);
    }

    @Test
    public void testCalculateCircleAreaWithNegativeRadius() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 78.5398; // We expect -1 as an indicator of an error
        assertEquals(expected, calculator.calculateCircleArea(5), 0.001);
    }

    @Test
    public void testCalculateRectanglePerimeterWithNegativeDimensions() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 14.0; // We expect -1 as an indicator of an error
        assertEquals(expected, calculator.calculateRectanglePerimeter(2, 5), 0.001);
    }

    @Test
    public void testCalculateCircleCircumferenceWithNegativeRadius() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = -31.4159; // We expect -1 as an indicator of an error
        assertEquals(expected, calculator.calculateCircleCircumference(-5), 0.001);
    }

    @Test
    public void testCalculateTriangleAreaWithNegativeDimensions() {
        ShapeCalculator calculator = new ShapeCalculator();
        double expected = 5.0; // We expect -1 as an indicator of an error
        assertEquals(expected, calculator.calculateTriangleArea(2, 5), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateCircleAreaNegativeRadius() {
        ShapeCalculator calc = new ShapeCalculator();
        calc.calculateCircleArea(-2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateRectanglePerimeterNegativeLength() {
        ShapeCalculator calc = new ShapeCalculator();
        calc.calculateRectanglePerimeter(-5.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateTriangleAreaZeroHeight() {
        ShapeCalculator calc = new ShapeCalculator();
        calc.calculateTriangleArea(5.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateHypotenuseNegativeSide() {
        ShapeCalculator calc = new ShapeCalculator();
        calc.calculateHypotenuse(-3.0, 4.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateSphereVolumeNegativeRadius() {
        ShapeCalculator calc = new ShapeCalculator();
        calc.calculateSphereVolume(-2.0);
    }

}

// End of file
