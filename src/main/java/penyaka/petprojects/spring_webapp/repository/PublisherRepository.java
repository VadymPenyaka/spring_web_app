package penyaka.petprojects.spring_webapp.repository;

import org.springframework.data.repository.CrudRepository;
import penyaka.petprojects.spring_webapp.entity.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
