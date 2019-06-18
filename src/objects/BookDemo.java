public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("Russel", "Winderand");
        Book book = new Book ("Developing Java Software", author, 79.75);
        book.displayDetails();
        Scanner in = new Scanner(System.in);
        System.out.println("Input Author's name: ");
        String name = in.nextLine();
        System.out.println("Input Author's last name: ");
        String lastName = in.nextLine();
        Author author2 = new Author(name, lastName);
        System.out.println("input title: ");
        String title = in.nextLine();
        System.out.println("input price: ");
        String price = in.nextLine();
        double p = Double.parseDouble(price);
        Book book2 = new Book (title, author2, p);
        book2.displayDetails();
    }
}
