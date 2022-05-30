package book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class BookService {

    private final BookRepository  bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository =bookRepository;
    }

    public List<Book> getBook() {
        return bookRepository.findAll();
    }
}
