public class Book {
    // Private fields
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor A: title + author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // default
    }

    // Constructor B: title only
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.isAvailable = true; // default
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println("Error: " + title + " is already borrowed.");
        }
    }

    // Method to return book
    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}