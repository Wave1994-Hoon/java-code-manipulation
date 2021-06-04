package com.example.proxyspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class DefaultBookService implements BookService{

    public void rent(Book book) {
        System.out.println(book.getTitle() + "");
    }
}
