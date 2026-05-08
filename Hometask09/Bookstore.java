import java.util.*;

class Book {
    // Encapsulated data
    private String title;
    private double price;
    private int quantity;

    public Book(String title, double price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Move Method Refactoring
    // This method now belongs to Book class
    public double applyDiscount(double percentage) {
        return price - (price * percentage / 100);
    }

    // Inline Method Refactoring
    // Removed isSoldOut() method
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Bookstore {

    // Encapsulate Collection Refactoring
    private List<Book> inventory = new ArrayList<>();

    // Method to safely add books
    public void addBook(Book book) {
        inventory.add(book);
    }

    // Read-only access to inventory
    public List<Book> getInventory() {
        return Collections.unmodifiableList(inventory);
    }

    public void displayInventory() {
        for (Book b : inventory) {

            // Inlined isSoldOut() method
            if (b.getQuantity() <= 0) {
                System.out.println(b.getTitle() + " is out of stock.");
            } else {
                System.out.println(b.getTitle() + " - $" + b.getPrice());
            }
        }
    }

    public static void main(String[] args) {

        Bookstore store = new Bookstore();

        Book b1 = new Book("Java Basics", 500, 10);
        Book b2 = new Book("Python Guide", 700, 0);

        store.addBook(b1);
        store.addBook(b2);

        store.displayInventory();

        // Applying discount
        double discountedPrice = b1.applyDiscount(20);

        System.out.println("Discounted Price: $" + discountedPrice);
    }
}