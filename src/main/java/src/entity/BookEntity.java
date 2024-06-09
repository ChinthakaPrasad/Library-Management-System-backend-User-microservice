package src.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "Book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String category;
    private int qty;

    public BookEntity(String isbn, String title, String author, String category, int qty) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.qty = qty;
    }
}
