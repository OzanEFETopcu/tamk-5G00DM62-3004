import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayMathTest {

    // Test cases for setNumber() method
    @Test
    public void testSetNumber() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(0, 10);
        assertEquals(10, math.getNumber(0));
    }

    @Test
    public void testSetNumberOutOfRange() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(6, 10); // Attempting to set number out of range
        assertEquals(-1, math.getNumber(6));
    }

    @Test
    public void testSetNumberNegativeIndex() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(-1, 10); // Attempting to set number with negative index
        assertEquals(-1, math.getNumber(-1));
    }

    // Test cases for getNumber() method
    @Test
    public void testGetNumber() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(0, 10);
        assertEquals(10, math.getNumber(0));
    }

    @Test
    public void testGetNumberOutOfRange() {
        ArrayMath math = new ArrayMath(5);
        assertEquals(-1, math.getNumber(6)); // Attempting to get number out of range
    }

    @Test
    public void testGetNumberNegativeIndex() {
        ArrayMath math = new ArrayMath(5);
        assertEquals(-1, math.getNumber(-1)); // Attempting to get number with negative index
    }

    // Test cases for sumAllNumbers() method
    @Test
    public void testSumAllNumbers() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(0, 10);
        math.setNumber(1, 20);
        assertEquals(30, math.sumAllNumbers());
    }

    @Test
    public void testSumAllNumbersEmptyArray() {
        ArrayMath math = new ArrayMath(5);
        assertEquals(0, math.sumAllNumbers()); // Sum of an empty array
    }

    @Test
    public void testSumAllNumbersNegativeValues() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(0, -10);
        math.setNumber(1, -20);
        assertEquals(-30, math.sumAllNumbers()); // Sum of array with negative values
    }

    // Test cases for multiplyAllNumbers() method
    @Test
    public void testMultiplyAllNumbers() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(0, 2);
        math.setNumber(1, 3);
        assertEquals(0, math.multiplyAllNumbers());
    }

    @Test
    public void testMultiplyAllNumbersEmptyArray() {
        ArrayMath math = new ArrayMath(5);
        assertEquals(0, math.multiplyAllNumbers()); // Product of an empty array
    }

    @Test
    public void testMultiplyAllNumbersWithZero() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(0, 2);
        math.setNumber(1, 0);
        assertEquals(0, math.multiplyAllNumbers()); // Product of array with zero
    }

    // Test cases for findMaxNumber() method
    @Test
    public void testFindMaxNumber() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(0, 10);
        math.setNumber(1, 30);
        assertEquals(30, math.findMaxNumber());
    }

    @Test
    public void testFindMaxNumberEmptyArray() {
        ArrayMath math = new ArrayMath(5);
        assertEquals(0, math.findMaxNumber()); // Max number of an empty array
    }

    @Test
    public void testFindMaxNumberNegativeValues() {
        ArrayMath math = new ArrayMath(5);
        math.setNumber(0, -10);
        math.setNumber(1, -5);
        assertEquals(0, math.findMaxNumber()); // Max number of array with negative values
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testSetNumberInvalidIndex() {
        ArrayMath arrayMath = new ArrayMath(Integer.MIN_VALUE);
        arrayMath.setNumber(10, 5); // Attempt to set a number at an index out of bounds
    }

    @Test(expected = OutOfMemoryError.class)
    public void testSetNumberInvalidIndex2() {
        ArrayMath arrayMath = new ArrayMath(Integer.MAX_VALUE);
        arrayMath.setNumber(10, 5); // Attempt to set a number at an index out of bounds
    }

    @Test(expected = AssertionError.class)
    public void testDivideAllNumbersByZero1() {
        ArrayMath arrayMath = new ArrayMath(1);
        arrayMath.setNumber(0, 2);
        arrayMath.setNumber(1, 4);
        arrayMath.setNumber(2, 6);
        arrayMath.setNumber(3, 8);
        arrayMath.setNumber(4, 10);
        assertEquals(0, arrayMath.divideAllNumbers()); // Attempt to divide by zero
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideAllNumbersByZero2() {
        ArrayMath arrayMath = new ArrayMath(100000);
        arrayMath.setNumber(0, 2);
        arrayMath.setNumber(1, 4);
        arrayMath.setNumber(2, 6);
        arrayMath.setNumber(3, 8);
        arrayMath.setNumber(4, 10);
        assertEquals(0, arrayMath.divideAllNumbers()); // Attempt to divide by zero
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideAllNumbersByZero3() {
        ArrayMath arrayMath = new ArrayMath(100000);
        assertEquals(0, arrayMath.divideAllNumbers()); // Attempt to divide by zero
    }

}

// End of file
