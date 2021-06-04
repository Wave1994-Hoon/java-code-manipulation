package com.example.dynamicproxy;

public class DefaultBookService implements BookService {

    public void rent(Book book) {
        System.out.println(book.getTitle() + "");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("return book: " + book.getTitle() );
    }
}
