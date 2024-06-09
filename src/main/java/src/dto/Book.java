package src.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String category;
    private int qty;

    public Book(String isbn, String title, String author, String category, int qty) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.qty = qty;
    }
}
