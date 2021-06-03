package com.example.proxyspring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void di() {
        assertNotNull(bookRepository);

        Book book = new Book();
        book.setTitle("spring");
        bookRepository.save(book);
        bookRepository.findAll();
    }

}
