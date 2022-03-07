package Beginner.OOP.hw3;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(new Author("King"), new Content("Cary"), new Title("Story"));

        book.show();
    }
}
