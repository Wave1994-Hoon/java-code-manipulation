package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Book> bookClass = Book.class; // 인스턴스 생성

        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        Class<?> aClass1 = Class.forName("org.example.Book"); // FQCN 으로 인스턴스 생성 가능

        Arrays.stream(bookClass.getFields()).forEach(System.out::println); // 필드들 가져옴 (public만)
        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println); // 필드들 가져옴

        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println); // 애노테이션 조회

        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            Arrays.stream(f.getAnnotations()).forEach(a -> {
                if (a instanceof MyAnnotation) {
                    MyAnnotation myAnnotation = (MyAnnotation) a;
                    System.out.println(myAnnotation.number());
                    System.out.println(myAnnotation.name());
                }
            });
        });

        Class<?> bookClass2 = Class.forName("org.example.Book");
        Constructor<?> constructor = bookClass2.getConstructor(null);
        Book book1 = (Book) constructor.newInstance();

    }
}
