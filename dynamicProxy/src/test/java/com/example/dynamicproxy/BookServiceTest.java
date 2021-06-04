package com.example.dynamicproxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


class BookServiceTest {

    /* 클래스 기반으로 다이나믹 프록시를 못만든다, 무조건 인터페이스로만 해야한다.*/
    BookService bookService = (BookService) Proxy.newProxyInstance(
            BookService.class.getClassLoader(),
            new Class[]{BookService.class},
            new InvocationHandler() {
                BookService bookService = new DefaultBookService();
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if (method.getName().equals("rent")) {
                        System.out.println("aaaaaaaa");
                        Object invoke = method.invoke(bookService, args);
                        System.out.println("bbbbbbbb");
                        return invoke;
                    }

                    return method.invoke(bookService, args);
                }
            }
    );

    @Test
    public void di() {
        Book book = new Book();
        book.setTitle("spring");
        bookService.rent(book);
    }

}