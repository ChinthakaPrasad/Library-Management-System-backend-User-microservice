package src.service.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import src.dto.Book;
import src.entity.BookEntity;
import src.repository.BookRepository;
import src.service.BookService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    private ModelMapper modelMapper;

    @Bean
    private void setup(){
        this.modelMapper = new ModelMapper();
    }

    @Override
    public boolean addBook(Book book) {
        BookEntity bookEntity = modelMapper.map(book, BookEntity.class);
        bookRepository.save(bookEntity);
        return true;
    }

    @Override
    public boolean updateBook(Book book) {
        return false;
    }

    @Override
    public boolean deleteBook(Long id) {
        return false;
    }

    @Override
    public List<Book> getAllBooks() {
        List<BookEntity> allBooks = (List<BookEntity>) bookRepository.findAll();
        List<Book> allBooksDto = new ArrayList<>();

        for(BookEntity bookEntity: allBooks){
            Book book = modelMapper.map(bookEntity, Book.class);
            allBooksDto.add(book);
        }
        return allBooksDto;

    }
}
