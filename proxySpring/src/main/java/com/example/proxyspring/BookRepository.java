package com.example.proxyspring;

import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
    void save(Book book);

    void findAll();
}
