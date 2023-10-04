package com.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> booksList;

    public Library() {
        // TODO: Initialize the list of books
        this.booksList = new ArrayList<Book>();

    }

    // TODO: Implement methods to add a book, check out a book, return a book, and find a book by ISBN
    public void addBook(Book book) {
        booksList.add(book);
    }

    public void removeBook(Book book) {
        booksList.remove(book);
    }

    public Book findBookByISBN(String ISBN) {
        for (Book book : booksList) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null; 
    }


}
