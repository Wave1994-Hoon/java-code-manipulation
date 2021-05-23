package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws ClassNotFoundException {
        Class<Book> bookClass = Book.class; // 인스턴스 생성

        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        Class<?> aClass1 = Class.forName("org.example.Book"); // FQCN 으로 인스턴스 생성 가능

        Arrays.stream(bookClass.getFields()).forEach(System.out::println); // 필드들 가져옴 (public만)
        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println); // 필드들 가져옴
    }
}
