package com.mahesh.graphqldemo.services.impl;

import com.mahesh.graphqldemo.entities.Book;
import com.mahesh.graphqldemo.repositories.BookRepo;
import com.mahesh.graphqldemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(() -> {
            return new RuntimeException("Book with id " + bookId + " not present");
        });
    }
}
