public class Book {
    String title;
    Author author;
    double price;
    Book(String t, Author a, double p){
        this.title = t;
        this.author = a;
        this.price = p;
    }
    protected void displayDetails(){
        System.out.println("Book's details:" );
        System.out.println("Title: " + title);
        System.out.println(author.displayInfo());
        System.out.println("Price: " + price);
    }
}
