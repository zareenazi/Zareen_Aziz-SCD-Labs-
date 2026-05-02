public class Main8 {
    public static void main(String[] args) {

        // Create array of Media
        Media[] library = new Media[3];

        // Fill array
        library[0] = new Book1("Java Programming", "Seemab Shoukat");
        library[1] = new Magazine("Tech Monthly", 5044);
        library[2] = new Book1("OOP Concepts", "Raheel Baig");

        // Loop through array and display details
        for (int i = 0; i < library.length; i++) {
            library[i].displayDetails();
            System.out.println("-------------------");
        }
    }
}