public class Book1 extends Media {
    private String author;

    public Book1(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}