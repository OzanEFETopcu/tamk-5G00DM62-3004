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

    /**
     * Checks if the book title is a question mark.
     *
     * @throws IllegalArgumentException if the book title is a question mark (?)
     */
    public boolean isTitleQuestion() throws IllegalArgumentException {
        if (title.equals("?")) {
            throw new IllegalArgumentException("Book title cannot be a question mark");
        }
        return title.contains("?");
    }

    /**
     * Borrows the book (sets availability to false).
     *
     * @throws IllegalStateException if the book is already unavailable
     */
    public void borrowBook() throws IllegalStateException {
        if (!isAvailable) {
            throw new IllegalStateException("Book is already unavailable for borrowing");
        }
        isAvailable = false;
    }

    /**
     * Gets the content of a specific chapter (not implemented).
     *
     * @param chapterNumber the chapter number (1-based)
     * @throws UnsupportedOperationException always throws this exception as chapter
     *                                       access is not implemented
     */
    public String getChapter(int chapterNumber) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Chapter access not implemented");
    }

    /**
     * Sets the summary of the book (restricted length).
     *
     * @param summary the summary of the book
     * @throws IllegalArgumentException if the summary is longer than 200 characters
     */
    public void setSummary(String summary) throws IllegalArgumentException {
        if (summary.length() > 200) {
            throw new IllegalArgumentException("Summary cannot be longer than 200 characters");
        }
        // Set the summary (implementation omitted)
    }

    /**
     * Rates the book (valid ratings: 1-5).
     *
     * @param rating the rating of the book (1-5)
     * @throws IllegalArgumentException if the rating is outside the valid range
     *                                  (1-5)
     */
    public void rateBook(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        // Record the rating (implementation omitted)
    }

}

// End of file
