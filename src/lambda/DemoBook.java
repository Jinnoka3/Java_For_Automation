package lambda;

import objects.objects1.Author;
import objects.objects1.Book;

import java.util.*;
import java.util.stream.Collectors;

public class DemoBook {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("The Dark Tower", new Author("Stephen", "King"), 200));
        books.add(new Book("The Lord of the Rings", new Author("John", "Tolkien"), 300));
        books.add(new Book("The Black Company", new Author("Glen", "Cook"), 100));
        books.add(new Book("Next of Kin", new Author("John", "Boyne"), 50));
        books.add(new Book("The Silmarillion", new Author("John", "Tolkien"), 300));
        books.add(new Book("The Hobbit", new Author("John", "Tolkien"), 300));
        books.add(new Book("Something", new Author("John", "Boyne"), 50));

        //1
        System.out.println("Book with the highest price:");
        Comparator<Book> bookPrice = Comparator.comparingInt(p -> (int) p.getPrice());
        Optional<Book> max = books.stream().max(bookPrice);
        max.ifPresent(System.out::println);
        System.out.println();

        //2
        System.out.println("All books written by an author:");
        Map<Author, String> group = books.stream().collect(
                Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getTitle, Collectors.joining(", ")))); // comma is more beautiful

       for (Map.Entry<Author, String> item : group.entrySet()) {
           System.out.println();
           System.out.println(item.getKey() + ": " + item.getValue());
        }
        System.out.println();

            //3
            System.out.println("Sorted by the author's full name:");
            Comparator<Book> comparator = Comparator.comparing(b -> b.getAuthor().getFirstName());
            comparator = comparator.thenComparing(b -> b.getAuthor().getLastName());
            books.stream()
                    .sorted(comparator)
                    .forEach(System.out::println);
            System.out.println();

            //4
            System.out.println("Sum of prices:");
            double sum = books.stream()
                    .mapToDouble(b -> Double.parseDouble(String.valueOf(b.getPrice())))
                    .sum();
            System.out.println(sum);
        }
    }

