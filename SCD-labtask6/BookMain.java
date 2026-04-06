public class BookMain {
    public static void main(String[] args) {

        // Creating objects
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Data Structures");

        // Borrow first book twice
        book1.borrowBook();   // First time (success)
        book1.borrowBook();   // Second time (error)

        // Return and borrow again
        book1.returnBook();
        book1.borrowBook();

        // Print status of both books
        System.out.println("\n--- Book Status ---");

        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Available: " + book1.isAvailable());

        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Available: " + book2.isAvailable());
    }
}