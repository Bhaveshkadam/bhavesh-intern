package book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;


    public class BookConfig {
        @Bean
        CommandLineRunner commandLineRunner(BookRepository repository ) {
            return args -> {
                Book pyton = new Book(
                        1L,
                        "PYTHON",
                        "Mark Lutz"
                );
                Book java = new Book(
                        1L,
                        "PYTHON",
                        "Mark Lutz"
                );
                Book rube = new Book(
                        1L,
                        "PYTHON",
                        "Mark Lutz"
                );
                repository.saveAll(
                        List.of(pyton, java, rube)
                );
            };
        }

    }
