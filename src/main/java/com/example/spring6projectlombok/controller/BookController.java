package com.example.spring6projectlombok.controller;

import com.example.spring6projectlombok.model.Book;
import com.example.spring6projectlombok.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    public Book getBookByPageCount(int pageCount) {
        log.info("getBookByPageCount in controller");
        return bookService.getBookByPageCount(pageCount);
    }
}
