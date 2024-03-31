package project;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalcTest {

    @Test
    public void testSum1() {
        Calc calc = new Calc();
        int expected = 10;
        assertEquals(expected, calc.sum(10,0));
    }

    @Test
    public void testSum2() {
        Calc calc = new Calc();
        int expected = 5;
        assertEquals(expected, calc.sum(3,2));
    }

    @Test
    public void testSum3() {
        Calc calc = new Calc();
        int expected = 0;
        assertEquals(expected, calc.sum(0,0));
    }

    @Test
    public void testSubtract1() {
        Calc calc = new Calc();
        int expected = 10;
        assertEquals(expected, calc.subtract(10,0));
    }

    @Test
    public void testSubtract2() {
        Calc calc = new Calc();
        int expected = 1;
        assertEquals(expected, calc.subtract(3,2));
    }

    @Test
    public void testSubtract3() {
        Calc calc = new Calc();
        int expected = 0;
        assertEquals(expected, calc.subtract(0,0));
    }

    @Test
    public void testMultiply1() {
        Calc calc = new Calc();
        int expected = 0;
        assertEquals(expected, calc.multiply(10,0));
    }

    @Test
    public void testMultiply2() {
        Calc calc = new Calc();
        int expected = 6;
        assertEquals(expected, calc.multiply(3,2));
    }

    @Test
    public void testMultiply3() {
        Calc calc = new Calc();
        int expected = 56;
        assertEquals(expected, calc.multiply(7,8));
    }

    @Test
    public void testDivide1() {
        Calc calc = new Calc();
        int expected = 1;
        assertEquals(expected, calc.divide(50,50));
    }

    @Test
    public void testDivide2() {
        Calc calc = new Calc();
        int expected = 3;
        assertEquals(expected, calc.divide(6,2));
    }

    @Test
    public void testDivide3() {
        Calc calc = new Calc();
        int expected = 8;
        assertEquals(expected, calc.divide(8,1));
    }

    @Test
    public void testPower1() {
        Calc calc = new Calc();
        int expected = 4;
        assertEquals(expected, calc.power(2,2), 0.001);
    }

    @Test
    public void testPower2() {
        Calc calc = new Calc();
        int expected = 27;
        assertEquals(expected, calc.power(3,3), 0.001);
    }

    @Test
    public void testPower3() {
        Calc calc = new Calc();
        int expected = 1;
        assertEquals(expected, calc.power(1,1), 0.001);
    }

}

// End of file
