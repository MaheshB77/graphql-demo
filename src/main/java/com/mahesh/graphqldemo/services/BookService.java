package com.mahesh.graphqldemo.services;

import com.mahesh.graphqldemo.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    public Book create(Book book);
    public List<Book> getAll();
    public Book get(int bookId);

}
