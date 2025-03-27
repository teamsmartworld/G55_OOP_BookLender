package se.lexicon;

class Book {
    // Static sequencer to auto-generate unique IDs for books
    private static int sequencer = 0;
    private int id;
    private String title;
    private String author;
    private boolean available;

    // Constructor to initialize a book with a unique ID and availability set to true
    public Book(String title, String author) {
        this.id = ++sequencer;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter and Setter for Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for Author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for Availability status
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to return a book
    public void returnBook() {
        if (!available) {
            this.available = true;
            System.out.println("The book '" + title + "' has been returned and is now available.");
        } else {
            System.out.println("The book '" + title + "' was not borrowed.");
        }
    }

    // toString method for displaying book details
    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title='" + title + '\'' + ", author='" + author + '\'' + ", available=" + available + '}';
    }
}