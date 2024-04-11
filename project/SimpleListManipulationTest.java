import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleListManipulationTest {

    // Test cases for addNumber() method
    @Test
    public void testAddNumber() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        assertTrue(slm.containsNumber(5));
    }

    @Test
    public void testAddNumberDuplicate() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        slm.addNumber(5);
        assertEquals(10, slm.sumAllNumbers());
    }

    @Test
    public void testAddNumberMultiple() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        slm.addNumber(10);
        slm.addNumber(15);
        assertEquals(30, slm.sumAllNumbers());
    }

    // Test cases for removeNumber() method
    @Test
    public void testRemoveNumber() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        assertTrue(slm.removeNumber(5));
        assertFalse(slm.containsNumber(5));
    }

    @Test
    public void testRemoveNumberNotFound() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        assertFalse(slm.removeNumber(10));
    }

    @Test
    public void testRemoveNumberMultiple() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        slm.addNumber(10);
        assertTrue(slm.removeNumber(10));
        assertEquals(5, slm.sumAllNumbers());
    }

    // Test cases for sumAllNumbers() method
    @Test
    public void testSumAllNumbers() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        slm.addNumber(10);
        assertEquals(15, slm.sumAllNumbers());
    }

    @Test
    public void testSumAllNumbersEmptyList() {
        SimpleListManipulation slm = new SimpleListManipulation();
        assertEquals(0, slm.sumAllNumbers());
    }

    @Test
    public void testSumAllNumbersNegativeValues() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(-5);
        slm.addNumber(-10);
        assertEquals(-15, slm.sumAllNumbers());
    }

    // Test cases for findMaxNumber() method
    @Test
    public void testFindMaxNumber() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        slm.addNumber(10);
        assertEquals(10, slm.findMaxNumber());
    }

    @Test
    public void testFindMaxNumberEmptyList() {
        SimpleListManipulation slm = new SimpleListManipulation();
        assertEquals(Integer.MIN_VALUE, slm.findMaxNumber());
    }

    @Test
    public void testFindMaxNumberNegativeValues() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(-5);
        slm.addNumber(-10);
        assertEquals(-5, slm.findMaxNumber());
    }

    // Test cases for containsNumber() method
    @Test
    public void testContainsNumber() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        assertTrue(slm.containsNumber(5));
    }

    @Test
    public void testContainsNumberNotFound() {
        SimpleListManipulation slm = new SimpleListManipulation();
        slm.addNumber(5);
        assertFalse(slm.containsNumber(10));
    }

    @Test
    public void testContainsNumberEmptyList() {
        SimpleListManipulation slm = new SimpleListManipulation();
        assertFalse(slm.containsNumber(5));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNumberNegativeIndex() {
        SimpleListManipulation list = new SimpleListManipulation();
        list.addNumber(5);
        list.getNumber(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveNumberByIndexOutOfBounds() {
        SimpleListManipulation list = new SimpleListManipulation();
        list.removeNumberByIndex(0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetAverageWithEmptyList() {
        SimpleListManipulation list = new SimpleListManipulation();
        list.getAverage();
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideAllNumbersWithEmptyList() {
        SimpleListManipulation list = new SimpleListManipulation();
        list.divideAllNumbers();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNumberWithNegativeIndex() {
        SimpleListManipulation list = new SimpleListManipulation();
        list.getNumber(-1);
    }
}
