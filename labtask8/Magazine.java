public class Magazine extends Media {
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Issue Number: " + issueNumber);
    }
}