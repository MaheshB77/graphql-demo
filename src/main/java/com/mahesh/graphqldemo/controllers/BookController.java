package com.mahesh.graphqldemo.controllers;

import com.mahesh.graphqldemo.dto.BookInput;
import com.mahesh.graphqldemo.entities.Book;
import com.mahesh.graphqldemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book bookEntity = new Book();
        bookEntity.setAuthor(book.getAuthor());
        bookEntity.setDescription(book.getDescription());
        bookEntity.setPages(book.getPages());
        bookEntity.setPrice(book.getPrice());
        bookEntity.setTitle(book.getTitle());
        return bookService.create(bookEntity);
    }

    @QueryMapping("allBooks")
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId) {
        return bookService.get(bookId);
    }
}
