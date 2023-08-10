package com.mahesh.graphqldemo.repositories;

import com.mahesh.graphqldemo.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
