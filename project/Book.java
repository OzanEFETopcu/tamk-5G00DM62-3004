/**
 * A class representing a book.
 */
public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private String genre;
    private boolean isAvailable;

    /**
     * Constructs a new Book object with the given details.
     *
     * @param title         the title of the book
     * @param author        the author of the book
     * @param yearPublished the year the book was published
     * @param genre         the genre of the book
     * @param isAvailable   indicates whether the book is available for borrowing
     */
    public Book(String title, String author, int yearPublished, String genre, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    /**
     * Gets the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the year the book was published.
     *
     * @return the year the book was published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Gets the genre of the book.
     *
     * @return the genre of the book
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Checks if the book is available for borrowing.
     *
     * @return true if the book is available, otherwise false
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability status of the book.
     *
     * @param available true if the book is available, otherwise false
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    /**
     * Sets the title of the book.
     *
     * @param titleUpdate is the name of the book
     */
    public void setTitle(String titleUpdate) {
        title = titleUpdate;
    }

    /**
     * Sets the author of the book.
     *
     * @param authorUpdate is the author of the book
     */
    public void setAuthor(String authorUpdate) {
        author = authorUpdate;
    }


    /**
     * Sets the yearPublished of the book.
     *
     * @param yearPublishedUpdate is the yearPublishedUpdate of the book
     */
    public void setYearPublished(int yearPublishedUpdate) {
        yearPublished = yearPublishedUpdate;
    }


    /**
     * Sets the genreUpdate of the book.
     *
     * @param genreUpdate is the genreUpdate of the book
     */
    public void setGenre(String genreUpdate) {
        genre = genreUpdate;
    }
}

// End of file
