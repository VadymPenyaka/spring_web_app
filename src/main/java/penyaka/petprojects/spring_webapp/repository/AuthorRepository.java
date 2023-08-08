package penyaka.petprojects.spring_webapp.repository;

import org.springframework.data.repository.CrudRepository;
import penyaka.petprojects.spring_webapp.entity.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
