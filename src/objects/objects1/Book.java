package objects.objects1;
public class Book {

    private String title;
    private Author author;
    private double price;

    public Book(String t, Author a, double p){
        this.title = t;
        this.author = a;
        this.price = p;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double age) {
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Book's details:" );
        System.out.println("Title: " + title);
        System.out.println(author.displayInfo());
        System.out.println("Price: " + price);
    }

    @Override
    public String toString() {
        return "Author's name: " + this.getAuthor() +"\nTitle: " + this.title + "\nPrice: " + this.price;
    }

}
