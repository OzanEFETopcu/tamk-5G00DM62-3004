import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleStringManipulationTest {

    // Test cases for countVowels() method
    @Test
    public void testCountVowels() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("Hello World");
        assertEquals(3, ssm.countVowels());
    }

    @Test
    public void testCountVowelsEmptyString() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("");
        assertEquals(0, ssm.countVowels());
    }

    @Test
    public void testCountVowelsNoVowels() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("xyz");
        assertEquals(0, ssm.countVowels());
    }

    // Test cases for reverseString() method
    @Test
    public void testReverseString() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("Hello World");
        assertEquals("dlroW olleH", ssm.reverseString());
    }

    @Test
    public void testReverseStringEmptyString() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("");
        assertEquals("", ssm.reverseString());
    }

    @Test
    public void testReverseStringSingleCharacter() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("a");
        assertEquals("a", ssm.reverseString());
    }

    // Test cases for capitalizeFirstLetter() method
    @Test
    public void testCapitalizeFirstLetter() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("hello world");
        assertEquals("Hello world", ssm.capitalizeFirstLetter());
    }

    @Test
    public void testCapitalizeFirstLetterEmptyString() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("");
        assertEquals("", ssm.capitalizeFirstLetter());
    }

    @Test
    public void testCapitalizeFirstLetterAlreadyCapitalized() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("Hello world");
        assertEquals("Hello world", ssm.capitalizeFirstLetter());
    }

    // Test cases for containsSubstring() method
    @Test
    public void testContainsSubstring() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("Hello world");
        assertTrue(ssm.containsSubstring("world"));
    }

    @Test
    public void testContainsSubstringEmptyString() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("");
        assertFalse(ssm.containsSubstring("world"));
    }

    @Test
    public void testContainsSubstringNotFound() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("Hello world");
        assertFalse(ssm.containsSubstring("universe"));
    }

    // Test cases for concatenateString() method
    @Test
    public void testConcatenateString() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("Hello ");
        assertEquals("Hello World", ssm.concatenateString("World"));
    }

    @Test
    public void testConcatenateStringEmptyString() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("");
        assertEquals("World", ssm.concatenateString("World"));
    }

    @Test
    public void testConcatenateStringEmptyOtherString() {
        SimpleStringManipulation ssm = new SimpleStringManipulation("Hello");
        assertEquals("Hello", ssm.concatenateString(""));
    }
}

