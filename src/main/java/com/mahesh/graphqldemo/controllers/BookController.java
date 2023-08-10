package com.mahesh.graphqldemo.controllers;

import com.mahesh.graphqldemo.entities.Book;
import com.mahesh.graphqldemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{bookId}")
    public Book get(@PathVariable int bookId) {
        return bookService.get(bookId);
    }
}
