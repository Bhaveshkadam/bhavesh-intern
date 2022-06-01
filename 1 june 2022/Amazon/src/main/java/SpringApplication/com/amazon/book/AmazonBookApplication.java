package SpringApplication.com.amazon.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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

