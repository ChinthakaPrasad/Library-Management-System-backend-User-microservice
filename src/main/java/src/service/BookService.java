package src.service;

import src.dto.Book;
import src.entity.BookEntity;

import java.util.List;

public interface BookService {
    public boolean addBook(Book book);
    public boolean updateBook(Book book);
    public boolean deleteBook(Long id);
    public List<Book> getAllBooks();
}
