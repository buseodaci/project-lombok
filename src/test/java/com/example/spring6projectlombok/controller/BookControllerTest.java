package com.example.spring6projectlombok.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookControllerTest {
    @Autowired
    BookController bookController;

    @Test
    void getBookByPageCount() {
        System.out.println(bookController.getBookByPageCount(800));
    }
}
