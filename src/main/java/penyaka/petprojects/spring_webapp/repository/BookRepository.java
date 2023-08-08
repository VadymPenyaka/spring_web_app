package penyaka.petprojects.spring_webapp.repository;

import org.springframework.data.repository.CrudRepository;
import penyaka.petprojects.spring_webapp.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
