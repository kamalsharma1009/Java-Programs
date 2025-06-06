import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;

    // Constructor 1: No arguments
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Constructor 2: Title only
    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor 3: Title and Author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor 4: Title, Author, and Price
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

public class Books {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("The Alchemist");
        Book b3 = new Book("1984", "George Orwell");
        Book b4 = new Book("Clean Code", "Robert C. Martin", 35.99);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
