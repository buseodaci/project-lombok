package com.example.spring6projectlombok.service;

import com.example.spring6projectlombok.model.Book;

public interface BookService {
    Book getBookByPageCount(int pageCount);
}
