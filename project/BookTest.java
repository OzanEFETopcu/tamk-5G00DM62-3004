import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BookTest {

    @Test
    public void testBookConstructorAndGetters() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", true);

        assertEquals("Java Programming", book.getTitle());
        assertEquals("John Doe", book.getAuthor());
        assertEquals(2020, book.getYearPublished());
        assertEquals("Programming", book.getGenre());
        assertTrue(book.isAvailable());
    }

    @Test
    public void testSetAvailable() {
        Book book = new Book("Python Basics", "Jane Smith", 2019, "Programming", false);

        assertFalse(book.isAvailable());
        book.setAvailable(true);
        assertTrue(book.isAvailable());
    }

    @Test
    public void testGetTitleEmpty() {
        Book book = new Book("", "John Doe", 2020, "Programming", true);

        assertEquals("", book.getTitle());
    }

    @Test
    public void testGetAuthorEmpty() {
        Book book = new Book("Java Programming", "", 2020, "Programming", true);

        assertEquals("", book.getAuthor());
    }

    @Test
    public void testGetYearPublishedZero() {
        Book book = new Book("Java Programming", "John Doe", 0, "Programming", true);

        assertEquals(0, book.getYearPublished());
    }

    @Test
    public void testGetGenreEmpty() {
        Book book = new Book("Java Programming", "John Doe", 2020, "", true);

        assertEquals("", book.getGenre());
    }

    @Test
    public void testIsAvailableFalse() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", false);

        assertFalse(book.isAvailable());
    }

    @Test
    public void testSetAvailableTwice() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", true);

        assertTrue(book.isAvailable());
        book.setAvailable(false);
        assertFalse(book.isAvailable());
        book.setAvailable(true);
        assertTrue(book.isAvailable());
    }

    @Test
    public void testGettersAndSettersWithMixedValues() {
        Book book = new Book("", "", 0, "", false);

        assertEquals("", book.getTitle());
        assertEquals("", book.getAuthor());
        assertEquals(0, book.getYearPublished());
        assertEquals("", book.getGenre());
        assertFalse(book.isAvailable());

        book.setTitle("Python Programming");
        book.setAuthor("Jane Smith");
        book.setYearPublished(2021);
        book.setGenre("Programming");
        book.setAvailable(true);

        assertEquals("Python Programming", book.getTitle());
        assertEquals("Jane Smith", book.getAuthor());
        assertEquals(2021, book.getYearPublished());
        assertEquals("Programming", book.getGenre());
        assertTrue(book.isAvailable());
    }

    @Test
    public void testSetYearPublishedNegative() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", true);

        book.setYearPublished(-2022);
        assertEquals(-2022, book.getYearPublished());
    }

    @Test
    public void testSetAvailableToFalse() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", true);

        book.setAvailable(false);
        assertFalse(book.isAvailable());
    }

    @Test
    public void testSetTitleWithWhitespace() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", true);

        book.setTitle("   Introduction to Python  ");
        assertEquals("   Introduction to Python  ", book.getTitle());
    }

    @Test
    public void testSetAuthorWithWhitespace() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", true);

        book.setAuthor("   Jane Smith  ");
        assertEquals("   Jane Smith  ", book.getAuthor());
    }

    @Test
    public void testSetGenreWithWhitespace() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", true);

        book.setGenre("   Computer Science  ");
        assertEquals("   Computer Science  ", book.getGenre());
    }

    @Test
    public void testSetTitleAndAuthorAndGenreToNull() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", true);

        book.setTitle(null);
        book.setAuthor(null);
        book.setGenre(null);
        assertNull(book.getTitle());
        assertNull(book.getAuthor());
        assertNull(book.getGenre());
    }

    @Test
    public void testSetAvailabilityToTrueThenFalse() {
        Book book = new Book("Java Programming", "John Doe", 2020, "Programming", true);

        assertTrue(book.isAvailable());
        book.setAvailable(false);
        assertFalse(book.isAvailable());
    }
}

// End of file
