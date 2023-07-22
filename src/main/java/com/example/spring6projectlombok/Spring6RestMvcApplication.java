package com.example.spring6projectlombok;

import com.example.spring6projectlombok.model.Book;
import com.example.spring6projectlombok.service.BookServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring6RestMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring6RestMvcApplication.class, args);
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setAuthor("John Doe");
        book.setPageCount(350);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Page Count: " + book.getPageCount());

        System.out.println("-----------------");

        BookServiceImpl bookService = new BookServiceImpl();
        book = bookService.getBookByPageCount(800);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Page Count: " + book.getPageCount());
    }
}
