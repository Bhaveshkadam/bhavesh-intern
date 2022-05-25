package books;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    public List<Book> getBook() {
        return List.of(new Book(1l, "python","Mark Lutz")
        );
    }
}

