package com.example.spring6projectlombok.service;

import com.example.spring6projectlombok.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BookServiceImpl implements BookService {
    @Override
    public Book getBookByPageCount(int pageCount) {
        log.info("Get Book by page count - in service. count : " + pageCount);
        return Book.builder().pageCount(pageCount).title("Head First Java").author("Kathy Sierra").build();
    }
}
