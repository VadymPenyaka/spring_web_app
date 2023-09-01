package penyaka.petprojects.spring_webapp.service;

import org.springframework.stereotype.Service;
import penyaka.petprojects.spring_webapp.entity.Publisher;
import penyaka.petprojects.spring_webapp.repository.PublisherRepository;

@Service
public class PublisherServiceImpl implements PublisherService{
    public final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Iterable<Publisher> findAll() {
        return publisherRepository.findAll();
    }
}
