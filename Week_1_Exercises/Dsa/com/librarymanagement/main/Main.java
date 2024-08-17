package com.librarymanagement.main;

import com.librarymanagement.model.Book;
import com.librarymanagement.search.Search;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
                new Book("B003", "1984", "George Orwell"),
                new Book("B004", "Pride and Prejudice", "Jane Austen"),
                new Book("B005", "The Catcher in the Rye", "J.D. Salinger")
        };

        // Linear search
        System.out.println("Linear Search:");
        Book foundBook = Search.linearSearchByTitle(books, "1984");
        System.out.println(foundBook != null ? foundBook : "Book not found");

        // Sorting books by title for binary search
        Arrays.sort(books, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));

        // Binary search
        System.out.println("Binary Search:");
        foundBook = Search.binarySearchByTitle(books, "1984");
        System.out.println(foundBook != null ? foundBook : "Book not found");
    }
}
