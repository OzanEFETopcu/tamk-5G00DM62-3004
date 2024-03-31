package project;

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

}

// End of file
