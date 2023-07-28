package com.itbulls.learnit.javacore.oop.hw.books;

public class BookService {
    
    // Method to filter books by author
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        // Check if the author or books array is null, return an empty array in that case
        if (author == null || books == null) {
            return new Book[0];
        }

        // Count the number of books that match the specified author
        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.hasAuthor(author)) {
                matchBooksAmount++;
            }
        }

        // Create an array to store the filtered books and copy matching books into it
        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.hasAuthor(author)) {
                filteredBooks[index++] = book;
            }
        }

        // Return the filtered array
        return filteredBooks;
    }

    // Method to filter books by publisher
    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        // Check if the publisher or books array is null, return an empty array in that case
        if (publisher == null || books == null) {
            return new Book[0];
        }

        // Count the number of books that have the specified publisher
        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                matchBooksAmount++;
            }
        }

        // Create an array to store the filtered books and copy matching books into it
        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                filteredBooks[index++] = book;
            }
        }

        // Return the filtered array
        return filteredBooks;
    }

    // Method to filter books published after a specified year
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        // Check if the books array is null, return an empty array in that case
        if (books == null) {
            return new Book[0];
        }

        // Count the number of books published after or in the specified year
        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                matchBooksAmount++;
            }
        }

        // Create an array to store the filtered books and copy matching books into it
        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                filteredBooks[index++] = book;
            }
        }

        // Return the filtered array
        return filteredBooks;
    }
}
