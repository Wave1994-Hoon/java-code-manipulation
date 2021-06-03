package com.example.proxyspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceProxy implements BookService {

    @Autowired @Qualifier("defaultBookService")
    BookService BookService;

    @Override
    public void rent(Book book) {

    }
}
