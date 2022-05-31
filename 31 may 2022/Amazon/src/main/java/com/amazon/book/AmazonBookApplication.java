package com.amazon.book;

import book.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class AmazonBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonBookApplication.class, args);
	}

//	@GetMapping
//	public List<Book> book() {
//		return List.of(
//				new Book(
//						1l, "python", "Mark Lutz"
//				)
//		);
//	}
}

