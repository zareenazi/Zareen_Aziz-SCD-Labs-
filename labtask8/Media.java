public class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
    }
}