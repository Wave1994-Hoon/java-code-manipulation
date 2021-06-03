package com.example.proxyspring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class BookServiceTest {

    @Autowired
    BookService bookService;

    @Test
    public void di() {
        Book book = new Book();
        book.setTitle("spring");
        bookService.rent(book);
    }

}