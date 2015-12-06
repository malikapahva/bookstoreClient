package com.challengers;

/**
 * Created by darkstar on 12/5/15.
 * Class to hold values for book
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    //Attributes for the book
    private Long bookId;
    private String bookTitle;
    private Set<String> authorNames = new HashSet<>();
    private Set<String> publisherNames = new HashSet<>();
    private int publishedYear;
    private String isbn;
    private String language;
    private double price;
    private int quantity;
    private int sold;

    //Constructor for books
    public Book() {}

    //Methods for the book controller


    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Set<String> getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(Set<String> authorNames) {
        this.authorNames = authorNames;
    }

    public Set<String> getPublisherNames() {
        return publisherNames;
    }

    public void setPublisherNames(Set<String> publisherNames) {
        this.publisherNames = publisherNames;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorNames=" + authorNames +
                ", publisherNames=" + publisherNames +
                ", publishedYear=" + publishedYear +
                ", isbn='" + isbn + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", sold=" + sold +
                '}';
    }
}
