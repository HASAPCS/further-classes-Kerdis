package com.example;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean checkedOut;

    public Book(String title, String author, String ISBN) {
        // TODO: Initialize the attributes
        this.title = title;
        this.author = author; 
        this.ISBN = ISBN;
        this.checkedOut = false;
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
    public String getTitle() {
        return title;
    }
       
    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void getAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void getISBN(String newISBN) {
        this.ISBN = newISBN;
    }

    public void isCheckedOut(boolean newIsCheckedOUt) {
        this.checkedOut = newIsCheckedOUt;
    }


}
