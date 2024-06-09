package src.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import src.entity.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, Long> {

}
