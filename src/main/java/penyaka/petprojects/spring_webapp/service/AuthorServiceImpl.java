package penyaka.petprojects.spring_webapp.service;

import org.springframework.stereotype.Service;
import penyaka.petprojects.spring_webapp.entity.Author;
import penyaka.petprojects.spring_webapp.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
