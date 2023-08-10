package com.mahesh.graphqldemo;

import com.mahesh.graphqldemo.entities.Book;
import com.mahesh.graphqldemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlDemoApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookService.create(
				new Book(1, "Java", "Educational", "Durga", 500, 200)
		);
		bookService.create(
				new Book(2, "JavaScript", "Educational", "Colt Steele", 300, 400)
		);
		bookService.create(
				new Book(3, "Rich Dad Poor Dad", "Financial", "Robert", 900, 700)
		);
	}
}
