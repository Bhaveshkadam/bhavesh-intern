package com.spring.SpringApplication;

import com.spring.SpringApplication.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1l, "bhavesh", "bhavsh.gmail@gmail.com", LocalDate.of (2000, Month.MARCH, 5),21
				)
		);

	}

}


