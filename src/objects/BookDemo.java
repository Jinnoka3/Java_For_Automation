package objects;

public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("Russel", "Winderand");
        author.displayInfo();
        System.out.println();
        Book book = new Book ("Developing Java Software", author, 79.75);
        book.displayDetails();
    }
}
