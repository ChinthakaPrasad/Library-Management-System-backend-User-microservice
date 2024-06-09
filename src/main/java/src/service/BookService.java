package src.service;

import src.dto.Book;

public interface BookService {
    public boolean addBook(Book book);
    public boolean updateBook(Book book);
    public boolean deleteBook(Long id);
}
