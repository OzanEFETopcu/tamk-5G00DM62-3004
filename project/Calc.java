/**
 * A simple calculator class that performs basic arithmetic operations.
 */
public class Calc {

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public int sum(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("Arguments cannot be null");
        }
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of subtracting the second integer from the first integer
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of the two integers
     */
    public int multiply(int a, int b) {
        long result = (long) a * b; // Perform multiplication using long to check for overflow
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer overflow occurred");
        }
        return (int) result;
    }

    /**
     * Divides one integer by another.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of dividing the first integer by the second integer
     */
    public int divide(int a, int b) {
        return a / b;
    }

    /**
     * Calculates the power of an integer raised to another integer.
     *
     * @param a the base
     * @param b the exponent
     * @return the result of raising the base to the exponent
     */
    public double power(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        return Math.pow(a, b);
    }
}

// End of file
