import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PrintTest {

    // Test cases for hello() method
    @Test
    public void testHello() {
        Print print = new Print();
        String expected = "\nHello User, this is the testing project there will be 9 separate classes\n"
                + "each with separate functionalities\n"
                + "there will be 9 separate classes\n"
                + "each with separate functionalities\n";
        assertEquals(expected, print.hello());
    }

    // Test cases for classChoiceMessage() method
    @Test
    public void testClassChoiceMessage() {
        Print print = new Print();
        assertEquals("Please choose a class to test with numbers from 1-9", print.classChoiceMessage());
    }

    // Test cases for thankYouMessage() method
    @Test
    public void testThankYouMessage() {
        Print print = new Print();
        assertEquals("Thank you for testing this application", print.thankYouMessage());
    }

    // Test cases for repeatCheck() method
    @Test
    public void testRepeatCheck() {
        Print print = new Print();
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        assertEquals("1", print.repeatCheck());
    }

    // Test case for directUserToClass() method
    @Test
    public void testDirectUserToClass() {
        Print print = new Print();
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        print.directUserToClass();
        String actualOutput = outContent.toString().replaceAll("\\r?\\n", ""); // Remove newline characters
        assertEquals("Username is: 5", actualOutput);
    }

    // Test case for hello() method with a different message
    @Test
    public void testHelloDifferentMessage() {
        Print print = new Print();
        String expected = "\nWelcome to the testing project. There are 9 classes available for testing.\n"
                + "Each class has distinct functionalities.\n";
        assertNotEquals(expected, print.hello());
    }

    // Test case for classChoiceMessage() method with a different message
    @Test
    public void testClassChoiceMessageDifferent() {
        Print print = new Print();
        assertNotEquals("Choose a class (1-9) for testing", print.classChoiceMessage());
    }

    // Test case for thankYouMessage() method with a different message
    @Test
    public void testThankYouMessageDifferent() {
        Print print = new Print();
        assertNotEquals("Thanks for trying out this app", print.thankYouMessage());
    }

    // Test case for repeatCheck() method when user does not want to continue
    @Test
    public void testRepeatCheckNoContinue() {
        Print print = new Print();
        ByteArrayInputStream in = new ByteArrayInputStream("0".getBytes());
        System.setIn(in);
        assertEquals("0", print.repeatCheck());
    }

    // Test case for repeatCheck() method when user input is not "1"
    @Test(expected = IllegalArgumentException.class)
    public void testRepeatCheckInvalidInput() {
        Print print = new Print();
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);
        assertEquals("2", print.repeatCheck());
    }

    // Test case for hello() method with empty message
    @Test
    public void testHelloEmpty() {
        Print print = new Print();
        String expected = "";
        assertNotEquals(expected, print.hello());
    }

    // Test case for classChoiceMessage() method with empty message
    @Test
    public void testClassChoiceMessageEmpty() {
        Print print = new Print();
        assertNotEquals("", print.classChoiceMessage());
    }

    // Test case for thankYouMessage() method with empty message
    @Test
    public void testThankYouMessageEmpty() {
        Print print = new Print();
        assertNotEquals("", print.thankYouMessage());
    }

    // Test case for repeatCheck() method when user wants to continue
    @Test
    public void testRepeatCheckContinue() {
        Print print = new Print();
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        assertEquals("1", print.repeatCheck());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatCheckNonNumericInput() {
        Print print = new Print();
        ByteArrayInputStream in = new ByteArrayInputStream("abc".getBytes());
        System.setIn(in);
        assertEquals("abc", print.repeatCheck());
    }

    @Test(expected = NumberFormatException.class)
    public void testDirectUserToClassWithNonNumericInput() {
        Print print = new Print();
        System.setIn(new java.io.ByteArrayInputStream("abc\n".getBytes()));
        print.directUserToClass();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatCheckWithInvalidInput() {
        Print print = new Print();
        System.setIn(new java.io.ByteArrayInputStream("abc\n".getBytes()));
        print.repeatCheck();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimulateNetworkConnectionWithInvalidDuration() throws InterruptedException {
        Print print = new Print();
        print.simulateNetworkConnection(-1); // Passing negative duration
    }
}

// End of file
